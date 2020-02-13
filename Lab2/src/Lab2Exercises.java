//  Lab 2
//
//  Released:  1/20/20
//
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  1/24/2020
//
//
//  Directions:  Implement the following methods
//
//
//////////////////////////////////////////////////////////////////////////////////

// Note:  Do not need to explicitly import classes from java.lang but wanted to make it explicit
// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects)
// It is a class that provides functionality and will be used to complete one of the methods

import java.util.Scanner;

public class Lab2Exercises
{

    // computes area of a square when given its side length
    public static int areaOfSquare(double sideLength)
    {
        // define sideLength
        // multiply sideLength by itself (sideLength * sideLength)
        // convert the double to an int
        // return int

        double areaEquation = sideLength * sideLength;
        return (int)areaEquation;
    }

    // computes perimeter of a square when given its side length
    public static int perimeterOfSquare(double sideLength)
    {
        // define sideLength
        // multiply sideLength by 4
        // convert double to an int
        // return int

        double perimeterEquation = sideLength * 4;
        int finalPerimeter = (int)perimeterEquation;
        return finalPerimeter;
    }

    // computes volume of a cubic when given its side length
    public static double volumeOfCube(double sideLength)
    {
        // define sideLength
        // multiply sideLength input by itself three times (input * input * input)
        // Return double

        double volumeEquation = sideLength * sideLength * sideLength;
        return volumeEquation;
    }

    // returns a String with three lines in the following format:
    // On Line1: "Length of one Side of Square is: *
    // On Line2: "Area: *, Perimeter: **, Volume: **** " where * refers to area, ** refers to
    // perimeter of square and *** refers to volume of the cube respectively.
    public static String printMeasurements(int value)
    {
        //TODO
        // Please reuse any of the functions defined above.

        String measurementsStatement = "Length of one Side of Square is: " +  value + "\n" +
                "Area: " + areaOfSquare(value) + ", Perimeter: " + perimeterOfSquare(value) + ", Volume: " + volumeOfCube(value) +
                " where " + areaOfSquare(value) + " refers to area, " + perimeterOfSquare(value) + " refers to" +
                "perimeter of square and " + volumeOfCube(value) + " refers to volume of the cube respectively.";
        return measurementsStatement;

    }

    // given two points (x1,y1) and (x2,y2) return y intercept 	of the line
    public static int lineFunction(double x1, double y1, double x2, double y2)
    {
        //TODO
        // defines x1 y1 x2 y2
        // finds slope by using equation (y1-y2) / (x1-x2) = slope
        // Next, calculate y1 / (slope * x1) = y-intercept
        // return y-intercept
        
        double slope = (y2 - y1) / (x2 - x1);
        double yintercept = y1 - (slope * x1);
        return (int)yintercept;
    }

    // reads a number between 1000 and 1 Billion and prints it with commas (,) separating
    // every three digits. for example: 12317910 will be printed as $12,317,910
    // hint use modulus (%) to save part of the number, then concatenate back together as a String
    public static String addCommas(int num)
    {
        //TODO
        // read in a number between 1000 and 1 Billion
        // convert the int to a String
        // create a for loop that checks length of string to determine how many number places are present
        // use substrings to insert commas into the appropriate places
        // return string

        // converts int to a string
        String newString = Integer.toString(num);

        // turns String into an array
        char[] modifiedString = newString.toCharArray();

        // initializes stringWithCommas as a String
        String stringWithCommas = null;
        if(num > 999 && num < 1000000001)
        {
            if (newString.length() == 4)
            {
                // checks if number is between 1,000-9,999
                stringWithCommas = String.join(",",
                        new String(String.valueOf(modifiedString[0])),
                        String.join("",
                                new String(String.valueOf(modifiedString[1])),
                                new String(String.valueOf(modifiedString[2])),
                                new String(String.valueOf(modifiedString[3]))));

            }else if(newString.length() == 5)
            {
                // checks if number is between 10,000 - 99,999
                stringWithCommas = String.join(",",
                        String.join("",
                            new String(String.valueOf(modifiedString[0])),
                            new String(String.valueOf(modifiedString[1]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[2])),
                                new String(String.valueOf(modifiedString[3])),
                                new String(String.valueOf(modifiedString[4]))));

            }else if(newString.length() == 6)
            {
                // checks if number is between 100,000 - 999,999
                stringWithCommas = String.join(",",
                        String.join("",
                            new String(String.valueOf(modifiedString[0])),
                            new String(String.valueOf(modifiedString[1])),
                            new String(String.valueOf(modifiedString[2]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[3])),
                                new String(String.valueOf(modifiedString[4])),
                                new String(String.valueOf(modifiedString[5]))));

            }else if(newString.length() == 7)
            {
                // checks if number is between 1,000,000 - 9,999,999
                stringWithCommas = String.join(",",
                        new String(String.valueOf(modifiedString[0])),
                        String.join("",
                                new String(String.valueOf(modifiedString[1])),
                                new String(String.valueOf(modifiedString[2])),
                                new String(String.valueOf(modifiedString[3]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[4])),
                                new String(String.valueOf(modifiedString[5])),
                                new String(String.valueOf(modifiedString[6]))));

            }else if(newString.length() == 8)
            {
                // checks if number is between 10,000,000 - 99,999,999
                stringWithCommas = String.join(",",
                        String.join("",
                                new String(String.valueOf(modifiedString[0])),
                                new String(String.valueOf(modifiedString[1]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[3])),
                                new String(String.valueOf(modifiedString[4])),
                                new String(String.valueOf(modifiedString[5]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[6])),
                                new String(String.valueOf(modifiedString[7])),
                                new String(String.valueOf(modifiedString[8]))));
            }else if(newString.length() == 9)
            {
                // checks if number is between 100,000,000 - 999,999,999
                stringWithCommas = String.join(",",
                        String.join("",
                                new String(String.valueOf(modifiedString[0])),
                                new String(String.valueOf(modifiedString[1])),
                                new String(String.valueOf(modifiedString[2]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[3])),
                                new String(String.valueOf(modifiedString[4])),
                                new String(String.valueOf(modifiedString[5]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[6])),
                                new String(String.valueOf(modifiedString[7])),
                                new String(String.valueOf(modifiedString[8]))));
            }else
                {
                // checks if number is 1 Billion (1,000,000,000)
                stringWithCommas = String.join(",",
                        new String(String.valueOf(modifiedString[0])),
                        String.join("",
                                new String(String.valueOf(modifiedString[1])),
                                new String(String.valueOf(modifiedString[2])),
                                new String(String.valueOf(modifiedString[3]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[4])),
                                new String(String.valueOf(modifiedString[5])),
                                new String(String.valueOf(modifiedString[6]))),
                        String.join("",
                                new String(String.valueOf(modifiedString[7])),
                                new String(String.valueOf(modifiedString[8])),
                                new String(String.valueOf(modifiedString[9]))));
            }
        }else
            {
            System.out.println("Please enter a value betwween 1000 - 1 Billion");
        }
        return stringWithCommas;
    }

    // test client
    public static void main(String[] args)
    {
        //TODO: Modify to test all functions
        // Use Scanner to read inputs from user. Don't use Scanner in above functions!

        //Scanning in user inputs for values of function
        Scanner userInput = new Scanner(System.in);
        System.out.print("To calculate area, perimeter, and volume type 's', to determine the y-Intercept type 'y', or " +
                "to insert commas into a number between 1000 and 1 Billion type 'c': ");
        String userDecision = userInput.nextLine();

        // set if statement to determine which scanner to use
        if(userDecision.equalsIgnoreCase("s"))
        {
            // Request sideLength int from user
            System.out.print("Please enter a side length input: ");
            int userSideLength = userInput.nextInt();

            // Prints the measurements of the given sideLength
            System.out.println(printMeasurements(userSideLength));

        }else if(userDecision.equalsIgnoreCase("y"))
        {
            // request inputs for x1 y1 x2 y2
            System.out.println("Please enter the following inputs:");
            System.out.print("x1: ");
            int valueXOne = userInput.nextInt();
            System.out.print("Y1: ");
            int valueYOne = userInput.nextInt();
            System.out.print("x2: ");
            int valueXTwo = userInput.nextInt();
            System.out.print("y2: ");
            int valueYTwo = userInput.nextInt();

            System.out.println(lineFunction(valueXOne, valueYOne, valueXTwo, valueYTwo));
        }else if(userDecision.equalsIgnoreCase("c"))
        {
            System.out.print("Please enter a number between 1000 - 1 Billion: ");
            int originalInteger = userInput.nextInt();

            System.out.println(addCommas(originalInteger));
        }else
            {
            // display message saying invalid input, must say "s" for sideLength or "y" for y-Intercept
            System.out.println("Please enter one of the appropriate strings: 's', 'y', or 'c'");
        }
    }
}

///////////////////////////////////
//                               //
// ANSWER THE FOLLOWING QUESTIONS //
//                               //
///////////////////////////////////

/*
 * Questions 1-3 are on explicit and implicit casting of some numerical types
 *
 * 1.  What happens if you multiply an int with a char?
 *      Answer: It will print out an Integer
 *
 * 2.  What happens if you multiply a double with a char?
 *     Answer: It will print out a double
 *
 * 3.  What happens if you square a char?
 *     Answer: An error occurs saying Math.sqrt(); requires a double and not a char. If you cast it as a character after
 *              squaring it then nothing is printed.
 *
 * 4.  What happens if a method has a parameter of type int, but you pass it a char?
 *     Answer: You can do this because every character has ascii value.
 *
 * 5.  What happens if a method has a parameter of type char, but you pass it an int?
 *     Answer: You can pass an int through a character as long as it as a corresponding ascii value.
 *
 * 6.  What is the difference between two floating point primitive data types in the Java?
 *     Answer: To get a more precise float
 *
 * 7.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);

 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 *      Answer: i = 11; n = 11
 *
 *     What are the final value printed?
 *      Answer: 1
 *
 *     Now Compile and Run the Program to check your answers. If they are different, explain why
 *     and provide updated code!
 *      Answer: I was wrong because the i++ inside of ++(i++) is a value and not a variable.
 *     int i = 10;
 *     n = ++i;
 *     System.out.println(++i % 5);
 *
 *     ^^ I was told this wasn't supposed to print out any specific value so the intended print value is 1
 */