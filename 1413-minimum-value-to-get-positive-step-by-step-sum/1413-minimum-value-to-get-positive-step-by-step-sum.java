class Solution 
{
    public int minStartValue(int[] nums) 
    {
          int min=0,prefix=0;;
          for(int x:nums)
          {
              prefix+=x;
              min=Math.min(min,prefix);
          }
        return 1-min;
    }
}