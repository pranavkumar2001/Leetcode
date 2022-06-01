class Solution 
{
    public int firstUniqChar(String s) 
    {
        char[] str=s.toCharArray();
        int[] alp=new int[26];
        for(char c:str)
            alp[c-'a']++;
        for(int i=0;i<str.length;i++)
        {
            int ind=str[i]-'a';
            if(alp[ind]==1)
                return i;
        }
        return -1;
    }
}