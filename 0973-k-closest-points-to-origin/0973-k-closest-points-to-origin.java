class Solution 
{
    public int[][] kClosest(int[][] points, int k) 
    {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pque=new PriorityQueue<>(new Comparator<int[]>(){
                        public int compare(int[] a,int[] b)
                        {
                            double x=a[0]*a[0]+a[1]*a[1];
                            double y=b[0]*b[0]+b[1]*b[1];
                            
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