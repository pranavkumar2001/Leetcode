/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public List<Double> averageOfLevels(TreeNode root) 
    {
        return average(root);
    }
    
    private List<Double> average(TreeNode root)
    {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            int size=que.size();
            double sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode q=que.poll();
                sum+=(double)q.val;
                if(q.left!=null)
                    que.offer(q.left);
                if(q.right!=null)
                    que.offer(q.right);
            }
            double avg=sum/size;
            list.add(avg);
        }
        return list;
        
    }
}