package leetcode;

import java.util.regex.Pattern;

public class DefangingAnIPAddress{
    public static void main(String[] args){
        DefangingAnIPAddress d = new DefangingAnIPAddress();
        System.out.println(d.defangIPaddr("123.1.1.1"));
    }

    public String defangIPaddr(String address){
        //first check if string is valid
        final String[] tokens = address.split(Pattern.quote("."));
        StringBuilder builder = new StringBuilder();
        if(tokens.length < 4 || tokens.length > 4) return null;
        else{
            int i = 0;
            for(String s : tokens){
                i++;
                Integer number = Integer.valueOf(s);
                if(number < 0 || number > 255) return null;
                builder.append(s);
                if(i != 4) builder.append("[.]");
            }
        }
        return builder.toString();
    }
}
