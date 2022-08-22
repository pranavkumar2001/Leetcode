class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        backtrack(0,list,new ArrayList<>(),nums);
        return list;
    }
    
    public void backtrack(int i,List<List<Integer>> list,List<Integer> temp,int[] nums)
    {
        if(i==nums.length)
        {
            list.add(new ArrayList(temp));
            return;
        }
        
        temp.add(nums[i]);
        backtrack(i+1,list,temp,nums);
        temp.remove(temp.size()-1);
        backtrack(i+1,list,temp,nums);
    }
}