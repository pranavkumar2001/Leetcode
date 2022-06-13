class Solution 
{
    public int minimumTotal(List<List<Integer>> tri) 
    {
        int n=tri.size();
        System.out.println(n);
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0; j<tri.get(i).size();j++)
            {
                int val=(int)tri.get(i).get(j)+Math.min((int)tri.get(i+1).get(j),(int)tri.get(i+1).get(j+1));
                tri.get(i).set(j,val);  //to update value in 2d list
            }
        }
        return (int)tri.get(0).get(0);
    }
        
}