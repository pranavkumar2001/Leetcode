class Solution 
{
    public char repeatedCharacter(String s) 
    {
        int[] alp=new int[26];
        //space and time is O(1)
        //since at max the for loop will run 27 times
        for(char c:s.toCharArray())
        {
            if(alp[c-'a']==1)
                return c;
            alp[c-'a']++;
        }
        return 'a';
        
    }
}