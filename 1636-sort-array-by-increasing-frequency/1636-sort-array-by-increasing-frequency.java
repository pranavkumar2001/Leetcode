class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            list.add(x);
        }
        
        Collections.sort(list,new Comparator<Integer>(){
                       public int compare(Integer a,Integer b)
                       {
                           if(map.get(a)==map.get(b))
                               return b-a;
                           else
                               return map.get(a)-map.get(b);
                       }
                     });
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(int)list.get(i);
        }
        return nums;
    }
}