class Solution 
{
    public int maxConsecutiveAnswers(String ans, int k) 
    {
        return Math.max(setFalse(ans,k),setTrue(ans,k));
    }
    
    public int setFalse(String ans,int k)
    {
         int count=0,max=0,l=0;
         char[] chr=ans.toCharArray();
         for(int i=0;i<chr.length;i++)
         {
             if(chr[i]=='F')
                 count++;
             while(count>k)
             {
                 if(chr[l]=='F')
                     count--;
                 l++;
             }
             max=Math.max(max,i-l+1);
         }
        return max;
    }
    
     public int setTrue(String ans,int k)
    {
         int count=0,max=0,l=0;
         char[] chr=ans.toCharArray();
         for(int i=0;i<chr.length;i++)
         {
             if(chr[i]=='T')
                 count++;
             while(count>k)
             {
                 if(chr[l]=='T')
                     count--;
                 l++;
             }
             max=Math.max(max,i-l+1);
         }
         return max;
    }
    
}