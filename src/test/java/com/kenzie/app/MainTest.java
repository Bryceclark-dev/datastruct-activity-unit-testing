package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {

    //Write a test method to check that the addGreeting method contains "Hello"
    @Test
    public void testAddGreetingContainsHello(){
        String regularString = "Chi";
        String emptyString = "";
        String punctString = "abc123!?[]";

        String regularOutput = Main.addGreeting(regularString);
        String emptyOutput = Main.addGreeting(emptyString);
        String punctOutput = Main.addGreeting(punctString);

        assertEquals("Hello "+ regularString+"!", regularOutput, "The output has incorrect format");
        assertEquals("Hello "+ emptyString+"!", emptyOutput, "Empty string failed");
        assertEquals("Hello "+ punctString +"!", punctOutput, "Incorrect output for punctuation string");

    }

    //Write a test method to check that the addNumbers method works correctly
    @Test
    public void testAddNumbers(){
        int x = 1;
        int y = 2;
        int expected = 3;
        int zero = 0;
        int negative = -3;

        int actualOutput = Main.addNumbers(x, y);
        int zeroOutput = Main.addNumbers(x, zero);
        int negOutput = Main.addNumbers(y, negative);

        assertEquals(expected, actualOutput);
        assertEquals(x+zero, zeroOutput);
        assertEquals(y+negative, negOutput);
    }

    //Write a test method to check that the countCharacter method can be called with letters
    @Test
    public void testCountCharacterMatchLetters() {
        char lowerCase = 'a';
        char upperCase = 'M';
        String testString = "Mary had a little lamb";
        int expectLower = 4;
        int expectedUpper = 2;

        int lowerOutput = Main.countCharacter(lowerCase, testString);
        int upperOutput = Main.countCharacter(upperCase, testString);

        assertEquals(expectLower, lowerOutput);
        assertEquals(expectedUpper, upperOutput);
    }

    //Test that countCharacter can be used to match punctuation characters
    @Test
    public void testCountCharacterMatchPunctuation() {
        char input = ',';
        String testString = "Mary, had a little lamb.";
        int expectedOutput = 1;

        int actualOutput = Main.countCharacter(input, testString);

        assertEquals(expectedOutput, actualOutput, "Does not recognize punctuation");

    }

    //Edge case: Test that countCharacter can handle an empty string
    @Test
    public void testCountCharactersEmptyString() {
        char input = 'a';
        String emptyString = "";
        int expectedOutput = 0;

        int actualOutput = Main.countCharacter(input, emptyString);

        assertEquals(expectedOutput, actualOutput, "Empty string failed");

    }

    //Edge case: Test that countCharacter can handle case-insensitive matching
    //Write this unit test first. When countCharacter fails this test -- then go and fix the countCharacter method in Main.java
    @Test
    public void testCountCharacterMatchAnyCase() {
        char input = 'a';
        String testString = "Alphabet";
        int expectedOutput = 2;

        int actualOutput = Main.countCharacter(input, testString);

        assertEquals(expectedOutput, actualOutput,
                "Failed to do case-insensitive matching. Input was char: <"+input+"> and String: <"+testString+">" );

    }


}

