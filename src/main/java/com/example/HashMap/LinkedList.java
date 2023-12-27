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

    public void remove(String key) {
        Node current = this.head;
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    this.head = current.next;
                } else {
                    previous.next = current.next;
                }
                current.next = null;
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}
