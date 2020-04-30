package com.company;

import java.util.ArrayList;

public class stackArr {
    private int top;
    private int bottom;
    private int length;
    private ArrayList<String> stack;

    public stackArr(){
        stack = new ArrayList<>();
        this.top = -1;
        this.bottom = -1;
        this.length = 0;
    }

    public String peek(){
        if(this.top != -1)
            return this.stack.get(this.top);
        else
            return null;
    }

    public void push(String data){
        this.stack.add(data);
        this.top++;

        if(length == 0)
            this.bottom = 0;

        length++;
    }

    public String pop(){
        if(this.top != -1) {
            --this.top;
            --length;

            if (length == 0)
                this.bottom = -1;

            return this.stack.remove(this.top+1);
        }
        else
            return null;
    }

    public boolean isEmpty(){
        boolean equals = this.length == 0 ? true : false;
        return equals;
    }

}
