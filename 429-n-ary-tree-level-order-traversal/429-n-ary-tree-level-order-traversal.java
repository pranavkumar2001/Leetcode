/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) 
    {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            int n=que.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                Node node=que.poll();
                temp.add(node.val);
                for(Node c:node.children)
                    que.add(c);
            }
            list.add(temp);
        }
        return list;
    }
}