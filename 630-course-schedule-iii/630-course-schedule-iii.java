class Solution 
{
    public int scheduleCourse(int[][] cou) 
    {
        Arrays.sort(cou,(x,y)->Integer.compare(x[1],y[1]));
        PriorityQueue<Integer> que=new PriorityQueue<>(Collections.reverseOrder());
        int curr=0;
        for(int[] arr:cou)
        {
            int dur=arr[0];
            int last=arr[1];
            if(dur+curr>last)
            {
                if(que.size()==0 || que.peek()<=dur)
                    continue;
                int maxD=que.remove();
                curr-=maxD;
            }
            curr+=dur;
            que.add(dur);
        }
        
        return que.size();
    }
}