package com.company;

import java.util.ArrayList;

public class linkedList {
    private node head;
    private node tail;
    private int length;

    public linkedList(String data){
        this.head = new node(data);
        this.tail = this.head;
        this.length = 1;
    }

    public void insert(int position, String data){

         if(position > length-1){
             append(data);
         }
         else if(position == 0){
             prepend(data);
         }
         else {
             node previous = this.head;
             node current = this.head.getNext();
             node newNode = new node(data);

             for (int i = 1; i < position; i++) {
                 previous = current;
                 current = current.getNext();
             }

             previous.setNext(newNode);
             newNode.setPrevious(previous);
             newNode.setNext(current);
             current.setPrevious(newNode);

             this.length++;
         }
    }

    public void delete(int position){
        if(position == 0){
            this.head = this.head.getNext();
            head.setPrevious(null);
            --this.length;
        }
        else if(position <= this.length-1 && position > 0){
            node previous = this.head;
            node current = this.head.getNext();

            for (int i = 1; i < position; i++) {
                previous = current;
                current = current.getNext();
            }

            previous.setNext(current.getNext());

            if(position == this.length-1)
                this.tail = previous;
            else
                current.getNext().setPrevious(previous);

            --this.length;
        }
    }

    public void reverseSingly(){
        node prev = null;
        node current = this.head;
        node next;

        this.tail = this.head;

        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        this.head = prev;

    }

    public void append(String data){
        node tail = this.tail;
        node newNode = new node(data);
        tail.setNext(newNode);
        newNode.setPrevious(tail);
        this.tail = newNode;
        this.length++;
    }

    public void prepend(String data){
        node head = this.head;
        node newNode = new node(data);
        newNode.setNext(head);
        head.setPrevious(newNode);
        this.head = newNode;
        length++;
    }

    public String getHead(){
        return this.head.getValue();
    }

    public String getTail(){
        return this.tail.getValue();
    }

    public int getLength(){
        return this.length;
    }

    public String print(){
        node node = this.head;
        String result = "{value: " + node.getValue() + "}";

        while(node.getNext() != null){
            node = node.getNext();
            result = result + ", {value: " + node.getValue() + "}";
        }

        return result;
    }

    public ArrayList<String> printList(){
        node node = this.head;
        ArrayList<String> result = new ArrayList<String>();

        while(node != null){
            result.add(node.getValue());
            node = node.getNext();
        }

        return result;
    }
}
