class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        return search(nums,0,nums.length-1,target);
    }
    
    public int search(int[] nums,int l,int r,int tar)
    {
        if(l<=r)
        {
            int mid=l+(r-l)/2;
            
            if(nums[mid]==tar)
                return mid;
            else if(nums[mid]>tar)
                r=mid-1;
            else
                l=mid+1;
            return search(nums,l,r,tar);
        }
        return l;
    }
}