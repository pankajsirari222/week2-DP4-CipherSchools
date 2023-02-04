import java.util.*;

//Node Class
/*
 *  We can use deque and one flag variable to traverse L to R and R to L alternatively.
 *  We can use LL also to traverse and add at front and end.
 */
class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}

public class class26 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)    return list;
        boolean flag = false;
        q.offer(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> temp = new LinkedList<>();
            
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
                
                if(flag) {
                    temp.addFirst(node.val);
                }
                else {
                    temp.add(node.val);
                }
            }
            flag = !flag;
            list.add(temp);
        }
        return list;
    }
}
