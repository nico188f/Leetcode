package LongestPalindromicSubstring5;



import javaTestCases.SolutionToProblem;

public class Solution implements SolutionToProblem<String, String>{
    public String solution(String s) {
        String longestSubString = "";
        for (int i = 0; i < s.length(); i++) {
            String currSubString = String.valueOf(s.charAt(i));
            int left = i - 1;
            int right = i + 1;

            while (i + 1 < s.length() && s.charAt(i) == s.charAt(right)) {
                currSubString += s.charAt(i);
                i++;
                right++;
            }
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                currSubString = s.charAt(left) + currSubString + s.charAt(right);
                left--;
                right++;
            }
            if (currSubString.length() > longestSubString.length()) {
                longestSubString = currSubString;
            }
        }
        return longestSubString;
    }
}