class Solution 
{
    public int countWords(String[] words1, String[] words2) 
    {
        Map<String,Integer> map=new HashMap<>();
        for(String s:words1)
         map.put(s,map.getOrDefault(s,0)+1);
        for(String s:words2)
        {
            if(map.containsKey(s) && map.get(s)<2)
                map.put(s,map.getOrDefault(s,0)-1);
        }
        int count=0;
        for(String k:map.keySet())
        {
            //System.out.println(k+" "+map.get(k));
            if(map.get(k)==0)
                count++;
        }
        return count;
    }
}