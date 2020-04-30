package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Graph {
    private int numberOfNodes;
    HashMap<Integer, ArrayList<Integer>> adjacentList;

    public Graph(){
        this.numberOfNodes = 0;
        this.adjacentList = new HashMap<Integer, ArrayList<Integer>>();
    }

    public void addVertex(int node){
        if(!adjacentList.containsKey(node)){
            adjacentList.put(node, new ArrayList<Integer>());
            numberOfNodes++;
        }
    }

    public void addEdge(int node1, int node2){
        if(adjacentList.containsKey(node1) && adjacentList.containsKey(node2)){
            ArrayList<Integer> temp1 = adjacentList.get(node1);
            ArrayList<Integer> temp2 = adjacentList.get(node2);

            if(!temp1.contains(node2) && !temp2.contains(node1)){
                temp1.add(node2);
                adjacentList.replace(node1, temp1);

                temp2.add(node1);
                adjacentList.replace(node2, temp2);
            }
        }
    }

    public void showConnections(){
        Set<Integer> allNodes = adjacentList.keySet();
        for(Integer node : allNodes){
            ArrayList<Integer> temp = adjacentList.get(node);
            String connections = "";
            for (Integer vertex : temp) {
                connections += vertex + " ";
            }
            System.out.println(node + "-->" + connections);
        }
    }


}
