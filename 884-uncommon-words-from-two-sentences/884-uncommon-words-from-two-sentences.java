class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        Map<String,Integer> map=new HashMap<>();
        String[] a1=s1.split(" ");
        String[] a2=s2.split(" ");
        for(String s:a1)
            map.put(s,map.getOrDefault(s,0)+1);
        for(String s:a2)
            map.put(s,map.getOrDefault(s,0)+1);
        List<String> temp=new ArrayList<>();
        for(String s:map.keySet())
            if(map.get(s)==1)
                temp.add(s);
        String[] ans=new String[temp.size()];
        for(int i=0;i<ans.length;i++)
            ans[i]=String.valueOf(temp.get(i));
        return ans;
    }
}