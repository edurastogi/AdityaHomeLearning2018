package com.HackerRank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:00:00AM";
        // formatter with format "hour:minute:second" followed by "AM/PM"
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm:ssa");
        // parse and get the result as a String
        String result = LocalTime.parse(s, fmt).toString();
        if(result.equals("00:00"))  result = "00:00:00";
        System.out.println(result);
    }
}
