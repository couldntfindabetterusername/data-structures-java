package com.example.HashMap;

public class HashMap {
    private static final int CAPACITY = 20;
    private LinkedList[] buckets;

    public HashMap() {
        this.buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++) {
            this.buckets[i] = new LinkedList();
        }
    }

    public HashMap(String sentence) {
        this();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            this.add(words[i]);
        }
    }

    public void add(String data) {
        data = data.toLowerCase();

        int index = generateHashCode(data);
        addInList(buckets[index], data);

    }

    public int get(String key) {
        key = key.toLowerCase();

        int index = generateHashCode(key);
        return getFromList(buckets[index], key);
    }

    public void remove(String key) {
        key = key.toLowerCase();

        int index = generateHashCode(key);
        buckets[index].remove(key);
    }

    private int generateHashCode(String data) {
        return Math.abs(data.hashCode()) % CAPACITY;
    }

    private void addInList(LinkedList list, String data) {
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

    private int getFromList(LinkedList list, String data) {
        Node current = list.head;
        while (current != null) {
            if (current.key.equals(data)) {
                return current.value;
            }
            current = current.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("-------- Hashmap --------");
        HashMap map = new HashMap(
                "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");

        System.out.println("Frequency of they: " + map.get("they"));

        map.add("They");
        System.out.println("Frequency of they after adding another they: " + map.get("they"));

        map.remove("they");
        System.out.println("Frequency of they after removing they: " + map.get("they"));
    }
}
