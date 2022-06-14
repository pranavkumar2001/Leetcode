class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int c=0;
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        while(c<first.length)
        {
            if(first[c]==last[c])
                c++;
            else
                break;
        }
        
        return c==0?"":strs[0].substring(0,c);
    }
}