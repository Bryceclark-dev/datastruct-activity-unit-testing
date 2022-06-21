package com.kenzie.app;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static String returnHello(){
        return "Hello";
    }

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

    public static String cleanString(String str) {
        String tempStr = str.replaceAll("[.,!?]","");

        //special case for word that is all punctuation
        String removePunctuation = tempStr.replaceAll("[\\p{Punct} ]","");
        if (removePunctuation.length() == 0){
            tempStr = "";
        }

        return tempStr;
    }

    // create countTotalWords(String word, String str) method
    public static int countTotalWords(String str) {
        String trimStr = str.trim();
        String[] strArray =  trimStr.split("( )+");
        int totalWords=strArray.length;

        return totalWords;
    }

    // create lastThreeWords(String word) method
    public static String[] lastThreeWords(String str) {
        String[] lastWordsArray = new String[]{"","",""};
        String trimStr = str.trim();
        String[] strArray =  trimStr.split("( )+");

        //endCounter determines when to stop looping
        int endCounter;
        if (strArray.length < 3) {
            endCounter = strArray.length;
        }
        else{
            endCounter = 3;
        }

        //lastWordsArray counts up from 0
        //Starts filling with 3rd from last, except in short strings
        //IN short strings, start at "x from last" where x = strArray.length
        for(int i=0 ; i < endCounter ;i++) {
            lastWordsArray[i]=cleanString(strArray[strArray.length-(endCounter-i)]);
        }
        return lastWordsArray;
    }

    public static void main(String[] args) {
    }
}
