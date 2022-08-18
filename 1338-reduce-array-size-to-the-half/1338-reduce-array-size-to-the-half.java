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
        
        Arrays.sort(ar,new Comparator<>(){
            public int compare(Integer a,Integer b)
            {
                if(map.get(a)!=map.get(b))
                    return map.get(b)-map.get(a);
                return a-b;
            }
        });
        
        // System.out.println("l "+ar.length);
        // for(int x:ar)
        //     System.out.println(x);
        
        int h=arr.length/2;
        int t=0,c=0;
        for(int x:ar)
        {
            c+=map.get(x);
            if(map.get(x)!=0)
              t++;
            map.put(x,0);
            // System.out.println("c "+c);
            // System.out.println("t "+t);
            if(c>=h)
                break;
        }
        return t;
    }
}