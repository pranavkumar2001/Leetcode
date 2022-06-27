class Solution 
{
    public boolean stoneGame(int[] pi) 
    {
        // if(pi.length==2)
        //     return true;
        // int sum=0;
        // for(int x:pi)
        //     sum+=x;
        // int a=win(pi,1,pi.length-1,0);
        // int b=win(pi,0,pi.length-2,0);
        // int max=Math.max(a,b);
        // return max>sum-max;
        return true;
    }
    
    public int win(int[] pi,int i,int j,int max)
    {
         if(i>=j)
             return 0;
         int a=pi[i]+win(pi,i+1,j,max);
         int b=pi[j]+win(pi,i,j-1,max);
        
         return Math.max(a,b);
    }
}