import java.util.ArrayList;

public class Main {
   static final String ANSI_RESET = "\u001B[0m";
   static final String ANSI_RED = "\u001B[31m";
   static final String ANSI_GREEN = "\u001B[32m";
   static final String ANSI_RED_BACKGROUND = "\u001B[41m";
   static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

   public static void main(String[] args) {
      ArrayList<Tuple<String, String>> testCases = new ArrayList<Tuple<String, String>>();

      testCases.add(new Tuple<String,String>("oohovoujkbnsaipnsk", "oho"));
      testCases.add(new Tuple<String,String>("sndoab", "s"));
      testCases.add(new Tuple<String,String>("nsdcinanijnjeb", "inani"));
      testCases.add(new Tuple<String,String>("koao", "oao"));

      int numOfTestCases = testCases.size();
      int correctAnswers = 0;
      Solution solution = new Solution();
      for (Tuple<String, String> testCase : testCases) {
         String result = solution.longestPalindrome(testCase.x);
         if (result.equals(testCase.y)) {
            System.out.println(ANSI_GREEN_BACKGROUND + " CORRECT " + ANSI_RESET + "  " + testCase.x + ": " + ANSI_GREEN + result);
            correctAnswers++;
         }
         else {
            System.out.println(ANSI_RED_BACKGROUND + "  WRONG  " + ANSI_RESET + "  " + testCase.x + ": " + ANSI_RED + result);
            System.out.println(ANSI_RED_BACKGROUND + "         " + ANSI_RESET + "  Correct answer: " + ANSI_GREEN + testCase.y);
         }
      }
      System.out.println();
      if (correctAnswers == numOfTestCases) {
         System.out.println(ANSI_GREEN_BACKGROUND + "ALL TEST CASES PASSED!" + ANSI_RESET);
      }
      else {
         System.out.println(ANSI_RED_BACKGROUND + "SOLUTION WRONG " + correctAnswers + "/" + numOfTestCases + " PASSED:" + ANSI_RESET);
         System.out.println();

         int progressBarSize = 10;
         String progressBar;
         if (correctAnswers == 0) {
            progressBar = ANSI_RED_BACKGROUND;
            for (int i = 0; i < progressBarSize; i++) {
               progressBar += "#";
            }
         }
         else {
            progressBar = ANSI_GREEN_BACKGROUND;
            int numOfGreenSquares = ((int) Math.ceil((double)progressBarSize / numOfTestCases)) * correctAnswers - 1;
            for (int i = 0; i < progressBarSize; i++) {
               if (numOfGreenSquares == i) {
                  progressBar += ANSI_RED_BACKGROUND + "#";
               }
               else {
                  progressBar += "#";
               }
            }
         }
         System.out.println("[ " + progressBar + ANSI_RESET + " ]");
      }
   }
}