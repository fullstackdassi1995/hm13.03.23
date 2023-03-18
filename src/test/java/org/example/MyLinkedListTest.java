package org.example;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {


    @org.junit.jupiter.api.Test
    void reverse() {
        Random random = new Random();

        int max = 10;
        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = random.nextInt(500);
        }
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        for (int i = max-1; i >= 0; i --){
            myLinkedList.add(arr[i]);
        }
        myLinkedList.reverse();
        for (int i: arr) {
            Assertions.assertEquals(i, myLinkedList.getRoot().data);
            myLinkedList.root = myLinkedList.root.next;
        }
    }
}