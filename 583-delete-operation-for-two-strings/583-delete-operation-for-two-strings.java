class Solution 
{
    public int minDistance(String word1, String word2) 
    {
       int m=word1.length(),n=word2.length();
        int[][] dp=new int[m][n];
        int val=longest(word1,word2,m-1,n-1,dp);
        return m+n-2*val; 
        //  (m-val) -> extra in word1 
        //  (n-val) -> extra in word2
        //on adding we get m+n-2*val
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