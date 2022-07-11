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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> list=new ArrayList<>();
        rightView(root,list);
        return list;
    }
    
   public void rightView(TreeNode root,List list)
    {
        if(root==null)
            return;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            int n=que.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=que.poll();
                int v=(int)temp.val;
                if(temp.left!=null)
                    que.add(temp.left);
                if(temp.right!=null)
                    que.add(temp.right);
                l.add(v);
            }
           
            list.add((int)l.get(l.size()-1));
        }
    }
}