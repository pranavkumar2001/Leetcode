class Solution 
{
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> list=new ArrayList<>();
        AllComb(1,n,k,new ArrayList<Integer>(),list);
        return list;
    }
    
    public void AllComb(int start,int n,int k,List<Integer> temp,List<List<Integer>> list)
    {
        if(temp.size()==k)
        {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            AllComb(i+1,n,k,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}