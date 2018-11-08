package com.example.sdevesh.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static com.example.sdevesh.gameoflife.Game.grid;
import static org.junit.Assert.*;

public class GameTest {
    Game game;
    @Before

    public void setup(){
        game= Game.getInstance(4);
        //grid[1][1]=1;
        grid[0][0]=1;
        grid[0][1]=1;
        grid[0][2]=1;


    }

    @Test
    public void AWhenCheckStateOfCellIsCalled_RulesAreValidated(){



        boolean check=game.state;
        assertSame(false,check);

    }
    @Test
    public void BWhenCheckNumberOfNeighboursIsCalled_CountIsReturn(){
        game.generateGame();
        int count =game.count;
        assertSame(3,count);
    }
    @Test
    public void CWhenCellIsDead_CountIsThree_CellIsReproduced(){

        game.generateGame();
        assertSame(true,game.state);
    }

    @Test
    public void DWhenCellIsAlive_CountIsMoreThanThree_CellDie(){
        grid[1][0]=1;
        game.generateGame();
        assertSame(false,game.state);
    }
    @Test
    public void EWhenCellIsAlive_CountIsLessThanTwo_CellDie(){
        grid[1][1]=0;
        grid[1][0]=0;
        grid[0][0]=0;
        grid[0][1]=0;
        game.generateGame();
        assertSame(false,game.state);
    }
    @Test
    public void FWhenCellIsAlive_CountIsTwoOrThree_CellWillBeAlive(){
        grid[1][1]=1;
        grid[0][1]=1;
        game.generateGame();
        assertSame(true,game.state);
    }
    @Test
    public void GWhenGenerateGameIsCalled_GAmeRuns(){
        grid[0][0]= 1;grid[0][1]= 1;grid[0][2]= 1;grid[0][3]= 0;
        grid[1][0]= 0;grid[1][1]= 1;grid[1][2]= 0;grid[1][3]= 0;
        grid[2][0]= 0;grid[2][1]= 0;grid[2][2]= 0;grid[2][3]= 0;
        grid[3][0]= 0;grid[3][1]= 1;grid[3][2]= 0;grid[3][3]= 0;

        game.generateGame();
        assertArrayEquals(new int[][]{{1,1,1,0},{1,0,0,0},{0,0,0,0},{0,0,0,0}},grid);
    }



}