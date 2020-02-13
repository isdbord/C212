
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2IntegerTest {

    @Test
    public void characterToInteger()
    {
        char[] characterBeforeConversion = {'A', 'B', 'C', 'Z', 'X', 'a', 'b', 'c', 'y', 'u', '0', '9', '2', '$',
                '*', '>', '-', '|', '\\', '\t', ' '};

        int elementInArray;
        int[] convertedArray = new int[21];

        for(elementInArray = 0; elementInArray < 21; elementInArray++)
        {
            char insertedArray = characterBeforeConversion[elementInArray];
            convertedArray[elementInArray] = insertedArray;
        }

        int[] arrayToBeTested  = {65, 66, 67, 90, 88, 97, 98, 99, 121, 117, 48, 57, 50, 36, 42, 62, 45, 124, 92, 9, 32};
        assertArrayEquals(convertedArray, arrayToBeTested);
    }


    @Test
    public void characterToIntegerTestFail()
    {
        char[] characterBeforeConversion = {'A', 'B', 'C', 'Z', 'X', 'a', 'b', 'c', 'y', 'u', '0', '9', '2', '$',
                '*', '>', '-', '|', '\\', '\t', ' '};

        int elementInArray;
        int[] convertedArray = new int[21];

        for(elementInArray = 0; elementInArray < 21; elementInArray++)
        {
            char insertedArray = characterBeforeConversion[elementInArray];
            convertedArray[elementInArray] = insertedArray;
        }

        char[] arrayToBeTested = {'A', 'B', 'C', 'Z', 'X', 'a', 'b', 'c', 'y', 'u', '0', '9', '2', '$',
                '*', '>', '-', '|', '\\', '\t', ' '};
        assertNotEquals(convertedArray, arrayToBeTested);
    }
}