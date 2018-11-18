package cracking;

import com.general.UtilityClass;

import java.util.Map;

public class PalindromePermutation14 {
    /*
    Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
    A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
    EXAMPLE
    Input: Tact Coa
    Output: True (permutations: "taco cat", "atco eta", etc.)
     */

    public static void main(String[] args) {
        String testString = "Tact Coa";
        System.out.println(testString +":"+isPermutationPalimdrone(testString));
    }

    private static boolean isPermutationPalimdrone(String testString) {
        testString = testString.replace(" ", "");
        testString = testString.toLowerCase();
        System.out.println(testString);
        Map<Character, Integer> testStringMap = UtilityClass.getStringCharMap(testString);
        int oddCount = 0;
        for (Character c : testStringMap.keySet()) {
            int count = testStringMap.get(c);
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 1) return false;
        return true;
    }
}
