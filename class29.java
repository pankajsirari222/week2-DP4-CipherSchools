import java.util.*;

/*
 *  Queue is used for BFS. 
 */
public class class29 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)    return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            ArrayList<Integer> arr = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if(node.left != null)   q.offer(node.left);
                if(node.right != null)   q.offer(node.right);
                
                arr.add(node.val);
            }
            
            list.add(arr);
        }
        return list;
    }
}
