class Solution 
{
    public int minFallingPathSum(int[][] mat) 
    {
        int r=mat.length;
        int c=mat[0].length;
        int[][] dp=new int[r][c];
        int min=Integer.MAX_VALUE;
        for(int j=0;j<c;j++)
        {
           int temp=minSum(mat,r-1,j,dp);
           min=Math.min(temp,min);
        }
        return min;
    }
    
    public int minSum(int[][] mat,int i,int j,int[][] dp)
    {
         if(j<0 || j>=mat[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(i==0)
        {
            return mat[i][j];
        }
       
        if(dp[i][j]!=0)
            return dp[i][j];
        int left=minSum(mat,i-1,j-1,dp);
        int up=minSum(mat,i-1,j,dp);
        int right=minSum(mat,i-1,j+1,dp);
        int min=mat[i][j]+Math.min(left,Math.min(up,right));
        return dp[i][j]=min;
    }
    
    
}