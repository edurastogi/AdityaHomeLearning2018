package com.general;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
    public static void main(String[] args){
        /*FileFilter filter = new FileFilter(){
            public boolean accept(File pathname){
                return pathname.getName().endsWith(".java");
            }
        };
*/
        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("c:/tmp");
        File[] files = dir.listFiles(filterLambda);

        for(File f : files){
            System.out.println(f);
        }

    }
}
