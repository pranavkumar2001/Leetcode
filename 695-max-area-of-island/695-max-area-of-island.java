class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for(int i =0; i <grid.length; i ++) {
            for(int j =0; j < grid[0].length; j++) {
                if(grid[i][j] ==1 && !visited[i][j]) {
                    int temp = islandArea(grid,visited,i,j);
                    max = (max > temp) ? max:temp;
                }
            }
        }
        return max;
    }
    public int islandArea(int[][] grid, boolean[][] visited,int x,int y) {
        int sum =1;
        visited[x][y] = true;
        if(x >0 && !visited[x-1][y] && grid[x-1][y] ==1) {
            sum+=islandArea(grid,visited,x-1,y);
        }
        if(y >0 && !visited[x][y-1] && grid[x][y-1] ==1) {
            sum+=islandArea(grid,visited,x,y-1);
        }
        if(x+1<grid.length && !visited[x+1][y] && grid[x+1][y] ==1) {
            sum+=islandArea(grid,visited,x+1,y);
        }
        if(y+1 <grid[0].length && !visited[x][y+1] && grid[x][y+1] ==1) {
            sum+=islandArea(grid,visited,x,y+1);
        }
        return sum;
    }
}