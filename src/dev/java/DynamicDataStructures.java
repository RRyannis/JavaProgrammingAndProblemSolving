package dev.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
// working and practicing with java collections
public class DynamicDataStructures {
    public static void main(String[] args) {
//        String[] anArray = new String[20];
//        ArrayList<String> aList = new ArrayList<String>(3);
//        aList.add("One");
//        aList.add("Two");
//        aList.add("Three");
//        aList.add(0,"Four");
//        aList.add(0,"Nine");
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
//        HashMap<String, Integer> mountains = new HashMap<String, Integer>();
//        mountains.put("Everest", 29029);
//        System.out.println("Everest in the map: " + mountains.containsKey("Everest"));
//        mountains.put("K2", 28251);
//        mountains.put("Kangchenjunga", 28169);
//        mountains.put("Denali", 20335);
//        mountains.put("Fuji", 12390);
//        printMap(mountains);
//        System.out.println("Denali in the map: " +
//                mountains.containsKey("Denali"));
//        System.out.println();
//        System.out.println("Changing height of Denali.");
//        mountains.put("Denali", 20320);
//        printMap(mountains);
//        System.out.println("Removing Kangchenjunga.");
//        mountains.remove("Kangchenjunga");
//        printMap(mountains);
        HashSet<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("blue");
        printSet(colors);
        System.out.println("Colors contains blue: " + colors.contains("blue"));
        colors.remove("blue");
        HashMap<Integer, String> studentIDS = new HashMap<Integer, String>();
        studentIDS.put(5531, "George");
        studentIDS.put(9102, "John");
        System.out.println(studentIDS.get(9102))  ;
    }
//    public static void printSet(HashSet<Integer> intSet){
//        System.out.println("The set contains: ");
//        for (Object obj: intSet.toArray()){
//            Integer num = (Integer) obj;
//            System.out.println(num.intValue());
//        }
//    }
    public static void printSet(HashSet<String> colors){
        System.out.println("The set contains: ");
        for (Object obj: colors.toArray()){
            String color = (String)obj;
            System.out.println(color);
        }
    }
    public static void printMap(HashMap<String, Integer> map)
    {
        System.out.println("Map contains:");
        for (String keyMountainName : map.keySet())
        {
            Integer height = map.get(keyMountainName);
            System.out.println(keyMountainName + " --> " +
                    height.intValue() + " feet.");
        }
        System.out.println();
    }
    public class ListNode {
        private String data;
        private ListNode link;
        public ListNode(){
            data = null;
            link = null;
        }
        public ListNode(String newData, ListNode newLink){
            data = newData;
            link = newLink;
        }
        public void setData(String newData){
            data = newData;
        }
        public String getData(){
            return data;
        }
        public void setLink(ListNode newLink){
            link = newLink;
        }
        public ListNode getLink(){
            return link;
        }
    }
}


