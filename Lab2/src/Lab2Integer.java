////////////////////////////////////////////////////////////////////////////////////
//  C212
//
//  Released:  1/20/20
//
//  Lab 2
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  1/24/2020
//
//
//
//////////////////////////////////////////////////////////////////////////////////


import java.util.Arrays;

public class Lab2Integer
{
    /*
    * 1) create a main function that will read in a different function named "characterToInteger"
    * 2) characterToInteger will read in a char array that will be already defined in the main function and return a int array
    * 3) characterToInteger will define an int array and then use a for loop to access each point of the array in the main
    *    function and define it into the new int array with its ascii value
    * 4) characterToInteger will print each ascii value and then return the array to the main function
     */
    public static void main(String[] args)
    {
        // Define an array with all the characters that will be converted to integers
        //char[] charactersBeforeConversion = new char[21];
        char[] characterBeforeConversion = {'A', 'B', 'C', 'Z', 'X', 'a', 'b', 'c', 'y', 'u', '0', '9', '2', '$',
                '*', '>', '-', '|', '\\', '\t', ' '};

    // calls function characterToInteger
        characterToInteger(characterBeforeConversion);
    }

    public static int[] characterToInteger(char[] inputCharacter)
    {
    // Create a for loop
        // loop should go through the array and then create a new int[] with the corresponding ascii value
        int elementInArray;
        int[] convertedArray = new int[21];

        for(elementInArray = 0; elementInArray < 21; elementInArray++)
        {
            // calls elementInArray within the inputCharacter input which calls each array element to be converted
            char insertedArray = inputCharacter[elementInArray];
            convertedArray[elementInArray] = insertedArray;

            //prints out the array to it's integer type
            System.out.println(convertedArray[elementInArray]);
        }
     return convertedArray;
    }
}
