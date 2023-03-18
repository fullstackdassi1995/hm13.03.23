package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue<T> {
    ArrayList<T> arrayList;

    public MyQueue(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public void enqueue(T data){
            int length = arrayList.size();
            if (this.arrayList.get(length - 1) != null){
                arrayList.remove(length - 1);
            }
            arrayList.add(0, data);
        }

        public void dequeue(){
            arrayList.remove(0);
        }

        public int size(){
            int counter = 0;
            for (T i: arrayList) {
                counter++;
            }
            return counter;
        }

        public void  reverse(){
            for (int i = this.arrayList.size()-1; i >=0 ; i--) {
                arrayList.add(arrayList.get(i));
                arrayList.remove(i);
            }
        }

    @Override
    public String toString() {
        return "MyQueue{" +
                "arrayList=" + arrayList +
                '}';
    }
}
