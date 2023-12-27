package com.example.HashMap;

public class HashMap {
    private LinkedList list;

    public HashMap() {
        this.list = new LinkedList();
    }

    public HashMap(String sentence) {
        this.list = new LinkedList();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            this.add(words[i]);
        }
    }

    public void add(String data) {
        data = data.toLowerCase();

        Node current = list.head;
        while (current != null) {
            if (current.key.equals(data)) {
                current.value++;
                return;
            }
            current = current.next;
        }

        list.add(data);
    }

    public int get(String data) {
        data = data.toLowerCase();

        Node current = list.head;
        while (current != null) {
            if (current.key.equals(data)) {
                return current.value;
            }
            current = current.next;
        }
        return 0;
    }
}
