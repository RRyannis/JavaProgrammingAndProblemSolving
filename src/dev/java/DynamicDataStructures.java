package dev.java;

import java.util.ArrayList;

public class DynamicDataStructures {
    public static void main(String[] args) {
        String[] anArray = new String[20];
        ArrayList<String> aList = new ArrayList<String>(3);
        aList.add("One");
        aList.add("Two");
        aList.add("Three");
        aList.add(0,"Four");
        System.out.println(aList.get(0));
    }
}
