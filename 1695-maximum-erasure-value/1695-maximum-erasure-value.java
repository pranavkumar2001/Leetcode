class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,l=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int t=nums[i];
            if(map.containsKey(t))
            {
                int ind=map.get(t);
                while(l<=ind)
                {
                    map.remove(nums[l]);
                    sum-=nums[l];
                    l+=1;
                }
            }
            map.put(t,i);
            sum+=t;
            max=Math.max(max,sum);
        }
        return max;
    }
}