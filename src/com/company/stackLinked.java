package com.company;

public class stackLinked {
    private node top;
    private node bottom;
    private int length;

    public stackLinked(){
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public String peek(){
        if(this.top != null)
            return this.top.getValue();
        else
            return null;
    }

    public void push(String data){
        node node = new node(data);
        node.setNext(this.top);
        this.top = node;

        if(length == 0)
            this.bottom = node;

        length++;
    }

    public String pop(){
        if(this.top != null) {
            node currentTop = this.top;
            this.top = currentTop.getNext();
            --length;

            if (length == 0)
                this.bottom = null;

            return currentTop.getValue();
        }
        else
            return null;
    }

    public boolean isEmpty(){
        boolean equals = this.length == 0 ? true : false;
        return equals;
    }
}
