class Solution 
{
    public List<String> topKFrequent(String[] words, int k) 
    {
        Map<String,Integer> map=new HashMap<>();
        for(String s:words)
            map.put(s,map.getOrDefault(s,0)+1);
        PriorityQueue<Map.Entry<String,Integer>> pque=new PriorityQueue<>(new Comparator<>(){
                    public int compare(Map.Entry<String,Integer> a,Map.Entry<String,Integer> b)
                    {
                        if(a.getValue()==b.getValue())
                               return a.getKey().compareTo(b.getKey());

                        return b.getValue()-a.getValue();
                    }
        });
       
        for(Map.Entry<String,Integer> mp:map.entrySet())
        {
            pque.add(mp);
        }
            
         //System.out.println(pque);
        List<String> list=new ArrayList<>();
        for(int i=0;i<k;i++)
            list.add(pque.poll().getKey());
        return list;
    }
}