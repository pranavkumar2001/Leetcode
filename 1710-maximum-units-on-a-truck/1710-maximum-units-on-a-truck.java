class Solution 
{
    public int maximumUnits(int[][] boxes, int truck) 
    {
        Arrays.sort(boxes,(a,b)-> Integer.compare(b[1],a[1]));
        int sum=0;
        for(int[] box:boxes)
        {
            if(truck>=box[0])
            {
                sum+=box[0]*box[1];
                truck-=box[0];
            }
            else
            {
                sum+=truck*box[1];
                return sum;
            }
        }
        return sum;
    }
}