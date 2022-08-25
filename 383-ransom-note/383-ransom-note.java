class Solution 
{
    public boolean canConstruct(String rans, String mag) 
    {
        int[] alp=new int[26];
        for(char c:mag.toCharArray())
            alp[c-'a']++;
        for(char c:rans.toCharArray())
        {
            if(alp[c-'a']<=0)
                return false;
            alp[c-'a']--;
        }
        return true;
    }
}