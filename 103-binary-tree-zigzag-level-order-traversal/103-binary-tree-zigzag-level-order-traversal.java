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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        levelorder(root,list);
        return list;
    }
    
    public void levelorder(TreeNode root,List list)
    {
        if(root==null)
            return;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        boolean flag=true;
        while(!que.isEmpty())
        {
            flag=!flag;
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
            if(flag)
                reverse(l);
            list.add(l);
        }
    }
    
    public void reverse(List<Integer> list)
    {
        int l=0,r=list.size()-1;
        while(l<r)
        {
            int temp=(int)list.get(l);
            list.set(l,(int)list.get(r));
            list.set(r,temp);
            l++;r--;
            
        }
    }
}