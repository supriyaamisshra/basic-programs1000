package datastructure.binarytree;

public class PathsToLeaf {

    public static void printAllPaths(TreeNode root, int[] path, int len) {
        if (root ==  null) {
            return;
        }
        path[len] = root.data;
        len++;
        if (root.left == null && root.right == null) {
            printArray(path, len);
        }
        printAllPaths(root.left, path, len);
        printAllPaths(root.right, path, len);
    }

    public static void printArray(int[] path, int len) {

        for (int i = 0; i < len; i++) {
            System.out.println(" " + path[i]);
        }
        System.out.println();
    }



    public static TreeNode createBinaryTree()
    {

        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;
        node10.left=node5;
        node50.right=node55;

        return rootNode;
    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Printing all paths from root to leaf :");
        printAllPaths(rootNode,new int[1000],0);
    }
}
