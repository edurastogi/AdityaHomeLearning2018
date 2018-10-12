package practicle.data.structure.stack;

public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(3);
        theStack.push('a');
        theStack.push('b');
        theStack.push('c');
        theStack.push('d');

        while(!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }
        System.out.println(reverseString("HELLO"));
    }

    public static String reverseString(String str){
        int stackSize = str.length();//get the max stack size
        Stack theStack = new Stack(stackSize);
        for (int j = 0; j < str.length(); j++) {
            theStack.push(str.charAt(j));
        }
        StringBuilder result = new StringBuilder();
        while(!theStack.isEmpty()){
            result.append(theStack.pop());
        }
        return result.toString();
    }
}
