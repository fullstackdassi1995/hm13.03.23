package org.example;

import lombok.Getter;

import java.util.ArrayList;

public class MyLinkedList<T> {

    @Getter
    MyNode<T> root;


    public int getSize() {
        int counter = 0;
        MyNode<T> current = root;
        while (current != null ){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void add(T data){
        if(this.root == null){
            this.root = new MyNode<>(data);
        }
        else {
            MyNode<T> newNode = new MyNode<>(data);
            MyNode<T> current = this.root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }



    public MyLinkedList() {
        this.root = null;
    }

    @Override
    public String toString(){
        String str = "";
        MyNode<T> current = this.root;
        while(current != null){
            str += current.getData();
            current = current.getNext();
        }
        return str;
    }

    public void reverse(){
        if(this.root == null || this.root.getNext() == null){
            return;
        }
        MyNode<T> previous  = null;
        MyNode<T> current  = this.root;
        MyNode<T> next;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.root = previous;
    }


    public void printLinkedList() {
        MyNode<T> h = this.root;
        while (this.root != null) {
            System.out.print(this.root.data + " ");
            this.root = this.root.next;
        }
        System.out.println();
        this.root = h;
    }

}