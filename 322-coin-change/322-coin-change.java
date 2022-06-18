class Solution 
{
    public int coinChange(int[] coins, int amount) 
    {
        // if(coins.length==1)
        //     return amount%coins[0]==0?amount/coins[0]:-1;
        
        int[][] dp=new int[coins.length][amount+1];
        for(int[] x:dp)
            Arrays.fill(x,999999);
        int ans=coin(coins,amount,coins.length-1,dp);
        
        return ans==9999999?-1:ans;
    }
    
    public int coin(int[] cn,int am,int i,int[][] dp)
    {
        if(i==0)
        {
             return am%cn[0]==0?am/cn[0]:9999999;
        }
        if(dp[i][am]!=999999)
            return dp[i][am];
        int nottake=coin(cn,am,i-1,dp);
        int take=Integer.MAX_VALUE;
        if(cn[i]<=am)
        take=1+coin(cn,am-cn[i],i,dp);
        
        return dp[i][am]=Math.min(take,nottake);
    }
}