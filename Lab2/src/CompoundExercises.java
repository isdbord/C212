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
//  Directions: See Below 
//               
//////////////////////////////////////////////////////////////////////////////////

// 1. Change the following program to use compound assignments, pre- or post- increment/decrement statements ONLY as appropriate.
class CompoundExercises {

     public static void compoundOperators()
     {
          
          int result = -1; // result is -1
          System.out.println(result);

          result = --result; // result is now -2
          System.out.println(result);

          result = result *= -2; // result is now 4
          System.out.println(result);

          result = result /= 2; // result is now 2
          System.out.println(result);

          result = result += 3; // result is now 5
          System.out.println(result);

          result = result %= 3; // result is now 2
          System.out.println(result);
     }
     
// 2. In the following program, explain why the value "-4" is printed thrice in a row:
     public static void question1()
     {
        int i = -5;
        i++;
        System.out.println(i);    // "-4"
        ++i;                     
        System.out.println(i);    // "-3"
        System.out.println(--i);  // "-4"
         // the print statement above uses pre-decrement in the print statement, thus decreasing the number from
         // -3 to -4 before the line is printed.
        System.out.println(i--);  // "-4"
         // the print statement above uses a post-decrement which prints out the previous value of i before being
         // decremented from -4 to -5
        System.out.println(++i);  // "-4"
         // the print statement above uses a pre-increment which adds one to the value of i before the value is printed,
         // thus making it go from -5 back to -4.
     }

    public static void main(String[] args)
    {
        // compoundOperators();
        // question1();
    }
}