package com.company;

public class queue {
    private node first;
    private node last;
    private int length;

    public queue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public String peek(){
        if(this.first != null)
            return this.first.getValue();
        else
            return null;
    }

    public void enqueue(String data){
        node node = new node(data);

        if(length == 0)
            this.first = node;
        else
            this.last.setNext(node);

        this.last = node;

        length++;
    }

    public String dequeue(){
        node temp = this.first;
        this.first = temp.getNext();
        --length;

        if(length == 0)
            this.last = null;

        return temp.getValue();
    }

    public boolean isEmpty(){
        boolean result = length == 0 ? true : false;
        return result;
    }

}
