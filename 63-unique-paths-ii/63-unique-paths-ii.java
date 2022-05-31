class Solution 
{
    public int uniquePathsWithObstacles(int[][] ob) 
    {
        
        int m=ob.length;
        int n=ob[0].length;
        if(m==1 && n==1)
        {
            if(ob[m-1][n-1]==0)
                return 1;
            else
                return 0;
        }
        System.out.println(m+" "+n);
        int[][] dp=new int[m][n];
        allPaths(ob,m-1,n-1,dp);
        return dp[m-1][n-1];
    }
    
    public int allPaths(int[][] ob,int m,int n,int[][] dp)
    {
         if(m>=0 && n>=0 && ob[m][n]==1)
            return 0;
        if(m==0 && n==0)
            return 1;
        if(m<0 || n<0)
            return 0;
        if(dp[m][n]!=0)
            return dp[m][n];
        int up=0,left=0;
        up=allPaths(ob,m-1,n,dp);
        left=allPaths(ob,m,n-1,dp);
        return dp[m][n]=left+up;
        
    }
}