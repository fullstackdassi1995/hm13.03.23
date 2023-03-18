package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class MySortedSet<T> implements IMySet<T>{
    ArrayList<T> arrayList;

    public MySortedSet(ArrayList<T> arrayList) {
        arrayList.sort((Comparator<? super T>) Comparator.naturalOrder());
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "MySortedSet{" +
                "arrayList=" + arrayList +
                '}';
    }

    @Override
    public void remove(T data){
        for (T i:arrayList) {
            if (i == data){
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
