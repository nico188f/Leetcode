package LongestPalindromicSubstring5;

import javaTestCases.TestCases;

public class Main {
   public static void main(String[] args) {
      Solution solution = new Solution();
      TestCases<String, String> testCases = new TestCases<String, String>(solution);

      testCases.add("oohovoujkbnsaipnsk", "oho");
      testCases.add("sndoab", "s");
      testCases.add("nsdcinanijnjeb", "inani");
      testCases.add("koao", "oao");

      testCases.runTestCases();
   }
}