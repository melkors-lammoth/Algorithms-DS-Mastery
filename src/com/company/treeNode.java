package com.company;

public class treeNode {
    private treeNode left;
    private treeNode right;
    private int value;

    public treeNode(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public treeNode getLeft(){
        return this.left;
    }

    public treeNode getRight(){
        return this.right;
    }

    public int getValue(){
        return this.value;
    }

    public void setLeft(treeNode node){
        this.left = node;
    }

    public void setRight(treeNode node){
        this.right = node;
    }
}
