package datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public TreeNode root;

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
         while (!queue.isEmpty()) {
             TreeNode temp = queue.poll();
             System.out.printf("%d ", temp.data);
             if (temp.left != null) {
                 queue.add(temp.left);
             }
             if (temp.right != null) {
                 queue.add(temp.right);
             }
         }
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

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }

    public static void main(String[] args) {
        TreeNode rootNode=createBinaryTree();
        System.out.println("Level Order traversal of binary tree will be:");
        levelOrder(rootNode);
    }


}
