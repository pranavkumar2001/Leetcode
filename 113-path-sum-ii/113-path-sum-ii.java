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
    public List<List<Integer>> pathSum(TreeNode root, int target) 
    {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        allPath(root,new ArrayList<Integer>(),list,target);
        return list;
    }
    
    public void allPath(TreeNode root,List<Integer> temp,List<List<Integer>> list,int target)
    {
        if(root==null)
            return;
        temp.add(root.val);
        if(root.left==null && root.right==null && target==root.val)
               list.add(new ArrayList<Integer>(temp));
        //System.out.println(temp+" "+target);
        allPath(root.left,temp,list,target-root.val);
        //System.out.println(temp.get(temp.size()-1));
        allPath(root.right,temp,list,target-root.val);
        temp.remove(temp.size()-1);
    }
}