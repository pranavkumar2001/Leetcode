class Solution 
{
    public List<List<Integer>> combinationSum(int[] cand, int tar) 
    {
        List<List<Integer>> list=new ArrayList<>();
        Sum(0,0,tar,cand,new ArrayList<Integer>(),list);
        return list;
    }
    
    public void Sum(int k,int sum,int tar,int[] cand,List<Integer> temp,List<List<Integer>> list)
    {
        if(sum==tar)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        
        if(sum>tar || k==cand.length)
            return;
        
        temp.add(cand[k]);
        
        if(sum<tar)
            Sum(k,sum+cand[k],tar,cand,temp,list);
        
        temp.remove(temp.size()-1);
        
        Sum(k+1,sum,tar,cand,temp,list);
        
    }
}