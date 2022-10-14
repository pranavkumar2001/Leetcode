class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        char[] f=num1.toCharArray();
        char[] s=num2.toCharArray();
        int i=f.length-1,j=s.length-1;
        int carry=0;
        String add="";
        while(i>=0 || j>=0)
        {
            int x=0,y=0;
            
            if(i>=0)
            x=f[i--]-'0';
            
            if(j>=0)
            y=s[j--]-'0';
            
            int sum=x+y+carry;
            
            int ans=sum%10;
            carry=sum/10;
            add=String.valueOf(ans)+add;
        }
        
        if(carry!=0)
        add=String.valueOf(carry)+add;
        
        return add;
    }
}