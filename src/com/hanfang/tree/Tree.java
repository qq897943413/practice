package com.hanfang.tree;

public class Tree {
    public Node root;

    public Node minNode(){
        Node current=root;
        Node last=null;
        while(current!=null){
            last=current;
            current=current.leftChild;
        }
        return last;
    }
    public Node maxNode(){
        Node current=root;
        Node last=null;
        while(current!=null){
            last=current;
            current=current.rightChild;
        }
        return last;
    }
    //中序遍历
    public void inOrder(Node localRoot){
        if(localRoot!=null){
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iDate+",");
            inOrder(localRoot.rightChild);
        }
    }
    public Node find(int key){
        Node current=root;
        while(current.iDate!=key){
            if(key<current.iDate){
                current=current.leftChild;
            }else {
                current=current.rightChild;
            }
            if(current==null){
                return null;
            }
        }
        return current;
    }
    public void delete(int key){}
    public void insert(int key,double dd){
        Node node=new Node();
        node.iDate=key;
        node.fDate=dd;
        if(root==null){
            root=node;
        }else {
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if(key<current.iDate){
                    current=current.leftChild;
                    if(current==null){
                        parent.leftChild=node;
                        return;
                    }
                }else {
                    current=current.rightChild;
                    if(current==null){
                        parent.rightChild=node;
                        return;
                    }
                }
            }
        }
    }
}
