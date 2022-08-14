class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        int ans=longest(nums,0,-1,dp);
        return ans;
    }
    
    public int longest(int[] nums,int k,int prev,int[][] dp)
    {
        if(k>=nums.length)
            return 0;
        if(dp[k][prev+1]!=0)
            return dp[k][prev+1];
        int take=0;
        int nottake=longest(nums,k+1,prev,dp);
        if(prev==-1 || nums[k]>nums[prev])
            take=1+longest(nums,k+1,k,dp);
        
        return dp[k][prev+1]=Math.max(take,nottake);
    }
}