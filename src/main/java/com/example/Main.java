package com.example;

import com.example.HashMap.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap(
                "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");

        System.out.println("Frequency of they: " + map.get("they"));

        map.add("They");
        System.out.println("Frequency of they after adding another they: " + map.get("they"));
    }
}