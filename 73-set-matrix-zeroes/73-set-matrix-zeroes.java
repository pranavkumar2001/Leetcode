class Solution 
{
    public void setZeroes(int[][] mat) 
    {
        int m=mat.length;
        int n=mat[0].length;
        int[] row=new int[200];
        int[] col=new int[200];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(row[i]==1 || col[j]==1)
                    mat[i][j]=0;
            }
        }
    }
}