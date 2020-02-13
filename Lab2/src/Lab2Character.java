import java.util.Scanner;

public class Lab2Character
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a integer to have it converted to a character:\t");
        Scanner userInput = new Scanner(System.in);

        if(userInput.hasNextInt())
        {
            int userDecision = userInput.nextInt();
            System.out.println((char)userDecision);
        }else
        {
            System.out.println("Please enter an integer!");

        }
    }
}