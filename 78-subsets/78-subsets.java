class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n+1;i++)
        {
            backtrack(0,list,new ArrayList<>(),nums,i);
        }
        return list;
    }
    
    public void backtrack(int f,List<List<Integer>> list,List<Integer> temp,int[] nums,int size)
    {
        if(temp.size()==size)
        {
            list.add(new ArrayList(temp));
            return;
        }
        
        for(int i=f;i<nums.length;i++)
        {
            temp.add(nums[i]);
            backtrack(i+1,list,temp,nums,size);
            temp.remove(temp.size()-1);
        }
    }
}