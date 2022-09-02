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
    public int goodNodes(TreeNode root) 
    {
       int[] max={root.val};
       int count=preorder(root,max,0);
       return count;
    }
    
    public int preorder(TreeNode root,int[] max,int count)
    {
       if(root==null)
           return count;
       if(root.val>=max[0])
           count++;
       max[0]=Math.max(max[0],root.val);
       int temp=max[0];
       count=preorder(root.left,max,count);
       max[0]=temp;
       count=preorder(root.right,max,count);
       return count;
    }
}