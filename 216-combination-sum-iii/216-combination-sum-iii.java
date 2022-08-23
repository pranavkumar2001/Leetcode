class Solution 
{
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> list=new ArrayList<>();
        allCombi(1,n,k,0,new ArrayList<Integer>(),list);
        return list;
    }
    
    public void allCombi(int start,int n,int k,int sum,List<Integer> temp,List<List<Integer>> list)
    {
        if(sum==n && temp.size()==k)
        {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        if(sum>n || temp.size()>k)
            return;
        
        for(int i=start;i<=9;i++)
        {
            temp.add(i);
            allCombi(i+1,n,k,sum+i,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}