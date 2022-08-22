class Solution 
{
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        permute(new ArrayList<>(),list,nums,visited);
        return list;
    }
    
    public void permute(List<Integer> temp,List<List<Integer>> list,int[] nums,boolean[] visited)
    {
        if(temp.size()==nums.length)
              list.add(new ArrayList(temp));
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
                continue;
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1])
                continue;
            visited[i]=true;
            temp.add(nums[i]);
            permute(temp,list,nums,visited);
            visited[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    
    
}