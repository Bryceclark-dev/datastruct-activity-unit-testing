package com.kenzie.app;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static String addGreeting(String inputStr){
        return "Hello " + inputStr + "!";
    }

    public static int addNumbers(int x, int y){
        return x + y;
    }

    // create countCharacter(Char c, String str) method
    public static int countCharacter(char c, String str) {
        char[] ch = str.toCharArray();
        int totalChars = 0;
        //Loop through array and count character matches
        for (char i : ch) {
            //check for match with input character
            if (i == c) {
                totalChars++;
            }
        }
        return totalChars;
    }

    
    public static void main(String[] args) {
        System.out.println("Unit Test Activity");
    }
}
