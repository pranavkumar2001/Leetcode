class Solution 
{
    public int furthestBuilding(int[] hei, int bri, int lad) 
    {
        PriorityQueue<Integer> pqe=new PriorityQueue<>();
        int n=hei.length;
        for(int i=0;i<n-1;i++)
        {
            int temp=hei[i+1]-hei[i];
            if(temp>0)
                pqe.add(temp);
             if(pqe.size() > lad)
             { // all ladders used up
                    bri -= pqe.poll(); // use bricks then
             }
            if(bri < 0) return i; // climacteric 
        }
            
        return n-1;
    }
}