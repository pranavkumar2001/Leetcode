class Solution 
{
    public int minimumTotal(List<List<Integer>> tri) 
    {
        int n=tri.size();
        System.out.println(n);
        // int[] front=new int[n];
        // int[] current=new int[n];
        // for(int j=0;j<n;j++)
        //     front[j]=(int)tri.get(n-1).get(j);
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0; j<tri.get(i).size();j++)
            {
                int val=(int)tri.get(i).get(j)+Math.min((int)tri.get(i+1).get(j),(int)tri.get(i+1).get(j+1));
                tri.get(i).set(j,val);
            }
        }
        return (int)tri.get(0).get(0);
    }
        
}