class Solution 
{
    public int minPathSum(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        return minSum(m-1,n-1,grid,dp);
    }
    
    public int minSum(int m,int n,int[][] grid,int[][] dp)
    {
        if(m==0 && n==0)
        {
            return grid[m][n];
        }
        
        if(m<0 || n<0)
            return Integer.MAX_VALUE;
        
        if(dp[m][n]!=0)
            return dp[m][n];
        int left=0,up=0;
        left=minSum(m,n-1,grid,dp);
        up=minSum(m-1,n,grid,dp);
        
        int min=grid[m][n]+ Math.min(left,up);
        return dp[m][n]=min;
    }
}