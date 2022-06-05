class Solution 
{
    public List<List<Integer>> combine(int n, int k) 
    {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        allComb(n,k,list,ans,1);
        return ans;
    }
    
    public void allComb(int n,int k,List<Integer> list,List<List<Integer>> ans,int x)
    {
        if(list.size()==k)
        {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=x;i<=n;i++)
        {
            list.add(i);
            
            allComb(n,k,list,ans,i+1);
            
            list.remove(list.size()-1);
        }
    }
}