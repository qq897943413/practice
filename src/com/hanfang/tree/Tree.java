package com.hanfang.tree;


public class Tree {
    public Node root;

    public Node minNode() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }


    public Node maxNode() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    //中序遍历
    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iDate + ",");
            inOrder(localRoot.rightChild);
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current.iDate != key) {
            if (key < current.iDate) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.iDate != key) {
            parent = current;
            if (key < current.iDate) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        } // end while ,find specified node

        //current node have no child
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {//  have two node
            Node successor = getSuccessor(current);
            successor.leftChild = current.leftChild;
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
        }
        return true;
    }

    public void insert(int key, double dd) {
        Node node = new Node();
        node.iDate = key;
        node.fDate = dd;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.iDate) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }
}
