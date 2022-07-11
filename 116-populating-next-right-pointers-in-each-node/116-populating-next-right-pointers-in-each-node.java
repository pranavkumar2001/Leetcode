/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution 
{
    public Node connect(Node root) 
    {
       List<List<Node>> list=new ArrayList<>();
       Node t=connectNode(root,list);
       //System.out.println(list);
       return t;
    }
    
    public Node connectNode(Node root,List<List<Node>> list)
    {
        if(root==null)
            return root;
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            int n=que.size();
            List<Node> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                Node t=que.poll();
                temp.add(t);
                if(t.left!=null)
                    que.add(t.left);
                if(t.right!=null)
                    que.add(t.right);
            }
            list.add(temp);
        }
        for(int i=0;i<list.size();i++)
        {
            List<Node> ll=list.get(i);
            int j=0;
            for(j=0;j<ll.size()-1;j++)
            {
                ll.get(j).next=ll.get(j+1);
            }
            ll.get(j).next=null;
        }
        return root;
    }
}