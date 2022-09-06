class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count=0,max=count;
        for(int x:nums)
        {
            count++;
            if(x==0)
                count=0;
            max=Math.max(count,max);
        }
        return max;
    }
    
}