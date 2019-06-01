package com.kumar.leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class SerializeDeserializeNAryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node ch1 = new Node(2);
        Node ch2 = new Node(3);
        Node ch3 = new Node(4);
        Node ch4 = new Node(5);
        root.children.add(ch1);
        root.children.add(ch2);
        root.children.add(ch3);
        root.children.add(ch4);

        SerializeDeserializeNAryTree nAryTree = new SerializeDeserializeNAryTree();
        String serialString= nAryTree.serialize(root);
        System.out.println(serialString);

        //codec.deserialize(codec.serialize(root))
        Node deserialNode = nAryTree.deserialize(nAryTree.serialize(root));
        System.out.println(deserialNode.equals(root));

    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node(int _val) {
            val = _val;
            this.children = new ArrayList<Node>();
        }

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    // Encodes a tree to a single string.
    public String serialize(Node root) {
        StringBuilder sb = new StringBuilder();
        serialHelper(root,sb);
        return  sb.toString();
    }

    private void serialHelper(Node root, StringBuilder sb){
        if(root==null){
            sb.append("null").append(",");
        }else{
            sb.append(root.val).append(",");
            sb.append(root.children.size()).append(",");

            for(int i=0; i < root.children.size();i++){
                //sb.append(root.children.get(i)).append(",");
                serialHelper(root.children.get(i),sb);
            }
        }
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        //use a queue since we want to get the elements in FIFO order
        Queue<String> q  = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(",")));
        return deserialHelper(q);
    }
    private Node deserialHelper(Queue<String> q){
        String value = q.poll();
        if(value.equals("null")){
            return  null;
        }else{
            int size = Integer.parseInt(q.poll());
            Node root = new Node(Integer.parseInt(value));
            root.children = new ArrayList<>(size);
            for(int i=0; i < size; i++){
                root.children.add(deserialHelper(q));
            }
            return  root;
        }
    }


}
