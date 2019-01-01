package elements.of.programming;

public class StringEop {
    public static void main(String[] args) {
        System.out.println("String abcdcba :" + isPalindromic("abcdcba"));
        System.out.println("String Abcdcba :" + isPalindromic("Abcdcba"));
        System.out.println("String aditya :" + isPalindromic("aditya"));

        System.out.println(intToString(-2456));
        System.out.println((char) ('0' + 3)); // this will print 3, we need ot c

        System.out.println(stringToInt("-2456"));

    }

    public static boolean isPalindromic(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String intToString(int x) {

        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
        }

        StringBuilder s = new StringBuilder();

        do {
            s.append((char) ('0' + Math.abs(x % 10)));
            x = x / 10;
        } while (x != 0);

        if (isNegative) {
            s.append('-'); // add the negative sign back
        }

        s.reverse();
        return s.toString();
    }

    public static int stringToInt(String s){
        int result =0;
        for(int i = s.charAt(0) =='-'?1:0; i<s.length();i++){
            final int digit = s.charAt(i) - '0';
            result = result*10 + digit;
        }
        return s.charAt(0) == '-' ? -result: result;
    }


    public static void stringFunctions() {
        //Common String methods
        String s = "yaaditya";
        System.out.println(s.charAt(1));
        System.out.println(s.compareTo("foo"));
        System.out.println(s.concat("bar"));
        System.out.println(s.contains("ty"));
        System.out.println(s.endsWith("ya"));
        System.out.println(s.indexOf("ya"));
        System.out.println(s.indexOf("ya", 3));
        s.lastIndexOf("ya");
        s.length();
        s.replace('a', 'A');
        s.replace("a", "ABC");
        "Foo::Bar::Abc".split("::");
        s.startsWith("yaa");
        s.substring(1);
        s.substring(1, 5);
        s.toCharArray();
        s.trim();


        /*StringBuilder key methods
        append()
        charAt()
        delete()
        deleteCharAt()
        insert()
        replace()
        toString()*/
    }


}
