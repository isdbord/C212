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

import java.util.Random;
import java.util.Scanner;

public class Lab4Exercises
{
    static final Scanner USER_INPUT  = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean run = true;
        while(run)
        {
            System.out.print("Menu Options: A(Roman Numeral converter), B(Patter Generator), C(Random List Frequency)," +
                    " or D(String Validation).\nEnter 'E' to exit the program.\n" +
                    "Input:\t");
            char methodDec = USER_INPUT.nextLine().charAt(0);
            switch (methodDec) {
                case 'A':
                    System.out.print("Enter a roman numeral number:\t");
                    String romanNumeral = USER_INPUT.nextLine();
                    System.out.println(romanToInteger(romanNumeral));
                    break;
                case 'B': patternGenerator(); break;
                case 'C': randomTenNumbers(); break;
                case 'D':
                    System.out.print("Enter the first string:   ");
                    String stringOne = USER_INPUT.nextLine();

                    System.out.print("Enter the second string:   ");
                    String stringTwo = USER_INPUT.nextLine();

                    System.out.print("Enter the third string:   ");
                    String stringThree = USER_INPUT.nextLine();

                    stringContains(stringOne, stringTwo, stringThree);
                    break;
                case 'E':
                    System.out.println("Goodbye.");
                    run = false;
                    break;
            }
        }
        USER_INPUT.close();
    }

    public static int romanToInteger(String romanNumber)
    {
        /**
        * checks string length to check to see how many digits are present in the number
        * last else if statement checks to make sure int is less than 3,999
        * each if statement will have a nested if statement to check the values within each string length
        */

        //allows charAt() function to not throw error when checking if multiple I's are in a row
        romanNumber = " " + romanNumber.toUpperCase();
        int finalNumber = 0;
        for(int i = romanNumber.length(); 0 < i; i--)
        {
            char newRomanNumber = romanNumber.charAt(i - 1);
            if(newRomanNumber == 'I')
            {
                if(romanNumber.charAt(i - 2) == 'I')
                {
                    if(romanNumber.charAt(i - 3) == 'I')
                    {
                        finalNumber+=3;
                        i--;
                    }
                    else{
                        finalNumber+=2;
                    }
                    i--;
                }else{
                    finalNumber+=1;
                }
            }else if(newRomanNumber == 'V')
            {
                if(romanNumber.charAt(i - 2) == 'I')
                {
                    finalNumber+=4;
                    i--;
                }else{
                    finalNumber+=5;
                }
            }else if(newRomanNumber == 'X')
            {
                if(romanNumber.charAt(i - 2) == 'X')
                {
                    if(romanNumber.charAt(i - 3) == 'X')
                    {
                        finalNumber+=30;
                        i--;
                    }else{
                        finalNumber+=20;
                    }
                    i--;
                }else{
                    if(romanNumber.charAt(i - 2) == 'I')
                    {
                        finalNumber+=9;
                        i--;
                    }
                    else{
                        finalNumber+=10;
                    }
                }
            }else if(newRomanNumber == 'L')
            {
                if(romanNumber.charAt(i - 2) == 'X')
                {
                    finalNumber+=40;
                    i--;
                }else{
                    finalNumber+=50;
                }
            }else if(newRomanNumber == 'C')
            {
                if(romanNumber.charAt(i - 2) == 'C')
                {
                    if(romanNumber.charAt(i - 3) == 'C')
                    {
                        finalNumber+=300;
                        i--;
                    }else{
                        finalNumber+=200;
                    }
                    i--;
                }else{
                    if(romanNumber.charAt(i - 2) == 'X')
                    {
                        finalNumber+=90;
                        i--;
                    }
                    else{
                        finalNumber+=100;
                    }
                }
            }else if(newRomanNumber == 'D')
            {
                if(romanNumber.charAt(i - 2) == 'D')
                {
                    finalNumber+=400;
                    i--;
                }else{
                    finalNumber+=500;
                }
            }else if(newRomanNumber == 'M')
            {
                if(romanNumber.charAt(i - 2) == 'M')
                {
                    if(romanNumber.charAt(i - 3) == 'M')
                    {
                        finalNumber+=3000;
                        i--;
                    }else{
                        finalNumber+=2000;
                    }
                    i--;
                }else{
                    if(romanNumber.charAt(i - 2) == 'C')
                    {
                        finalNumber+=900;
                        i--;
                    }
                    else{
                        finalNumber+=1000;
                    }
                }
            }
        }
        return finalNumber;
    }

    public static void patternGenerator()
    {
        /*
        * create a menu inside a while loop that constantly runs until user types 'E'
        * the menu will consist of 4 options, A-C & E, that will let the user choose which pattern they want or to exit
        *
        */

        boolean run = true;

        while(run){
            System.out.print("Menu Options: A, B, or C.\nEnter 'E' to exit the program.\n" +
                    "Input:\t");
            char userMenuChoice = USER_INPUT.nextLine().charAt(0);
            switch (userMenuChoice){
                case 'A': CaseMethods.caseA(); break;
                case 'B': CaseMethods.caseB(); break;
                case 'C': CaseMethods.caseC(); break;
                case 'E': run = false; break;
            }
        }
    }

    public static String randomTenNumbers()
    {

        Random randomNumbers = new Random();
        String generatedNumbers = "";
        int numberOneCounter = 0; int numberTwoCounter = 0; int numberThreeCounter = 0; int numberFourCounter = 0;
        int numberFiveCounter = 0; int numberSixCounter = 0; int numberSevenCounter = 0; int numberEightCounter = 0;
        int numberNineCounter = 0; int numberTenCounter = 0;

        // randomizes a list
        String generatedComparedNumbers = "";
        for(int i = 1; i <= 10; i++)
        {
            int randomNumberToBeAdded = 1 + randomNumbers.nextInt(9);
            generatedNumbers = generatedNumbers  + randomNumberToBeAdded + ",";
            generatedComparedNumbers = generatedComparedNumbers + randomNumberToBeAdded;

            if(randomNumberToBeAdded == 1)
            {
                numberOneCounter = numberOneCounter++;
            }else if(randomNumberToBeAdded == 2)
            {
                numberTwoCounter = numberTwoCounter + 1;
            }else if(randomNumberToBeAdded == 3)
            {
                numberThreeCounter = numberThreeCounter + 1;
            }else if(randomNumberToBeAdded == 4)
            {
                numberFourCounter = numberFourCounter + 1;
            }
            else if(randomNumberToBeAdded == 5)
            {
                numberFiveCounter = numberFiveCounter + 1;
            }
            else if(randomNumberToBeAdded == 6)
            {
                numberSixCounter = numberSixCounter + 1;
            }
            else if(randomNumberToBeAdded == 7)
            {
                numberSevenCounter = numberSevenCounter + 1;
            }
            else if(randomNumberToBeAdded == 8)
            {
                numberEightCounter = numberEightCounter + 1;
            }
            else if(randomNumberToBeAdded == 9)
            {
                numberNineCounter = numberNineCounter + 1;
            }
            else if(randomNumberToBeAdded == 10)
            {
                numberTenCounter = numberTenCounter + 1;
            }
        }
        System.out.println("Random Numbers = " + generatedNumbers.substring(0, generatedNumbers.length()-1));

        String frequencyDisplay = "";
        if(numberOneCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "1 -> " + numberOneCounter + "\n";
        }if(numberTwoCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "2 -> " + numberTwoCounter + "\n";
        }if(numberThreeCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "3 -> " + numberThreeCounter + "\n";
        }if(numberFourCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "4 -> " + numberFourCounter + "\n";
        }if(numberFiveCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "5 -> " + numberFiveCounter + "\n";
        }if(numberSixCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "6 -> " + numberSixCounter + "\n";
        }if(numberSevenCounter > 0)
        {
            frequencyDisplay =  frequencyDisplay + "7 -> " + numberSevenCounter + "\n";
        }if(numberEightCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "8 -> " + numberEightCounter + "\n";
        }if(numberNineCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "9 -> " + numberNineCounter + "\n";
        }if(numberTenCounter > 0)
        {
            frequencyDisplay = frequencyDisplay + "10 -> " + numberTenCounter + "\n";
        }

        System.out.println("Frequency:\n" + frequencyDisplay);


        int maxNum = Math.max(numberOneCounter,Math.max(numberTwoCounter, Math.max(numberThreeCounter,
                Math.max(numberFourCounter,Math.max(numberFiveCounter, Math.max(numberSixCounter,
                        Math.max(numberSevenCounter, Math.max(numberEightCounter, Math.max(numberNineCounter, numberTenCounter)))))))));

        System.out.println("Deleting the Numbers with Max Frequency...");

        String finalString = MaxValue.maxValueDetermination(maxNum, numberOneCounter, numberTwoCounter, numberThreeCounter, numberFourCounter,
                numberFiveCounter, numberSixCounter, numberSevenCounter, numberEightCounter, numberNineCounter, numberTenCounter, generatedComparedNumbers);

        System.out.println("Random Numbers:\t" + finalString);

        return finalString;

    }

    public static boolean stringContains(String stringOne, String stringTwo, String stringThree)
    {
        /*
        * Read in String1 and String2
        * Then read in string3
        * create an if statement that checks if the combined length of string 1 and 2 are equal to length of 3
        *   if true then check each letter in combined string is equal to string3
        *   if false then return false
         */


        boolean valid = false;
        String stringOneTwoCombined = stringOne + stringTwo;
        if(stringOneTwoCombined.length() == stringThree.length())
        {
            for(int i = 1; i <= stringThree.length(); i++)
            {
                if(stringOneTwoCombined.toLowerCase().contains(stringThree.toLowerCase().substring((i - 1), i)))
                {
                    valid = true;
                } else {
                    valid = false;
                    i = stringThree.length();
                    System.out.println("Your string contains a character that does not belong.");
                }
            }
        }else{
            System.out.println("Strings do not match in length or do not contain the same characters");
            valid = false;

        }
        if(valid == true){
            System.out.println("Your String is valid!");
        }
        return valid;
    }
}

class CaseMethods
{
    static final Scanner USER_INPUT  = new Scanner(System.in);

    // CaseA, CaseB and CaseC are for patterns function
    public static void caseA()
    {
        boolean run = true;
            while(run)
            {
                System.out.print("Please enter the side length for the pattern:\t");
                int sideLength = USER_INPUT.nextInt();
                if ((sideLength % 2) == 1) {
                    run = false;
                    for (int i = 1; i <= sideLength; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }

                        for (int k = i; k <= sideLength; k++) {
                            System.out.print(k + " ");
                        }
                        System.out.println();
                    }
                    for (int i = sideLength - 1; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = i; k <= sideLength; k++) {
                            System.out.print(k + " ");
                        }

                        System.out.println();
                    }
                } else {
                    System.out.println("Please enter a odd number.");
                }
            }
    }

    public static void caseB()
    {
        System.out.print("Please enter the side length for the pattern:\t");
        int sideLength = USER_INPUT.nextInt();

        for (int i = 1; i <= sideLength; i++)
        {
            for (int j = i; j < sideLength; j++)
            {
                System.out.print(' ');
            }
            for (int k = 1; k < 2*i; k++)
            {
                if (i == sideLength || k == 1 || k == 2*i - 1)
                {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void caseC()
    {
        System.out.print("Please enter the side length for the pattern:\t");
        int sideLength = USER_INPUT.nextInt();

    }
}

class MaxValue
{
    public static String maxValueDetermination(int max, int n1, int n2, int n3, int n4, int n5,int n6,int n7,int n8,int n9,int n10, String generatedString)
    {
        String maxValueString = "";
        if(n1 == max)
        {
            maxValueString = maxValueString + "1";
        }if(n2 == max)
        {
            maxValueString = maxValueString + "2";
        }if(n3 == max)
        {
            maxValueString = maxValueString + "3";
        }if(n4 == max)
        {
            maxValueString = maxValueString + "4";
        }if(n5 == max)
        {
            maxValueString = maxValueString + "5";
        }if(n6 == max)
        {
            maxValueString = maxValueString + "6";
        }if(n7 == max)
        {
            maxValueString = maxValueString + "7";
        }if(n8 == max)
        {
            maxValueString = maxValueString + "8";
        }if(n9 == max)
        {
            maxValueString = maxValueString + "9";
        }if(n10 == max)
        {
            maxValueString = maxValueString + "10";
        }

        maxValueString = maxValueString + "9";
        String maxNum;

        if(maxValueString.substring(1, 2) == "0")
        {
            maxNum = maxValueString.substring(0, 2);
        }else{
            maxNum = maxValueString.substring(0, 1);
        }

        String newGeneratedValues = "";
       for(int i = 0; i < generatedString.length(); i++)
       {
           if(!maxNum.equals(generatedString.substring(i, i + 1)))
           {
                newGeneratedValues = newGeneratedValues + generatedString.substring(i, i + 1);
           }
       }
       String finalString = "";
       for(int i = 0; i < newGeneratedValues.length(); i++){
           finalString = finalString + newGeneratedValues.substring(i, i + 1) + ", ";
       }
        return finalString.substring(0, finalString.length() - 1);
    }
}