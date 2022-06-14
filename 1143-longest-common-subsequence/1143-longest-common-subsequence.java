class Solution 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int m=text1.length(),n=text2.length();
        int[][] dp=new int[m][n];
        return longest(text1,text2,m-1,n-1,dp);
    }
    
    int longest(String t,String s,int i,int j,int[][] dp)
    {
        if(i<0 || j<0)
            return 0;
        
        if(dp[i][j]!=0)
            return dp[i][j];
        
        if(t.charAt(i)==s.charAt(j))
            return 1+longest(t,s,i-1,j-1,dp);
        
        return dp[i][j]=Math.max(longest(t,s,i-1,j,dp),longest(t,s,i,j-1,dp));
    }
}