package recursion;

public class MaxNodeInBST {

    public static int maxNode(Node root){
     if (root == null) {
         return -1;
     }
     if (root.right == null) {
         return root.data;
     }
     return maxNode(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.right.left = new Node(11);
        root.right.right = new Node(14);
        root.right.left.right = new Node(13);
        root.right.right.right = new Node(16);
        System.out.println(maxNode(root));

    }

}
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;
    }
}