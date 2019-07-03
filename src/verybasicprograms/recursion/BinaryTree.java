package verybasicprograms.recursion;


public class BinaryTree {

    public static Node root;



    private Node sortedArrToBST(int[] inputArr, int start, int ep) {

        if (start > ep ) {
            return null;
        }
        int mid = (start+ ep)/2;
        Node newNode = new Node(inputArr[mid]);
        newNode.left = sortedArrToBST(inputArr, start, mid-1);
        newNode.right = sortedArrToBST(inputArr, mid+1, ep);
        return newNode;
    }
    void printPreOrderBST(Node node) {
        if (node == null){
            return;
        }
        System.out.print(node.data+" ");
        printPreOrderBST(node.left);
        printPreOrderBST(node.right);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] inputArr = new int[] {1,2,3,4,5,6,7};
        int ep = inputArr.length-1;
        root = tree.sortedArrToBST(inputArr, 0, ep);
        tree.printPreOrderBST(root);
    }
}
