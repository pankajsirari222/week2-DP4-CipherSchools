import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
public class class1 {
    static int diameter = 0;
    public static int height(Node node)         // Height of a Binary Tree
    {
        if(node == null)    return 0;

        int left = height(node.left);
        int right = height(node.right);
        //Diameter of BT
        diameter = Math.max(diameter, left+right);

        return Math.max(left, right) + 1;
    }

    public static int diameterOfBT(Node node) {     //Function for calculating diameter
        height(node);
        return diameter;
    }
    // Longest path from root to leaf node
    /*
     * Create two arrays left and right and call recursively for these two subtrees.
     *  Add root to the array with greater size and then  at last return it . l
     */
    public static ArrayList<Integer> longestPath(Node root) {   
        
        if(root == null)    return new ArrayList<>();
        ArrayList<Integer> left = longestPath(root.left);
        ArrayList<Integer> right = longestPath(root.right);

        if(right.size() > left.size())  right.add(root.data);
        else left.add(root.data);

        return (left.size() > right.size() ? left : right); 
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(7);
        root.right.left = new Node(4);
        root.right.left.left = new Node(8);
        root.right.right = new Node(12);
        root.right.right.right = new Node(11);
        root.right.right.right.right = new Node(10);

        System.out.println(height(root));
        System.out.println(diameterOfBT(root));
        System.out.println(longestPath(root));
    }
}