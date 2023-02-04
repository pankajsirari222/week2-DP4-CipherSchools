class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
} 

public class class24 {
    /*
     * Check if it is Full Binary Treee or Not.
     * Full Binary Tree consists of 0 or 2 children only.
     */
    public static boolean isFullBinaryTree(Node root) {
        if(root == null)    return true;
        if(root.left == null && root.right == null) return true;
        if(root.left != null && root.right != null) {
              boolean isLeftFBT = isFullBinaryTree(root.left);  
              boolean isRightFBT = isFullBinaryTree(root.right);  

              return isLeftFBT && isRightFBT;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        root.left.left.left = new Node(80);
        root.right.right = new Node(70);
        root.left.left.right = new Node(90);
        root.left.right.left = new Node(80);
        root.left.right.right = new Node(90);
        root.right.left.left = new Node(80);
        root.right.left.right = new Node(90);
        root.right.right.left = new Node(80);
        root.right.right.right = new Node(90);

        System.out.println(isFullBinaryTree(root));
          
    }
}