class Solution 
{
    public int minSetSize(int[] arr) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);
        
        Integer[] ar=new Integer[arr.length];
        for(int i=0;i<ar.length;i++)
            ar[i]=arr[i];
        
        Arrays.sort(ar,(a,b)->map.get(b)-map.get(a));
        
        int h=arr.length/2;
        int t=0,c=0;
        for(int i=0;i<ar.length;)
        {
            c+=map.get(ar[i]);
            t++;
            i+=map.get(ar[i]);
            if(c>=h)
                break;
        }
        return t;
    }
}