class Solution 
{
    public int[][] kClosest(int[][] points, int k) 
    {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pque=new PriorityQueue<>(new Comparator<int[]>(){
                        public int compare(int[] a,int[] b)
                        {
                            double x=Math.pow(a[0],2)+Math.pow(a[1],2);
                            double y=Math.pow(b[0],2)+Math.pow(b[1],2);
                            
                            return (int)(x-y);
                        }
        });
        for(int[] a:points)
            pque.add(a);
        for(int i=0;i<k;i++)
        {
            ans[i]=pque.poll();
        }
        
        return ans;
    }
}