class Solution 
{
    public boolean halvesAreAlike(String s) 
    {
        Set<Character> set=new HashSet<>();
        set.add('a');set.add('e');set.add('i');
        set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');
        set.add('O');set.add('U');
        int left=0,right=s.length()-1,vowel1=0,vowel2=0;
        while(left<right)
        {
            char a=s.charAt(left),b=s.charAt(right);
            if(set.contains(a))vowel1++;
            if(set.contains(b))vowel2++;
            left++;
            right--;
        }
        return vowel1==vowel2;
    }
}