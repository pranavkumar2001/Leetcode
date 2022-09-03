class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        
        int j=0;
        if(i>=0)
        {
             j=nums.length-1;
             while(nums[j]<=nums[i])
                 j--;
            
             //swap i & j index value
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        
        //reverse from i+1 to last
        i=i+1;j=nums.length-1;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
}