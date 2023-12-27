package com.example.BinarySearchTree;

public interface INode<T extends Comparable<T>> {
    T getKey();

    void setKey(T key);
}
