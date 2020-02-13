////////////////////////////////////////////////////////////////////////////////////
//  C212
//
//
//  Lab 3
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  1/31/2020
//
//
//////////////////////////////////////////////////////////////////////////////////

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab3ExercisesTest {

    @Test
    public void my1089Puzzle() {
        assertEquals(1089, Lab3Exercises.my1089Puzzle(123));
        assertEquals(1089, Lab3Exercises.my1089Puzzle(324125));
        assertEquals(1089, Lab3Exercises.my1089Puzzle(15153357));
    }

    @Test
    public void formatPhoneNumber() {
        assertEquals("(812) 746-6741", Lab3Exercises.formatPhoneNumber("8127466741", true));
        assertEquals("812-746-6741", Lab3Exercises.formatPhoneNumber("8127466741", false));
    }

    @Test
    public void grade() {
        assertEquals("Your grade is between a 93.0 and 100", Lab3Exercises.grade('A'));
        assertEquals("Your grade is between a 83.0 and 92.9", Lab3Exercises.grade('B'));
        assertEquals("Your grade is between a 73.0 and 82.9", Lab3Exercises.grade('C'));
        assertEquals("Your grade is between a 63.0 and 72.9", Lab3Exercises.grade('D'));
        assertEquals("Your grade is lower than 63.0", Lab3Exercises.grade('F'));
    }

    @Test
    public void intToHex() {
        assertEquals("0x1E4F8",Lab3Exercises.intToHex(124152));
        assertEquals("0x299D663",Lab3Exercises.intToHex(43636323));
        assertEquals("0xB7E7759",Lab3Exercises.intToHex(192837465));
    }
}