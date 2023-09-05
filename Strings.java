// ************* STRINGS AND STRING METHODS ****************

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String st;

        // st = sc.nextLine();

        // System.out.println(st);

        String name = "Harshhxhhil";

        // PRINTING LENGTH OF VARIABLE
        // int val = name.length();
        // System.out.println(val);

        // PRINTING VARIABLE IN LOWER CASE
        // name = name.toLowerCase();
        // System.out.println(name);
        
        // PRINTING VARIABLE IN UPPER CASE
        // name = name.toUpperCase();
        // System.out.println(name);

        // TRIMMING OUT THE SPACE FROM BOTH ENDS
        // String nonTrimmed = "      Hahaha       ";
        // System.out.println(nonTrimmed);
        // nonTrimmed = nonTrimmed.trim();
        // System.out.println(nonTrimmed);

        //SUBSTRING METHOD
        // System.out.println(name.substring(3));

        // Prints string from start to end-1
        // System.out.println(name.substring(3,6));
        
        // REPLACE all occurence of a character with some other character
        // System.out.println(name.replace('h','z'));

        // STARTS WITH
        // System.out.println(name.startsWith("s", 3));
        //ENDS WITH
        // System.out.println(name.endsWith("l"));

        // System.out.println(name.indexOf("s", 5));
        System.out.println(name.lastIndexOf("h", 6));

        sc.close();
    }
}
