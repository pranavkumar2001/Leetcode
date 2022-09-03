class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int[] alp=new int[26];
        for(char c:s.toCharArray())
            alp[c-'a']++;
        for(char c:t.toCharArray())
            alp[c-'a']--;
        for(int x:alp)
            if(x!=0)
                return false;
        
        return true;
    }
}