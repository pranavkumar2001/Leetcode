// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][] dp=new int[n][W+1];
         return kSack(W,wt,val,n-1,dp);
    } 
    
    static int kSack(int w,int[] wt,int[] vl,int i,int[][] dp)
    {
        if(i==0)
         {
             if(wt[0]<=w)
               return vl[0];
             return 0;
         }
         if(dp[i][w]!=0)
           return dp[i][w];
           
         int notpick=kSack(w,wt,vl,i-1,dp);
         int pick=Integer.MIN_VALUE;
         if(wt[i]<=w)
          pick=vl[i]+kSack(w-wt[i],wt,vl,i-1,dp);
          
         return dp[i][w]=Math.max(pick,notpick);
    }
}


