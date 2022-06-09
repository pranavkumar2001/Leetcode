class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int sum=0;
        for(int x:nums)
            sum+=x;
        if(sum%2==1)
            return false;
        int target=sum/2,n=nums.length;
        int[][] dp=new int[n][target+1];
        return Partition(n-1,nums,target,dp);
    }
    
    //5 true
    //4 false
    boolean Partition(int i,int[] nums,int target,int[][] dp)
    {
        if(target==0)
            return true;
        if(i==0)
            return nums[i]==target;
        if(dp[i][target]==5)
            return true;
        if(dp[i][target]==4)
            return false;
        boolean nottake=Partition(i-1,nums,target,dp);
        boolean take=false;
        
        if(nums[i]<=target) 
            take=Partition(i-1,nums,target-nums[i],dp);
        
        if(take || nottake)
            dp[i][target]=5;
        else
            dp[i][target]=4;
        return  take || nottake;
    }
}