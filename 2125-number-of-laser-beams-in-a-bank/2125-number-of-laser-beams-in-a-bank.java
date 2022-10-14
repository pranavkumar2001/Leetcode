class Solution 
{
    public int numberOfBeams(String[] bank) 
    {
        int prev=0,curr=0,ans=0;
        for(int i=0;i<bank.length;i++)
        {
            curr=0;
            for(char ch:bank[i].toCharArray())
            {
                curr+=(ch-'0');
            }
            //System.out.println(curr);
            ans+=(prev*curr);
            if(curr!=0)
            prev=curr;
        }
        return ans;
    }
}