////////////////////////////////////////////////////////////////////////////////////
//  C212
//
//
//  Lab 6
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  2/25/2020
//
//
//////////////////////////////////////////////////////////////////////////////////

public class GameofLife
{
    private boolean[][] board;
    private boolean[][] modifiedBoard;
    private final int NUMROW;
    private final int NUMCOL;

    public static void main(String[] args)
    {
        boolean[][] stillLifeBoolean = {{false, false, false, false, false, false},
                                        {false, false, true, true, false, false},
                                        {false, true, false, false, true, false},
                                        {false, false, true, false, true, false},
                                        {false, false, false, true, false, false},
                                        {false, false, false, false, false, false}};

        boolean[][] oscillatorBoolean = {{false, false, false, false, false, false},
                                        {false, false, false, false, false, false},
                                        {false, false, true, true, true, false},
                                        {false, true, true, true, false, false},
                                        {false, false, false, false, false, false},
                                        {false, false, false, false, false, false}};


        GameofLife stillLife = new GameofLife(stillLifeBoolean);
        GameofLife oscillator = new GameofLife(oscillatorBoolean);

        /*
         Still life will always print out the same GameofLife board, but oscillator will switch between
         two different boards. For example, all odd generations will print a different board than the original
         but all even generations will print out the original board.
         */


        System.out.println("Still Life \n------------");
        stillLife.grow(100, 20);
        System.out.println("Oscillator \n------------");
        oscillator.grow(20, 1);
    }

    public GameofLife(boolean[][] initialBoard)
    {
        NUMCOL = initialBoard[0].length;
        NUMROW = initialBoard.length;
        board = new boolean[NUMROW][NUMCOL];
        modifiedBoard = new boolean[NUMROW][NUMCOL];

        for(int i = 0; i < NUMROW; i++)
        {
            for(int j = 0; j < NUMCOL; j++)
            {
                board[i][j] = initialBoard[i][j];
                modifiedBoard[i][j] = initialBoard[i][j];
            }
        }
    }

    public String toString()
    {
        String booleanBoardToString = "";
        for(int i = 0; i < NUMROW; i++)
        {
            for(int j = 0; j < NUMCOL; j++)
            {
                if(board[i][j])
                {
                    booleanBoardToString = booleanBoardToString + "o ";
                }else{
                    booleanBoardToString = booleanBoardToString + "+ ";
                }
            }
            booleanBoardToString = booleanBoardToString.substring(0, booleanBoardToString.length() - 1);
            booleanBoardToString = booleanBoardToString + "\n";
        }
        return booleanBoardToString;
    }

    public void grow(int generation, int freqPrint)
    {
        int counter = 0;

        for(int g = 1; g <= generation; g++)
        {
            for (int i = 0; i < NUMROW; i++)
            {
                for (int j = 0; j < NUMCOL; j++)
                {
                    int numOfNeighbors = checkNeighbor(i, j);

                    if (numOfNeighbors == 3)
                    {
                        modifiedBoard[i][j] = true;
                    }else if(numOfNeighbors == 2)
                    {
                        modifiedBoard[i][j] = modifiedBoard[i][j];
                    }else{
                        modifiedBoard[i][j] = false;
                    }
                }
            }

            for(int i = 0; i < NUMROW; i++)
            {
                for(int j = 0; j < NUMCOL; j++)
                {
                    board[i][j] = modifiedBoard[i][j];
                }
            }


            if (g % freqPrint == 0)
            {
                GameofLife boardToPrint = new GameofLife(board);
                System.out.println(boardToPrint.toString());
            }
        }
    }

    private int checkNeighbor(int x, int y)
    {
        int numberOfNeighbors = 0;

        if(x-1 >= 0)
        {
            if (y - 1 >= 0)
            {
                if (board[x - 1][y - 1])
                {
                    numberOfNeighbors += 1;
                }
            }
            if (y + 1 <= NUMCOL - 1)
            {
                if (board[x - 1][y + 1])
                {
                    numberOfNeighbors += 1;
                }
            }
            if (board[x - 1][y])
            {
                numberOfNeighbors += 1;
            }
        }
        if(x+1 <= NUMROW -1)
        {
            if (y - 1 >= 0)
            {
                if (board[x + 1][y - 1])
                {
                    numberOfNeighbors += 1;
                }
            }
            if (y + 1 <= NUMCOL - 1)
            {
                if (board[x + 1][y + 1])
                {
                    numberOfNeighbors += 1;
                }
            }
            if (board[x + 1][y])
            {
                numberOfNeighbors += 1;
            }
        }
        if(x >= 0)
        {
            if (y - 1 >= 0)
            {
                if (board[x][y - 1])
                {
                    numberOfNeighbors += 1;
                }
            }
            if (y + 1 <= NUMCOL - 1)
            {
                if (board[x][y + 1])
                {
                    numberOfNeighbors += 1;
                }
            }
        }
        return numberOfNeighbors;
    }
}