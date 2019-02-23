package com.kumar.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(25);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(35);

        BFS bfs = new BFS();
        bfs.levelOrderTraversal(root);

    }

    public void levelOrderTraversal(TreeNode root){
        if(root==null)
            return;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.remove();
            System.out.println(node.data);

            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }
        }
    }

    public void recursiveBFS(TreeNode root){
        if(root == null){
            return;
        }


    }
}
