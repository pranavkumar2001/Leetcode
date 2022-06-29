class Solution 
{
    public int minDeletions(String s) 
    {
        int[] alp=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            alp[c-'a']++;
        }
        
        int count=0;
        Set<Integer> seen=new HashSet<>();
        for(int i=0;i<26;i++)
        {
            while(alp[i]>0 && seen.contains(alp[i]))
            {
                count++;alp[i]--;
            }
            seen.add(alp[i]);
        }
        return count;
    }
}