package mustdoprograms;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.tree.TreeNode;

/***
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
 class Node{
    int value;
    Node left;
    Node right;


    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
public class MaxDepthOfBT {

    private static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftD = maxDepth(root.left);
        int rightD = maxDepth(root.right);
        return  1+ Math.max(leftD, rightD);

    }
}
