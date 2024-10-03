package javaTestCases;

import java.util.ArrayList;

public class TestCases<CaseType, ResultType> {
   static final String ANSI_RESET = "\u001B[0m";
   static final String ANSI_RED = "\u001B[31m";
   static final String ANSI_GREEN = "\u001B[32m";
   static final String ANSI_RED_BACKGROUND = "\u001B[41m";
   static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
   
   ArrayList<Tuple<CaseType, ResultType>> tests;
   SolutionToProblem<CaseType, ResultType> solution;
   public TestCases(SolutionToProblem<CaseType, ResultType> solution) {
      tests = new ArrayList<>();
      this.solution = solution;
   }

   public void add(CaseType testCase, ResultType testSolution) {
      tests.add(new Tuple<>(testCase, testSolution));
   }

   boolean runTestCase(Tuple<CaseType, ResultType> test) {
      return solution.solution(test.x).equals(test.y);
   }

   public void runTestCases() {
      int numOfTestCases = tests.size();
      int correctAnswers = 0;

      for (Tuple<CaseType, ResultType> test : tests) {
         ResultType result = solution.solution(test.x);

         if (result.equals(test.y)) {
            System.out.println(ANSI_GREEN_BACKGROUND + " PASSED " + ANSI_RESET + "  " + test.x + ": " + ANSI_GREEN + result);
            correctAnswers++;
         }
         else {
            System.out.println(ANSI_RED_BACKGROUND + " FAILED " + ANSI_RESET + "  " + test.x + ": " + ANSI_RED + result);
            System.out.println(ANSI_RED_BACKGROUND + "        " + ANSI_RESET + "  Correct answer: " + ANSI_GREEN + test.y);
         }
      }
      System.out.println();
      
      if (correctAnswers == numOfTestCases) {
         System.out.println(ANSI_GREEN_BACKGROUND + "ALL TEST CASES PASSED!" + ANSI_RESET);
      }
      else {
         System.out.println(ANSI_RED_BACKGROUND + "SOLUTION WRONG " + correctAnswers + "/" + numOfTestCases + " PASSED:" + ANSI_RESET);
         System.out.println();

         //progress bar
         int progressBarSize = 30;
         String progressBar;
         String border = "══"; //! NOT A EQUALS SIGN
         if (correctAnswers == 0) {
            progressBar = ANSI_RED_BACKGROUND;
            for (int i = 0; i < progressBarSize; i++) {
               progressBar += " ";
               border += "═"; //! NOT A EQUALS SIGN
            }
         }
         else {
            progressBar = ANSI_GREEN_BACKGROUND;
            int numOfGreenSquares = ((int) Math.ceil((double)progressBarSize / numOfTestCases)) * correctAnswers - 1;
            for (int i = 0; i < progressBarSize; i++) {
               if (numOfGreenSquares == i) {
                  progressBar += ANSI_RED_BACKGROUND + " ";
               }
               else {
                  progressBar += " ";
               }
               border += "═"; //! NOT A EQUALS SIGN
            }
         }
         System.out.println("╔" + border + "╗");
         System.out.println("║ " + progressBar + ANSI_RESET + " ║");
         System.out.println("╚" + border + "╝");
      }
   }
}
