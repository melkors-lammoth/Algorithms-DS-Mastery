package com.company;

public class node {
    private String value;
    private node next;
    private node previous;

    public node(String val){
        this.value = val;
        this.next = null;
        this.previous = null;
    }

    public node getNext(){
        return this.next;
    }

    public node getPrevious(){
        return this.previous;
    }

    public String getValue(){
        return this.value;
    }

    public void setNext(node node){
        this.next = node;
    }

    public void setPrevious(node node){
        this.previous = node;
    }
}
