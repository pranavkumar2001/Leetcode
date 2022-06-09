class Solution 
{
    public int[] twoSum(int[] num, int target) 
    {
       int l=0,r=num.length-1;
       while(l<r)
       {
           if(num[l]+num[r]>target)
               r--;
           if(num[l]+num[r]<target)
               l++;
           if(num[l]+num[r]==target)
               return new int[]{l+1,r+1};
       }
        return new int[]{0,0};
    }
}