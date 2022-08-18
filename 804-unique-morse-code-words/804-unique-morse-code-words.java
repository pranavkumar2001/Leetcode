class Solution 
{
    public int uniqueMorseRepresentations(String[] words) 
    {
        String[] map={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                    ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer> count=new HashMap<>();
        for(String str:words)
        {
            String temp="";
            for(char c:str.toCharArray())
            {
                int i=c-'a';
                temp+=map[i];
            }
            count.put(temp,count.getOrDefault(temp,0)+1);
        }
        return count.size();
        
    }
}