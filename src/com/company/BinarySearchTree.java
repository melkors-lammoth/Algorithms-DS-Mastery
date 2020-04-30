package com.company;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class BinarySearchTree {
    private treeNode root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        treeNode node = new treeNode(value);

        if(this.root != null){
            treeNode parent = this.root;

            while(parent.getRight() != null || parent.getLeft() != null){
                if(node.getValue() <= parent.getValue()) {
                    if (parent.getLeft() != null)
                        parent = parent.getLeft();
                    else
                        break;
                } else {
                    if(parent.getRight() != null)
                        parent = parent.getRight();
                    else
                        break;
                }
            }

            if(value <= parent.getValue()){
                System.out.println("setting left : " + parent.getValue() + " : " + value);
                parent.setLeft(node);
            } else {
                System.out.println("setting right : " + parent.getValue() + " : " + value);
                parent.setRight(node);
            }
        } else {
            this.root = node;
            System.out.println("setting root: " + value);
        }
    }

    public treeNode lookup(int value){

        if(this.root != null){
            treeNode current = this.root;

            while(true){
                if(value == current.getValue())
                    break;

                if(value < current.getValue()){
                    if(current.getLeft() != null)
                        current = current.getLeft();
                    else
                        break;
                } else {
                    if(current.getRight() != null)
                        current = current.getRight();
                    else
                        break;
                }
            }

            if(value == current.getValue())
                return current;
            else
                return null;
        } else {
            return null;
        }
    }

    public void printTree(){
       System.out.println(traverse(this.root));

    }

    public String traverse(treeNode node){
        String tree = "value: " + node.getValue() + "\n";
        String right;
        String left;

        tree += node.getRight() != null ? traverse(node.getRight()): "";
        tree +=  node.getLeft() != null ? traverse(node.getLeft()): "";

        return tree;


    }

    public ArrayList<Integer> breadthFirstSearch(){
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<treeNode> q = new ArrayList<treeNode>();
        treeNode currentNode = this.root;
        q.add(currentNode);

        while(q.size() > 0){
            currentNode = q.remove(0);
            result.add(currentNode.getValue());

            if(currentNode.getLeft() != null){
                q.add(currentNode.getLeft());
            }

            if(currentNode.getRight() != null){
                q.add(currentNode.getRight());
            }
        }
        return result;
    }

    public ArrayList<Integer> breadthFirstSearchR(ArrayList<treeNode> q, ArrayList<Integer> list){
        if(q.size() == 0) {
            return list;
        }

        treeNode node = q.remove(0);
        list.add(node.getValue());

        //recursive case: left,right
        if(node.getLeft() != null){
            q.add(node.getLeft());
        }

        if(node.getRight() != null){
            q.add(node.getRight());
        }


        return breadthFirstSearchR(q, list);
    }

    public treeNode getRoot(){
        return this.root;
    }

    public ArrayList<Integer> DFSInorder(treeNode node, ArrayList<Integer> list){

        if(node.getLeft() != null){
            DFSInorder(node.getLeft(), list);
        }

        list.add(node.getValue());

        if(node.getRight() != null){
            DFSInorder(node.getRight(), list);
        }

        return list;
    }

    public ArrayList<Integer> DFSPreorder(treeNode node, ArrayList<Integer> list){

        list.add(node.getValue());

        if(node.getLeft() != null){
            DFSPreorder(node.getLeft(), list);
        }

        if(node.getRight() != null){
            DFSPreorder(node.getRight(), list);
        }

        return list;
    }

    public ArrayList<Integer> DFSPostorder(treeNode node, ArrayList<Integer> list){

        if(node.getLeft() != null){
            DFSPostorder(node.getLeft(), list);
        }

        if(node.getRight() != null){
            DFSPostorder(node.getRight(), list);
        }

        list.add(node.getValue());

        return list;
    }

    public boolean isValidTree(){
        return isValidRoot(this.root);
    }

    public boolean isValidRoot(treeNode node){

        if(node.getLeft() == null && node.getRight() == null)
            return true;


        boolean valid = false;

        if(node.getLeft() != null)
            if(node.getLeft().getValue() < node.getValue())
                valid = isValidRoot(node.getLeft());

        if(node.getRight() != null)
            if(node.getRight().getValue() > node.getValue())
                valid = isValidRoot(node.getRight());

        return valid;
    }

    public void popFakeTree(){
        this.root = new treeNode(4);
        this.root.setRight(new treeNode(1));


    }


}
