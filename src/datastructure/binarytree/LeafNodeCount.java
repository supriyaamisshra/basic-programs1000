package datastructure.binarytree;

public class LeafNodeCount {

    public static int countLeaf(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if ( root.left == null && root.right == null ) {

            return 1;
        } else {
            return countLeaf(root.left)+ countLeaf(root.right);
        }


    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.print("total leaf nodes in binary tree : ");
        System.out.println(countLeaf(rootNode));
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
}
