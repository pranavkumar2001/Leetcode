class Solution 
{
    public int[] intersect(int[] num1, int[] num2) 
    {
        List<Integer> list=new ArrayList<>();
        int[] farr=new int[1001];
        int[] sarr=new int[1001];
        for(int i=0;i<num1.length;i++)
            farr[num1[i]]++;
        for(int i=0;i<num2.length;i++)
            sarr[num2[i]]++;
        for(int i=0;i<farr.length;i++)
        {
            int min=Math.min(farr[i],sarr[i]);
            for(int k=0;k<min;k++)
                list.add(i);
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)list.get(i);
        return arr;
    }
}