package com.example.bseeram.gameoflife;

import java.util.Random;

public class GameClass {

    private int arrayOfGame[][] = new int[50][50];

    public GameClass(int[][] arrayOfGame) {
        Random random = new Random();
        for (int i=0 ; i<50 ; i++)
        {
            for (int j=0 ; j<50 ; j++)
            {
                arrayOfGame[i][j] = random.nextInt(2);
            }
        }
    }

    public void generate()
    {
        //while (!stopGeneration()) {
            for (int i=0 ; i<50 ; i++)
            {
                for (int j=0 ; j<50 ; j++)
                {
                    if (arrayOfGame[i][j] == 1)
                    {
                        if (getCount(i, j) < 2 || getCount(i, j) > 3)
                            arrayOfGame[i][j] = 0;
                    }
                    else
                        if (getCount(i, j) == 3)
                            arrayOfGame[i][j] = 1;
                }
            }

        //}
    }

    private int getCount(int i, int j) {
        int count=0;
        for (int i1 = i-1 ; i1<=i+1 ; i1++)
        {
            for (int j1 = j-1 ; j1<=j+1 ; j1++)
            {
                if (j1!=-1 && i1!=-1 && j1<=50 && i1<=50 && arrayOfGame[i1][j1] == 1)
                    count++;
            }
        }
        return count;
    }

    private boolean stopGeneration() {
        return true;
    }
}
