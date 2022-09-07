class Solution 
{
    public boolean searchMatrix(int[][] mat, int tar) 
    {
        int m=0,n=mat[0].length-1;
        while(mat[m][n]<tar && m<=mat.length-2)
            m++;
        return binarySearch(mat,m,0,n,tar);
    }
    
    public boolean binarySearch(int[][] mat,int r,int l,int h,int tar)
    {
        if(l<=h)
        {
            int mid=l+(h-l)/2;
            if(mat[r][mid]==tar)
                return true;
            else if(mat[r][mid]>tar)
                return binarySearch(mat,r,l,mid-1,tar);
            else
                return binarySearch(mat,r,mid+1,h,tar);
        }
        return false;
    }
}