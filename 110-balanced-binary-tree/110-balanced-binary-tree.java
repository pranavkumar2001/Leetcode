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
    public boolean isBalanced(TreeNode root) 
    {
       return findHeight(root)!=-1;
    }
    
    public int findHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=findHeight(root.left);
        if(left==-1)
            return -1;
        int right=findHeight(root.right);
        if(right==-1)
            return -1;
        int val=(int)Math.abs(left-right);
        if(val>1)
            return -1;
        return 1+ Math.max(left,right);
    }
}