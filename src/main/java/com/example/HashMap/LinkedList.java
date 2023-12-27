package com.example.HashMap;

public class LinkedList {
    public Node head;

    LinkedList() {
        this.head = null;
    }

    public void add(String data) {
        Node nodeToBeAdded = new Node(data);

        if (this.head == null) {
            this.head = nodeToBeAdded;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = nodeToBeAdded;
        }
    }

}
