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
    
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> list=new ArrayList<>();
        allPaths(root,list,"");
        return list;
    }
    
    public void allPaths(TreeNode root,List<String> list,String str)
    {
        if(root==null)
            return;
        
        String temp=str+root.val+"->";
        if(root.left==null && root.right==null)
        {
            int n=temp.length();
            String t=temp.substring(0,n-2);
            list.add(t);
            return;
        }
        
        allPaths(root.left,list,temp);
        allPaths(root.right,list,temp);
    }
}