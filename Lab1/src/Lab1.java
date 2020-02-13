public class Lab1
{
    /**
     * @author Isaac Bordfeld
     * @username isdbord
     * Date Created: 01/14/2020
     * Assignment: Lab1
     **/
    public static void main(String[] args)
    {
        //makes it easier to set a new line within my print statement
        String newLine = "\n";

        // Defines the pictures drawn 
        String treeOne = "    *    \n   ***    \n  *****  \n ******* \n*********\n";
        String treeTwo = "*********\n ******* \n  *****  \n   ***   \n    *    \n";
        String treeThree = "**********\n****  ****\n***    ***\n**      **\n*        *\n" +
                "**      **\n***    ***\n****  ****\n**********\n";
        String treeFour = treeOne + " ******* \n  *****  \n   ***   \n    *    \n";
        String treeFive = "*\n**\n***\n****\n*****\n";
        String treeSix = "*****\n****\n***\n**\n*\n";
        String treeSeven = "    *\n   **\n  ***\n ****\n*****\n";
        String treeEight = "*****\n ****\n  ***\n   **\n    *\n";
        String treeNine = "    *    \n   * *   \n  *   *  \n *     * \n*       *\n *     * \n  *   *  \n" +
                "   * *   \n    *    \n";
        System.out.print(treeOne + newLine + treeTwo + newLine +treeThree + newLine + treeFour + newLine +
                treeFive + newLine + treeSix + newLine + treeSeven + newLine + treeEight + newLine + treeNine);

        /**
        Question: What fields does the System class have?
        Answer: err, in, and out
         **/
    }
}
