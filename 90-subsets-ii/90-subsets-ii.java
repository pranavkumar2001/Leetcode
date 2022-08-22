class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        backtrack(0,list,new ArrayList<>(),nums);
        return list;
    }
    
    public void backtrack(int k,List<List<Integer>> list,List<Integer> temp,int[] nums)
    {
        list.add(new ArrayList(temp));
        for(int i=k;i<nums.length;i++)
        {
          if(i>k && nums[i]==nums[i-1])
              continue;
          temp.add(nums[i]);
          backtrack(i+1,list,temp,nums);
          temp.remove(temp.size()-1);
        }
    }
}
    