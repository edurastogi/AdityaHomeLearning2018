package cracking;

public class StringCompression16 {
    public static void main(String[] args) {

        System.out.printf("Input : %s Output :%s \n", "aabcccccaaa", compressString("aabcccccaaa"));
        System.out.printf("Input : %s Output :%s", "abcdef", compressString("abcdef"));
    }

    private static String compressString(String input) {

        StringBuilder output = new StringBuilder();  //"a2blc5a3"

        boolean isCompressed = false;
        int counter = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i != input.length() && input.charAt(i - 1) == input.charAt(i)) {
                counter++;
                isCompressed = true;
            } else {
                output.append(input.charAt(i - 1));
                output.append(counter);
                counter = 1;
            }
        }
        if (isCompressed) return output.toString();
        else return input;
    }
}
