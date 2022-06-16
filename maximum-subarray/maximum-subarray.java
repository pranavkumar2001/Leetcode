class Solution 
{
    public int maxSubArray(int[] nums) 
    {
       int max=Integer.MIN_VALUE,sum=0;
        for(int current:nums)
        {
            sum+=current;
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
                sum=0;  
        }
        return max;
        
    }
}