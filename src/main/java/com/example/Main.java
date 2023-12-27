package com.example;

import com.example.HashMap.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap("To be or not to be");
        System.out.println("Frequency of to: " + map.get("to"));

        map.add("TO");
        System.out.println("Frequency of to after adding another to: " + map.get("TO"));
    }
}