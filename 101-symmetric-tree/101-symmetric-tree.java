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
class Solution {
    public boolean isSymmetric(TreeNode root) 
    {
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            int n=que.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=que.poll();
                int v=Integer.MIN_VALUE;
                if(temp!=null)
                v=(int)temp.val;
                if(temp!=null)
                if(temp.left!=null)
                    que.add(temp.left);
                else
                    que.add(null);
                if(temp!=null)
                if(temp.right!=null)
                    que.add(temp.right);
                else
                    que.add(null);
                l.add(v);
            }
            int left=0,rght=l.size()-1;
            while(left<rght)
            {
                if((int)l.get(left)!=(int)l.get(rght))
                    return false;
                left++;rght--;
            }
        }
        return true;
    }
    
}