package leetcode;

import com.general.UtilityClass;

import java.util.Map;

public class JewlesAndStones771 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }

    private static int numJewelsInStones(String J, String S) {
        int out = 0;
        Map<Character, Integer> sMap = UtilityClass.getStringCharMap(S);
        for (int i = 0; i < J.length(); i++) {
            Integer value = sMap.get(J.charAt(i));
            if (value != null) out = out + value;
        }
        return out;
    }
}
