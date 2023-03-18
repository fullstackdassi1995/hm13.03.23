package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class MySet<T> implements IMySet<T>{
    ArrayList<T> arrayList;

    public MySet(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }



    public MySet(MyLinkedList<T> linkedList) {
        MyNode<T> current = linkedList.getRoot();
        while (linkedList.getRoot().next == null){
            arrayList.add(linkedList.getRoot().data);
            current = current.getNext();
        }
    }

    @Override
    public String toString() {
        return "MySet{" +
                "arrayList=" + arrayList +
                '}';
    }

    public void insert(T data){
        for (T i:arrayList) {
            if (i.equals(data)){
                return;
            }
        }
        arrayList.add(data);
    }

    public void add(T data){
        arrayList.add(data);
    }
@Override
    public void remove(T data){
        for (T i:arrayList) {
            if (i.equals(data)){
                arrayList.remove(i);
            }
        }
    }
    @Override
    public int size(){
        int counter = 0;
        for (T i:arrayList) {
            counter++;
        }
        return counter;

    }


}
