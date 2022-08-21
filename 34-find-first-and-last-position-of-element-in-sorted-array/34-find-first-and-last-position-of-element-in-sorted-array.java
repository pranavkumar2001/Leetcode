class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
       int[] ans={Integer.MAX_VALUE,Integer.MIN_VALUE};
       binary(nums,target,ans,0,nums.length-1); 
       if(ans[0]==Integer.MAX_VALUE)
           ans[0]=-1;
       if(ans[1]==Integer.MIN_VALUE)
           ans[1]=-1;
        return ans;
    }
    
    public void binary(int[] nums,int target,int[] ans,int l,int r)
    {
        if(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                ans[0]=Math.min(ans[0],mid);
                ans[1]=Math.max(ans[1],mid);
                binary(nums,target,ans,l,mid-1);
                binary(nums,target,ans,mid+1,r);
            }
            if(nums[mid]>target)
               binary(nums,target,ans,l,mid-1);
            if(nums[mid]<target)
                 binary(nums,target,ans,mid+1,r);
        }
    }
}