package cracking;

public class OneAway15 {
/*
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
 */

    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "pal";
        System.out.printf("Is %s , %s one away : %s ", s1, s2, isOneAway(s1, s2));
    }

    private static boolean isOneAway(String s1, String s2) {
        int lengthDiff = Math.abs(s1.length() - s2.length());

        if (lengthDiff > 1) return false;

        if (lengthDiff == 1) {
            String loopString;
            String checkString;
            if (s1.length() > s2.length()) {
                loopString = s2;
                checkString = s2;
            } else {
                loopString = s1;
                checkString = s2;
            }

            for (int i = 0; i < loopString.length(); i++) {
                int ind = checkString.indexOf(loopString.charAt(i));
                if (Math.abs(i - ind) > 1) return false;
            }
            return true;
        } else if (lengthDiff == 0) {

        }


        return false;
    }
}
