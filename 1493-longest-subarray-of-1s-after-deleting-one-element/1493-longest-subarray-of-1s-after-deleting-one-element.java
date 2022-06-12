class Solution 
{
    public int longestSubarray(int[] nums) 
    {
       int l=0,zrct=0,max=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
               zrct++;
           while(zrct>1)
           {
               if(nums[l]==0)
                   zrct--;
               l++;
           }
           max=Math.max(max,i-l);
       }
       return max;
    }
}