class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
               int val=map.get(nums[i]);
               sum+=val;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return sum;
    }
}