class Solution 
{
    public int minMoves2(int[] nums) 
    {
       Arrays.sort(nums);
       int n=nums.length;
       int k=0,med=0;
       if(n%2==1)
           k=(n+1)/2;
       else
           k=(int)Math.ceil(( n/2 + n/2 +1)/2 );
       med=nums[k-1];
       int count=0;
       for(int x:nums)
       {
           count+=(int)Math.abs(x-med);
       }
        return count;
    }
}