class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> que=new PriorityQueue<>();
        int ans=0;
        for(int x:nums)
        {
            que.add(x);
            if(que.size()>k)
            {
                ans=que.poll();
                
            }
            
        }
        ans=que.poll();
        return ans;
    }
}