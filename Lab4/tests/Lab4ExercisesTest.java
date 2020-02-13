////////////////////////////////////////////////////////////////////////////////////
//  C212
//
//
//  Lab 4
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  2/12/2020
//
//
//////////////////////////////////////////////////////////////////////////////////

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab4ExercisesTest {

    @Test
    public void romanToInteger() {
        assertEquals(1978, Lab4Exercises.romanToInteger("MCMLXXVIII"));
        assertEquals(2020, Lab4Exercises.romanToInteger("MMXX"));
        assertEquals(3549, Lab4Exercises.romanToInteger("MMMDXLIX"));
    }

    @Test
    public void stringContains() {
        assertEquals(true, Lab4Exercises.stringContains("isa", "ac", "AAAAA"));
        assertEquals(true, Lab4Exercises.stringContains("abc", "def", "abcdef"));
        assertEquals(true, Lab4Exercises.stringContains("abc", "Def", "abcdef"));
        assertEquals(false, Lab4Exercises.stringContains("ab","adef", "abde"));
        assertEquals(false, Lab4Exercises.stringContains("is","am","isama"));
        assertEquals(false, Lab4Exercises.stringContains("we", "we", "wewo"));

    }
}