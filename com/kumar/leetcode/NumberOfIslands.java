package com.kumar.leetcode;

public class NumberOfIslands {
    public static void main(String[] args) {
        NumberOfIslands islands = new NumberOfIslands();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},

        };
        int numberOfIslands = islands.numIslands(grid);
        System.out.println(numberOfIslands);
    }

    public int numIslands(char[][] grid){
        if(grid==null) return 0;

        int islandCount =0;

        for(int i=0; i < grid.length; i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j]=='1'){
                    //increase island count
                    ++islandCount;
                    //change any other land connected to zero.
                    changeLandToWater(grid, i, j);
                }
            }
        }
        return  islandCount;
    }

    private void changeLandToWater(char[][]grid, int i, int j){
        //check these base conditions or out of bounds conditions
        //1. row is less than 0
        //2. row greater than grid.length (Row length)
        //3. column is less than 0
        //4. column is greater than grid[0].length (Column length)
        //5. if position is a 0;
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j]=='0') return;
        //next step change current position which is 1 at this point to 0
        //at this point our current position is 1
        grid[i][j]='0';
        //since recursive, do this to every neighbor horizontally, vertically
        //do for up, down, left, right
        changeLandToWater(grid,i-1,j); //up
        changeLandToWater(grid,i+1,j); //down
        changeLandToWater(grid,i,j-1); //left
        changeLandToWater(grid,i,j+1);//right
    }

}
