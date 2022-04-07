/*Generics, Arrays and Containers

Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).

Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.

*/




package com.company;

class node<T>{
    T data;
    node<T> next;

    node(T data){
        this.data=data;
        this.next=null;
    }
}

class SListIterate<T>{
    node<T> head;
    int length;

    SListIterate(){
        this.head=null;
        this.length=0;
    }

    public void iterate(){
        System.out.print("{ ");
        node<T> X = this.head;
        if (X == null){
            System.out.println("}");
            return ;
        }

        while (X.next != null) {
            System.out.print(String.valueOf(X.data) + " -> ");
            X = X.next;
        }
        System.out.println(String.valueOf(X.data)+"}");
    }

    public void add(T data){
        node<T> temp = new node<>(data);
        if(this.head==null)
            this.head=temp;
        else{
            node<T> X = this.head;
            while(X.next!=null){
                X=X.next;
            }

            X.next=temp;
        }

        length++;
    }

    public void add(int position,T data){

        if (position > length + 1) {
            System.out.println("Position Unavailable in LikedList");
            return;
        }

        if (position == 1) {
            node<T> temp = this.head;
            this.head = new node<T>(data);
            this.head.next = temp;
            return;
        }

        node<T> temp = this.head;
        node<T> prev = new node<T>(null);
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }
        prev.next = new node<T>(data);
        prev.next.next = temp;
    }


    void remove(T key)
    {
        node<T> prev = new node<>(null);
        prev.next = this.head;
        node<T> next = this.head.next;
        node<T> temp = this.head;
        boolean exists = false;
        if (this.head.data == key) {
            this.head = this.head.next;
            exists = true;
        }


        while (temp.next != null) {
            if (String.valueOf(temp.data).equals(String.valueOf(key))) {
                prev.next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }

        if (exists == false  &&  String.valueOf(temp.data).equals(String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        if (exists) {
            length--;
        }
        else {
            System.out.println("Given Value is not present in linked list");
        }
    }


    }
class SList<T> {
        SListIterate iterator(){
            return new SListIterate();
    }
}


public class Main{
    public static void main(String args[]){
        SList list=new SList<>();
        SListIterate l = list.iterator();
        l.add(100);
        l.add(200);
        l.add(300);
        l.iterate();

    }
}

