class Solution 
{
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> ans=new ArrayList<>();
        int[][] list=new int[n][n];
        List<Integer> index=new ArrayList<>();
        nQueen(n,0,list,ans,index);
        return ans;
    }
    
    public void nQueen(int n,int r,int[][] list,List<List<String>> ans,List<Integer> index)
    {
        if(r==n)
        {
            List<String> comb=new ArrayList<>();
            for(int x:index)
            {
                String str="";
                for(int i=0;i<n;i++)
                {
                    if(i==x)
                        str+="Q";
                    else
                        str+=".";
                }
                comb.add(str);
            }
            ans.add(comb);
            return;
        }
        
        for(int c=0;c<n;c++)
        {
            if(isValid(list,r,c,n))
            {
                //do
                 list[r][c]=1;
                 index.add(c);
                //recur
                nQueen(n,r+1,list,ans,index);
                
                //undo
                list[r][c]=0;
                index.remove(new Integer(c));
            }
        }
    }
    
    public boolean isValid(int[][] list,int r,int c,int n)
    {
        for(int i=0;i<r;i++)
        {
            if(list[i][c]==1)
                return false;
        }
        
        int row=r;int col=c;
        while(row>=0 && col>=0)
        {
            int val=list[row][col];
            if(val==1)
                return false;
            row--;
            col--;
        }
        
        row=r;col=c;
            
        while(row>=0 && col<n)
        {
            int val=list[row][col];
            if(val==1)
                return false;
            row--;
            col++;
        }
        
        return true;
        
    }
}