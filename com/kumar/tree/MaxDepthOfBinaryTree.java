package com.kumar.tree;

public class MaxDepthOfBinaryTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    TreeNode root;

    public MaxDepthOfBinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        MaxDepthOfBinaryTree tree = new MaxDepthOfBinaryTree();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        //tree.root.left.left = new TreeNode(4);
        //tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);
        System.out.println(tree.maxDepth(tree.root));
    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;

        if(root.left==null)
            return maxDepth(root.right)+1;

        if(root.right==null)
            return maxDepth(root.left)+1;

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}
