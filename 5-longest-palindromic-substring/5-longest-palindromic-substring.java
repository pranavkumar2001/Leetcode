class Solution 
{
    public String longestPalindrome(String str) 
    {
        int max=0,n=str.length();
        String ans="";
        int[] ind=new int[2];
        boolean flag=true;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
            dp[i][i]=1;
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
                dp[i][i+1]=1;
            else
                dp[i][i+1]=0;
            if(dp[i][i+1]==1 && flag)
            {
                ind[0]=i;ind[1]=i+1;
                flag=false;
                max=2;
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i+2;j<n;j++)
            {
                //it checks the first and last char and whether in between str is palindrome or not
                if((str.charAt(i)==str.charAt(j)) && dp[i+1][j-1]==1) 
                    dp[i][j]=1;
                else
                    dp[i][j]=0;
                
                if(dp[i][j]==1 && max<j-i+1)
                {
                    max=j-i+1;
                    ind[0]=i;ind[1]=j;
                }
                
            }
        }
        
        for(int i=ind[0];i<=ind[1];i++)
        {
            ans+=str.charAt(i)+"";
        }
        
        
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //         System.out.print(dp[i][j]+" ");
        //     System.out.println();
        // }
        return ans;
    }
}