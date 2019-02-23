package com.kumar.tree;

import java.util.ArrayList;
import java.util.Stack;

//             1
//            /\
//           /  \
//          2    3
//         /\   / \
//        /  \ /   \
//       4   5 6    7

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        ArrayList<Integer> al = tree.preOrderTraversal(tree.root);
        System.out.println("PreOrderTraversal:");
        for (int i : al) {
            System.out.println(" " + i);
        }

        System.out.println("Recursive preOrderTraversal");
        tree.preOrderTraversalRecursive(tree.root);
    }

    public ArrayList<Integer> preOrderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        s.push(root);

        while (!s.empty()) {
            TreeNode tmp = s.pop();
            res.add(tmp.data);

            if (tmp.right != null) {
                s.push(tmp.right);
            }
            if (tmp.left != null) {
                s.push(tmp.left);
            }
        }
        return res;
    }

    public void preOrderTraversalRecursive(TreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrderTraversalRecursive(root.left);
            preOrderTraversalRecursive(root.right);
        }
    }
}
