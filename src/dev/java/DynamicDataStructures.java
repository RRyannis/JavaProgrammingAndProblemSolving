package dev.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DynamicDataStructures {
    public static void main(String[] args) {
//        String[] anArray = new String[20];
//        ArrayList<String> aList = new ArrayList<String>(3);
//        aList.add("One");
//        aList.add("Two");
//        aList.add("Three");
//        aList.add(0,"Four");
//        System.out.println(aList.get(0));
//        HashSet<Integer> intSet = new HashSet<Integer>();
//        intSet.add(1);
//        intSet.add(2);
//        intSet.add(3);
//        intSet.add(2);
//        intSet.add(5);
//        intSet.add(4);
//        intSet.add(7);
//        printSet(intSet);
//        System.out.println("Set contains 2: " +
//                intSet.contains(2));
//        System.out.println("Set contains 4: " +
//                intSet.contains(4));
        HashMap<String, Integer> mountains = new HashMap<String, Integer>();
        mountains.put("Everest", 29029);
        System.out.println("Everest in the map: " + mountains.containsKey("Everest"));
    }
    public static void printSet(HashSet<Integer> intSet){
        System.out.println("The set contains: ");
        for (Object obj: intSet.toArray()){
            Integer num = (Integer) obj;
            System.out.println(num.intValue());
        }
    }
}
