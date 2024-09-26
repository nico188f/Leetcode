import java.util.ArrayList;

public class Main {
   static final String ANSI_RESET = "\u001B[0m";
   static final String ANSI_RED = "\u001B[31m";
   static final String ANSI_GREEN = "\u001B[32m";
   static final String ANSI_RED_BACKGROUND = "\u001B[41m";
   static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
   public static void main(String[] args) {
      ArrayList<Tuple<String, String>> testCases = new ArrayList<Tuple<String, String>>();

      testCases.add(new Tuple<String,String>("-1/2+1/2", "0/1"));


      Solution solution = new Solution();
      for (Tuple<String, String> testCase : testCases) {
         String result = solution.fractionAddition(testCase.x);
         if (result == testCase.y) {
            System.out.println(ANSI_GREEN_BACKGROUND + " CORRECT " + ANSI_RESET + " " + testCase.x + ": " + result);
         }
         else {
            System.out.println(ANSI_RED_BACKGROUND + " WRONG " + ANSI_RESET + " " + testCase.x + ": " + result + "should have been: " + testCase.y);
         }

      }
   }
}