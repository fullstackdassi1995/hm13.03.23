package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
//        for (int i = 3; i <51; i += 3){
//            myLinkedList.add(i);
//        }
//
//        myLinkedList.printLinkedList();
//
//        myLinkedList.reverse();
//        myLinkedList.printLinkedList();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);arr.add(6);
        MyQueue<Integer> myQueue = new MyQueue<>(arr);
        System.out.println(myQueue);
        myQueue.reverse();
        System.out.println(myQueue);
//        MySet<Integer> mySet = new MySet<>(arr);
//        System.out.println(arr);
//        mySet.insert(50);
//        System.out.println("========");
//        System.out.println(arr);
//        mySet.remove(21);
//        System.out.println(arr);
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
//        for (int i = 3; i <51; i += 3){
//            myLinkedList.add(i);
//        }
//        MySet<Integer> mySet2 = new MySet<>(myLinkedList);
//        System.out.println(myLinkedList);
//        MySortedSet sort1 = new MySortedSet(arr);
//        System.out.println(arr);


    }
}