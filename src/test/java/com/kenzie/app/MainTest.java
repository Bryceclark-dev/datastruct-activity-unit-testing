package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {

    @Test
    public void testReturnHello(){

    }

    @Test
    public void testAddGreetingContainsHello(){

    }

    @Test
    public void testAddNumbers(){

    }

    @Test
    public void testCountCharactersMatchLetters() {

    }

    //Test that CountCharacter can be used to match punctuation characters
    @Test
    public void testCountCharactersMatchPunctuation() {

    }

    @Test
    public void testCountCharactersEmptyString() {

    }

    @Test
    public void testCountCharactersMatchAnyCase() {

    }

    @Test
    public void testCleanStringEndPunctuation(){

    }

    //Test that words like ultra-violet and O'Brien do not get cleaned
    @Test
    public void testCleanStringMiddlePunctuation(){

    }

    @Test
    public void testCleanStringEmptyStrings(){

    }

    @Test
    public void testCountWordNoPunctuation() {

    }

    @Test
    public void testCountWordWithSpaceFrontAndBack(){

    }

    @Test
    public void testCountWordEmptyString() {
        int total = Main.countTotalWords("");
        assertEquals(0, total,"Test: Empty string failed");
        total = Main.countTotalWords("      ");
        assertEquals(0,total, "Test: Whitespace string failed");
        
    }

    @Test
    public void testCountWordWithPunctuation() {

    }


    //For the last three words, assume there are no stray punctuation strings
    @Test
    public void testLastThreeWordsLongString() {

    }

    //For the last three words, assume there are no stray punctuation strings
    @Test
    public void testLastThreeWordsShortString() {

    }

    //For the last three words, assume there are no stray punctuation strings
    @Test
    public void testLastThreeWordsEmptyString() {

    }

}

