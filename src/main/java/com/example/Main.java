package com.example;

import com.example.BinarySearchTree.BinarySearchTree;
import com.example.HashMap.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap.main(args);

        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(56);

        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(10);
        tree.add(60);
    }
}