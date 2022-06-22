class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> que=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums)
            que.add(x);
        int ans=0;
        while(k-->0)
            ans=que.poll();
        return ans;
    }
}