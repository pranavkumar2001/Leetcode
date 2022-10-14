class Solution 
{
    public List<Integer> partitionLabels(String s) 
    {
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
           map.put(c,i);
        }
        
        int i=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            int st=i;
            int max=map.get(c);
            while(i<=max)
            {
               c=s.charAt(i);
               max=Math.max(max,map.get(c));
               i++;
            }
            int len=max-st+1;
            list.add(len);
            i=max+1;
        }
        return list;
    }
}