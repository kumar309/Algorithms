package com.kumar.leetcode;

import java.util.*;

public class SerializeDeserializeBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);

        SerializeDeserializeBinaryTree binaryTree = new SerializeDeserializeBinaryTree();
        String serialString= binaryTree.serialize(root);
        System.out.println(serialString);

        //codec.deserialize(codec.serialize(root))
        TreeNode deserialNode = binaryTree.deserialize(binaryTree.serialize(root));
        System.out.println(deserialNode.equals(root));

    }

    static class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    };

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialHelper(root,sb);
        return  sb.toString();
    }

    private void serialHelper(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("null").append(",");
        }else{
            sb.append(root.val).append(",");
                serialHelper(root.left,sb);
            serialHelper(root.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //use a queue since we want to get the elements in FIFO order
        Queue<String> q  = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(",")));
        return deserialHelper(q);
    }
    private TreeNode deserialHelper(Queue<String> q){
        String value = q.poll();
        if(value.equals("null")){
            return  null;
        }else{
            TreeNode root = new TreeNode(Integer.parseInt(value));
            root.left = deserialHelper(q);
            root.right = deserialHelper(q);
            return  root;
        }
    }
}
