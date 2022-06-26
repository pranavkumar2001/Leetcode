class Solution 
{
    public int maxScore(int[] card, int k) 
    {
       int tsum=0,n=card.length,minsum=Integer.MAX_VALUE,l=0,winsize=0,temp=0;
       for(int x:card)
           tsum+=x;
       for(int i=0;i<n;i++)
       {
           winsize++;
           if(winsize>n-k)
           {
               minsum=Math.min(temp,minsum);
               temp-=card[l++];
               winsize--;
           }
           temp+=card[i];
       }
        minsum=Math.min(minsum,temp);
        return tsum-minsum;
    }
}