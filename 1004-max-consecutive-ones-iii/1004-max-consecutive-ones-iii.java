class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int zrct=0,max=Integer.MIN_VALUE,l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zrct++;
            while(zrct>k)
            {
                if(nums[l]==0)
                    zrct--;
                l++;
            }
            
         max=Math.max(max,i-l+1);           
        }
        return max;
    }
}