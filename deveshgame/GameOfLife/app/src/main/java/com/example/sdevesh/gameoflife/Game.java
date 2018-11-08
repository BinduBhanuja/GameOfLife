package com.example.sdevesh.gameoflife;

class Game {
    private static Game instance=null;
    private Game(){

    }
     static int[][] grid;
    private static int Length;
    public static Game getInstance(int length) {
        if(instance==null){
            instance=new Game();
            grid=new int [length][length];
            Length=length;
        }

        return instance;
    }

    boolean state=false;
    int count;
    public void generateGame() {
      for(int row=0;row<Length;row++) {
          for(int column=0;column<Length;column++) {
              state = checkStateOfCell(grid[row][column]);
              count = CheckNumberOfNeighbours(row, column, Length);
              setChange(row, column);
          }
      }
    }
     private boolean checkStateOfCell(int cell) {
         if (cell == 1) {
             return true;
         } else {
             return false;
         }
     }
      private int CheckNumberOfNeighbours(int row,int column ,int length){
        int sumCount=0;
        for(int i=(row==0?row:row-1);i<=(row==length-1?row:row+1);i++){
            for(int j=(column==0?column:column-1);j<=(column==length-1?column:column+1);j++){

                sumCount+=grid[i][j];
            }
        }

            return sumCount-grid[row][column];
        }
        private void setChange(int row, int column){
            if(state==false ){
                if(count==3) {
                    grid[row][column] = 1;
                }
            }
            else{

                if(count<2||count>3){
                    grid[row][column]=0;
                }
            }


        }



}
