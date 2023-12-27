package com.example.BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
    public BinaryNode<T> root;
    private int numOfNodes;

    public BinarySearchTree() {
        this.root = null;
        this.numOfNodes = 0;
    }

    public BinarySearchTree(T root) {
        this.root = new BinaryNode<>(root);
        this.numOfNodes = 1;
    }

    public void add(T node) {
        if (this.root == null) {
            this.root = new BinaryNode<>(node);
        } else {
            // BinaryNode<T> newNode = new BinaryNode<T>(node);
            addNode(root, node);
        }
        this.numOfNodes++;
    }

    private BinaryNode<T> addNode(BinaryNode<T> root, T node) {
        if (root == null) {
            return new BinaryNode<T>(node);
        }

        int compareResult = root.compareTo(node);
        if (compareResult > 0) {
            root.left = addNode(root.left, node);
        } else {
            root.right = addNode(root.right, node);
        }

        return root;
    }

    public void display() {
        System.out.print("[");
        display(root);
        System.out.println("]");
    }

    private void display(BinaryNode<T> root) {
        if (root == null) {
            return;
        }

        display(root.left);
        System.out.print(root.getKey() + " ");
        display(root.right);
    }

    public int size() {
        return numOfNodes;
    }

    public boolean search(T key) {
        return search(root, key);
    }

    private boolean search(BinaryNode<T> root, T key) {
        if (root == null) {
            return false;
        }

        int compareResult = root.compareTo(key);
        if (compareResult > 0) {
            return search(root.left, key);
        } else if (compareResult < 0) {
            return search(root.right, key);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("----------- Binary search tree -----------");

        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(56);

        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(10);
        tree.add(60);

        System.out.println("Size of tree: " + tree.size());
        tree.display();

        System.out.println("Searching for 20: " + tree.search(20));
        System.out.println("Searching for 30: " + tree.search(30));
        System.out.println("Searching for 65: " + tree.search(65));
    }
}