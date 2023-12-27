package com.example.BinarySearchTree;

public class BinaryNode<T extends Comparable<T>> implements INode<T>, Comparable<T> {
    private T key;
    public BinaryNode<T> left;
    public BinaryNode<T> right;

    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public T getKey() {
        return this.key;
    }

    @Override
    public int compareTo(T o) {
        if (this == o)
            return 0;

        // BinaryNode other = (BinaryNode) o;
        return this.key.compareTo(o);
    }
}
