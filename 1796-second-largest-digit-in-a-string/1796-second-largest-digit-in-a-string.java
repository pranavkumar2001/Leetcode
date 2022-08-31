class Solution 
{
    public int secondHighest(String s) 
    {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(char c:s.toCharArray())
        {
            if(c>='0' && c<='9')
            {
                int t=c-'0';
                if(t>largest)
                {
                    second=largest;
                    largest=t;
                }
                else if(t<largest && t>second)
                    second=t;
            }
        }
        if(second==Integer.MIN_VALUE)
            second=-1;
        return second;
    }
}