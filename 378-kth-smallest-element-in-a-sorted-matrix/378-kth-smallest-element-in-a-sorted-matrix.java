class Solution 
{
    public int kthSmallest(int[][] mt, int k) 
    {
       int n=mt.length;
       int start=mt[0][0],end=mt[n-1][n-1],mid;
       //applying binary search on range 
       while(start<=end)
       {
           mid=(start+end)/2;
           int ans=0;
           //row wise array traversal
           for(int i=0;i<n;i++)
           {
               int l=0,h=n-1,m;
               //applying binary search on each row
               while(l<=h)
               {
                   m=l+(h-l)/2;
                   if(mt[i][m]<=mid)
                       l=m+1;
                   else
                       h=m-1;
               }
               ans+=l;
           }
           if(ans<k)
               start=mid+1;
           else
               end=mid-1;
       }
        return start;
    }
}