class Solution 
{
    public boolean stoneGame(int[] pi) 
    {
         if(pi.length==2)
            return true;
        int[][] dp=new int[pi.length][pi.length];
        int sum=0;
        for(int x:pi)
             sum+=x;
         int a=win(pi,1,pi.length-1,0,dp);
         int b=win(pi,0,pi.length-2,0,dp);
         int max=Math.max(a,b);
         return max>sum-max;
    }
    
    public int win(int[] pi,int i,int j,int max,int[][] dp)
    {
         if(i>=j)
             return 0;
         if(dp[i][j]!=0)
             return dp[i][j];
         int a=pi[i]+win(pi,i+1,j,max,dp);
         int b=pi[j]+win(pi,i,j-1,max,dp);
        
         return dp[i][j]=Math.max(a,b);
    }
}