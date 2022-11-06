class Solution 
{
    public int subsetXORSum(int[] nums) 
    {
        int i=0,temp=0;
        return XorSubsetSum(nums,i,temp);
    }
    
    public int XorSubsetSum(int[] nums,int i,int temp)
    {
        int sum=0;
        if(i==nums.length)
            return temp;
        
        sum+=XorSubsetSum(nums,i+1,temp^nums[i]);
        sum+=XorSubsetSum(nums,i+1,temp);
        
        return sum;
    }
}