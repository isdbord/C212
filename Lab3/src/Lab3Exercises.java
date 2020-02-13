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

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Lab3Exercises {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please select which function you would like to use by entering one of the options below:\n" +
                "If you would like to use the 1089 Puzzle then please type 'Puzzle'\n" +
                "If you would like to format a phone number then please type 'Phone'\n" +
                "If you would like to use the numberList function then type 'Number'\n" +
                "If you would like to use the grade function then type 'Grade'\n" +
                "If you would like to use the intToHex function then type 'Hex'\n" +
                "If you would like to end the program then type 'End");
        System.out.print("Please enter which function you want to use:\t");

        boolean run = true;
        while(run)
        {
            String userDecision = userInput.nextLine();
            if(userDecision.contentEquals("Puzzle") || userDecision.contentEquals("puzzle"))
            {
                boolean puzzleContinue = true;
                while(puzzleContinue)
                {
                    System.out.print("Please enter an enter integer that is not Palindromic Number (ex. 101 or 121):\t");
                    int userInt;
                    if(userInput.hasNextInt())
                    {
                        userInt = userInput.nextInt();

                        my1089Puzzle(userInt);
                        puzzleContinue = false;
                    }else{
                        System.out.println("You entered a value that was not an int");
                    }
                }
            }
            else if(userDecision.contentEquals("Phone") || userDecision.contentEquals("phone"))
            {
                System.out.print("Please enter a phone number:\t");
                String userPhoneNumber = userInput.nextLine();
                System.out.print("Do you want to format your phone number? types 'true' if you do and 'false' if you do not:\t");
                boolean userFormat = userInput.nextBoolean();

                formatPhoneNumber(userPhoneNumber, userFormat);
            }
            else if(userDecision.contentEquals("Number") || userDecision.contentEquals("number"))
            {
                System.out.println(numbersList());
            }
            else if(userDecision.contentEquals("Grade") || userDecision.contentEquals("grade"))
            {
                System.out.println("Enter a letter grade (A, B, C, D, F):\t");
                char userGrade = userInput.nextLine().charAt(0);

                if(userGrade == 'A' || userGrade == 'B' || userGrade == 'C' || userGrade == 'D' || userGrade == 'F'){
                    System.out.println(grade(userGrade));
                }else{
                    System.out.println("Not a valid grade letter");
                }
            }
            else if(userDecision.contentEquals("Hex") || userDecision.contentEquals("hex"))
            {
                System.out.print("Enter an integer:\t");
                int userDecimal = 0;
                if(userInput.hasNextInt()){
                    userDecimal = userInput.nextInt();
                    System.out.println(intToHex(userDecimal));
                }else{
                    System.out.println("Invalid Number");
                }
            }
            else
                {
                if(userDecision.contentEquals("End") || userDecision.contentEquals("end"))
                {
                    System.out.print("Thank you for using my program.");
                    run = false;
                }
                else{
                    System.out.print("Please enter a valid function name to use:\t");
                }
            }
        }
    }

    public static int my1089Puzzle(int myInput)
    {
        // Cast int to a String so substring can be used to disregard all but last three numbers
        String intToString = Integer.toString(myInput);

        // Tests if string length is 3, if not then use substring to grab last three ints or appends 0's to
        // int if less than 100 and prints what the input is
        String stringToBeReversed;

        if(intToString.length() < 3)
        {
            // if statement to determine how many zeros to append
            if(intToString.length() == 1)
            {
                // prints 00#
                stringToBeReversed = "00" + intToString;
            }else{
                // prints 0##
                stringToBeReversed = "0" + intToString;
            }
            // Prints out inputed number with preceding zeros
            System.out.println("Input:\t" + stringToBeReversed);

        }else if(intToString.length() == 3)
        {
            // set input to stringToBeReserved and print what input was
            stringToBeReversed = intToString;
            System.out.println("Input:\t" + stringToBeReversed);
        }else{
            //
            stringToBeReversed = intToString.substring(intToString.length() - 3);
            System.out.println("Input:\t" + stringToBeReversed);
        }



        // Reverses ints in string by creating an array with 3 spaces so that we can append the string from
        // position [2] + [1] + [0]
        String[] arrayToReverse = new String[3];
        StringBuilder newReversedString = new StringBuilder();
        for(int i = 0; i < 3; i++){
            arrayToReverse[i] = stringToBeReversed.substring(stringToBeReversed.length() - (i + 1),stringToBeReversed.length() - i);
            newReversedString.append(arrayToReverse[i]);
        }

        int reversedInt = Integer.valueOf(newReversedString.toString());
        System.out.println("Reversed:\t" + newReversedString);


        // Subtracts the original input from the reversed which disregards any minus sign and uses an if statement to determine if
        // value is going to be positive or negative. If value is negative then we use Math.abs();
        int originalString = Integer.valueOf(stringToBeReversed.toString());

        StringBuilder differenceBetweenOrgRev = new StringBuilder();
        if(myInput > reversedInt)
        {
            int differenceBetween = abs(originalString - reversedInt);
            differenceBetweenOrgRev.append(differenceBetween);
            System.out.println("Difference:\t" + differenceBetween);
        }else{
            int differenceBetween = abs(originalString - reversedInt);
            differenceBetweenOrgRev.append(differenceBetween);
            System.out.println("Difference:\t" + differenceBetween);
        }

        int differenceOfOriginalNumber = Integer.valueOf(differenceBetweenOrgRev.toString());

        /*
        * Reverse Function 2 :
        * for loop reverses the difference between original int and original reversed int
        * defines a new StringBuilder and new String that was being subtracted
         */

        String[] arrayDifferenceToBeReversed = new String[3];
        String stringDifferenceReversed = Integer.toString(Integer.valueOf(differenceBetweenOrgRev.toString()));
        StringBuilder reversedDifferenceString = new StringBuilder();
        for(int i = 0; i < 3; i++){
            arrayDifferenceToBeReversed[i] = stringDifferenceReversed.substring(stringDifferenceReversed.length() - (i + 1),stringDifferenceReversed.length() - i);
            reversedDifferenceString.append(arrayDifferenceToBeReversed[i]);
        }

       int reversedDifference = Integer.valueOf(reversedDifferenceString.toString());
        System.out.println("Reversed:\t" + reversedDifference);


        /*
        * Adding Difference and Reversed Difference :
        * Simply add the two returned values
         */

        int addedDifferences = reversedDifference + differenceOfOriginalNumber;
        System.out.println("Sum:\t" + addedDifferences);
        return addedDifferences;
    }

    public static String formatPhoneNumber(String myNumber, boolean option)
    {
        /*
        * formatPhoneNumber : String Boolean -> String
        * Purpose: Format reads a telephone number into a string variable, computes the formatted
        *   number based on user’s choice of format and returns it as string
        *
        * create a prompt to enter in a phone number
        *   - Have if statement check if number is valid
        *       - if yes then move on to formatting number
        *       - if no then ask to re-enter phone number and boolean
        *
        * check what format the user wants then create if statement
        *   - If true then use substrings to enter in "(" ")" "-"
        *   - If false then enter hyphens in appropriate places
        *
        * return String
         */

        Scanner userInput = new Scanner(System.in);
        String formattedPhoneNumber = "";

        if(myNumber.length() != 10)
        {
            System.out.print("Please enter a valid number:\t");
            String newPhoneNumber = userInput.nextLine();
            formatPhoneNumber(newPhoneNumber, option);
        }else{
            if(option == true){
                // use substring to implement ( ) and -

                String areaCode = myNumber.substring(0,3);
                //System.out.println(areaCode);
                String prefixNumber = myNumber.substring(3, 6);
                //System.out.println(prefixNumber);
                String lineNumber = myNumber.substring(6, 10);
                //System.out.println(lineNumber);

                formattedPhoneNumber = "(" + areaCode + ") " + prefixNumber + "-" + lineNumber;
                System.out.println(formattedPhoneNumber);


            }else{
                // use substring to implement -
                String areaCode = myNumber.substring(0,3);
                //System.out.println(areaCode);
                String prefixNumber = myNumber.substring(3, 6);
               // System.out.println(prefixNumber);
                String lineNumber = myNumber.substring(6, 10);
                //System.out.println(lineNumber);

                formattedPhoneNumber = areaCode + "-" + prefixNumber + "-" + lineNumber;
                System.out.println(formattedPhoneNumber);

            }
        }
        return formattedPhoneNumber;
    }

    public static String numbersList()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an Integer between 5 and 19:\t");

        StringBuilder builtListOfInts = new StringBuilder();

        do {
            int userInt = userInput.nextInt();
            if(userInt > 5 && userInt < 19)
            {
                if(builtListOfInts.toString().contains(Integer.toString(userInt)))
                {
                    System.out.println(builtListOfInts);
                    System.out.print("Enter an Integer between 5 and 19:\t");
                }else
                    {
                    builtListOfInts.append(userInt + ", ");
                    System.out.println(builtListOfInts);
                    System.out.print("Enter an Integer between 5 and 19:\t");
                }
            }else
                {
                System.out.println("Please enter a Integer between 5 and 19.");
                System.out.print("Enter an Integer between 5 and 19:\t");
            }
        }while(userInput.hasNextInt());

        return builtListOfInts.toString().substring(0, builtListOfInts.toString().length() - 2);
    }

    public static String grade(char gradeLetter)
    {
        String finalGrade = "";
        if(gradeLetter == 'A')
        {
            finalGrade = "Your grade is between a 93.0 and 100";
        }else if(gradeLetter == 'B')
        {
                finalGrade = "Your grade is between a 83.0 and 92.9";
        }else if(gradeLetter == 'C')
        {
            finalGrade = "Your grade is between a 73.0 and 82.9";
        }else if(gradeLetter == 'D')
        {
            finalGrade = "Your grade is between a 63.0 and 72.9";
        }else if(gradeLetter == 'F')
        {
            finalGrade = "Your grade is lower than 63.0";
        }else{
            System.out.println("Invalid grade letter.");
            finalGrade = "";
        }
        return finalGrade;
    }

    public static String intToHex(int n)
    {
        /*
        * intToHex : int -> String
        *
        * First - convert int to Binary number
        *   create if statement to test if quotient is greater than 16
        *       if true then mod quotient by 16
        *           take remainder and convert it to hexadecimal
        *           append to hexList
        *
        * return String;
         */

        StringBuilder hexList = new StringBuilder();
        while(n > 0){
            int remainder = n % 16;
            n = n/16;
            if(remainder == 10)
            {
                hexList.append('A');

            }else if(remainder == 11)
            {
                hexList.append('B');

            }else if(remainder == 12)
            {
                hexList.append('C');

            }else if(remainder == 13)
            {
                hexList.append('D');

            }else if(remainder == 14)
            {
                hexList.append('E');

            }else if(remainder == 15)
            {
                hexList.append('F');

            }else{
                hexList.append(remainder);
            }
        }
        return "0x" + hexList.reverse().toString();
    }
}
// Question 3
/*
* #3.a
*   i. Boolean / False
*   ii. int / 65
*   iii. Double / 15.1
*   iv. String / 624
*
*3.b
*   i. Expected: 3.0 Actual: 3.00009155413138
*   ii. Expected: 007 Actual: 007
*   iii. Expected: "Bee Bee Bee" Actual: "Bee Bee Bee"
 */