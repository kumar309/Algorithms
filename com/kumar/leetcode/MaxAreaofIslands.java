package com.kumar.leetcode;

public class MaxAreaofIslands {
    public static void main(String[] args) {
        MaxAreaofIslands islands = new MaxAreaofIslands();
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int maxAreaOfIslands = islands.maxAreaOfIslands(grid);
        System.out.println(maxAreaOfIslands);

    }

    public int maxAreaOfIslands(int[][] grid){
        if(grid==null) return 0;
        int max =0;
        for(int i=0; i < grid.length; i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j]==1){
                    max = Math.max( max, dfs(grid, i, j));
                }
            }
        }
        return  max;
    }
    public int dfs(int[][]grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j]==0) return 0;
        //next step change current position which is 1 at this point to 0
        //at this point our current position is 1
        grid[i][j]=0;
        int count = 1;
        //since recursive, do this to every neighbor horizontally, vertically
        //do for up, down, left, right
        count += dfs(grid,i-1,j); //up
        count += dfs(grid,i+1,j); //down
        count += dfs(grid,i,j-1); //left
        count += dfs(grid,i,j+1);//right
        return count;
    }
}
