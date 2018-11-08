package com.example.sdevesh.gameoflife;

import static com.example.sdevesh.gameoflife.Game.getInstance;

public class Run_Game {



    Game game;
    private int length;
    private static boolean state=true;
    public void Run_Game(int length){
        this.length=length;
        Game game= getInstance(length);
    }

    public void startGame(){
        while(state!=false){
            game.generateGame();
        }
    }

    public void stopGame() {
        state=false;

    }
}
