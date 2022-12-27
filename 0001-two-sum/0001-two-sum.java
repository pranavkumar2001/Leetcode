class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           map.put(nums[i],i);
        }
        
        int ind=-1;
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp) && map.get(temp)!=i)
            {
                  ind=map.get(temp);
                  return new int[]{i,ind};
            }
        }

        return new int[]{-1,-1};

    }
}