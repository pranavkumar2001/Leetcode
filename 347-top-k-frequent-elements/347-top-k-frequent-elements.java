class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pqe=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        for(int x:list)
            pqe.add(x);
        int[] arr=new int[k];
        int c=0;
        while(c<k)
        {
            arr[c]=pqe.poll();
            c++;
        }
        return arr;
    }
}