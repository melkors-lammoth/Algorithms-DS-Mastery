package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static HashMap<Integer, Integer> fibMap = new HashMap<>();

    public static void main(String[] args) {
        //reverseString("hello there");

        //int[] a = {0, 3, 4, 31};
        //int[] b = {4, 6, 30};
        //System.out.println(Arrays.toString(mergeSortedArrays(a, b)));
        //System.out.println("Real prime numbers : " + Arrays.toString(primes));

        //char[] arr = {'2', 'a', '1', 'a'};
        //System.out.println(firstRecurringChar(arr));

        //LINKED LIST
        //linkedList lList = new linkedList("10");
        //lList.reverseSingly();
        //lList.append("hi");
        //lList.append("sup");
        //lList.append("hello");
        //lList.prepend("nah");
        //lList.insert(3,"trouble");

        //STACK
       /* stackArr myStack = new stackArr();
        myStack.push("Discord");
        myStack.push("Udemy");
        myStack.push("Google");
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());*/

       //QUEUE
        /*queue myQueue = new queue();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.enqueue("Joy");
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.enqueue("Bob");
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.enqueue("Terry");
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.dequeue();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.dequeue();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.dequeue();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.enqueue("Joy");
        System.out.println(myQueue.isEmpty());*/

        //BINARY TREE
        //BinarySearchTree tree = new BinarySearchTree();
        ///tree.insert(6);
        //tree.insert(3);
       // tree.insert(4);
        //tree.insert(9);
        //tree.insert(8);
        //tree.insert(34);
        //tree.printTree();
        //System.out.println(tree.lookup(8).getValue());
        //ArrayList<treeNode> q = new ArrayList<treeNode>();
        //q.add(tree.getRoot());
       // System.out.println(tree.DFSInorder(tree.getRoot(), new ArrayList<Integer>()));
       // System.out.println(tree.DFSPostorder(tree.getRoot(), new ArrayList<Integer>()));
       // System.out.println(tree.DFSPreorder(tree.getRoot(), new ArrayList<Integer>()));
        //System.out.println(tree.breadthFirstSearch());

        //BinarySearchTree tree2 = new BinarySearchTree();
        //tree2.popFakeTree();



        //System.out.println(tree2.isValidTree());

       // System.out.println(tree.);

        //Graph
       /* Graph myGraph = new Graph();
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addVertex(5);
        myGraph.addVertex(6);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 2);
        myGraph.addEdge(4, 5);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 0);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(6, 5);

        myGraph.showConnections();*/

       //RECURSION
        //System.out.println(findFactorialRecursive(5));
        //System.out.println(findFactorialIterative(5));
       /* System.out.println(fibonacciIterativeRecursive(0));
        System.out.println(fibonacciIterativeRecursive(1));
        System.out.println(fibonacciIterativeRecursive(2));
        System.out.println(fibonacciIterativeRecursive(3));
        System.out.println(fibonacciIterativeRecursive(15));*/

       //BUBBLE SORT
        //int[] arr = new int[] {99, 44, 6, 2, 1, 5, 63, 5, 283, 4, 0};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //arr = quickSort(arr, 0, arr.length-1);

        //System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(merge(new int[]{3}, new int[]{2})));

        //DYNAMIC
        System.out.println(fibonacciIterativeRecursiveMem(13));


    }

    public static String firstRecurringChar(char[] arr){
        String result = "undefined";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                result = Character.toString(arr[i]);
            } else{
              map.put(arr[i], 1);
            }
        }

        return result;

    }

    public static int[] mergeSortedArrays(int[] a, int[] b){
        int i = 0;
        int y = 0;
        int z = 0;
        int[] arr = new int[a.length + b.length];

        while(z < arr.length){
            if(a[i] <= b[y] || !isInt(b[y])){
                arr[z] = a[i];
                i++;
            } else {
                arr[z] = b[y];
                y++;
            }

            z++;
        }

        return arr;
    }

    public static boolean isInt(int x){
        if(x == (int)x){
            return true;
        } else{
            return false;
        }
    }

    public static void reverseString(String s){
        String o = "";

        for(int i = s.length()-1; i >= 0; i--){
            o = o + s.charAt(i);
        }

        System.out.println(o);
    }

    public static int findFactorialRecursive(int num){
        if(num == 0)
            return 1;

        return num * findFactorialRecursive(num-1);
    }

    public static int findFactorialIterative(int num){
        int result = 1;

        while(num > 0){
            result *= num;
            --num;
        }

        return result;
    }

    public static int fibonacciIterativeRecursive(int num){

        int prev1 = 0;
        int prev2 = 1;

        if(num == 0)
            return 0;
        if(num == 1)
            return 1;

        return fibonacciIterativeRecursive(num-1) + fibonacciIterativeRecursive(num-2);
    }

    public static int fibonacciIterative(int num){
        int prev1 = 0;
        int prev2 = 1;

        if(num == 0)
            return 0;
        if(num == 1)
            return 1;

        for(int i = 2; i < num; i++){
            int result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }

        return prev1 + prev2;
    }

    public static void bubbleSort(int[] array){
        int length = array.length;

        while(length > 0){
            for(int i = 0; i < length-1; i++){
                if(array[i] > array[i+1]) {
                    int index = array[i];
                    array[i] = array[i+1];
                    array[i+1] = index;
                }
            }
            --length;
        }
    }

    public static void selectionSort(int[] array){
        int index = 0;

        while(index < array.length) {
            int smallest = array[index];
            int iSmall = index;

            for (int i = index+1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    iSmall = i;
                }
            }
            int temp = array[index];
            array[index] = array[iSmall];
            array[iSmall] = temp;
            index++;
        }
    }

    public static void insertionSort(int[] array){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(array[0]);

        for(int i = 1; i < array.length; i++) {
            int tempIndex = 0;
            for (int y = 0; y < arrList.size(); y++) {
                if (array[i] <= arrList.get(y)) {
                    tempIndex = y;
                }
            }
            arrList.add(tempIndex, array[i]);
        }

        array = arrList.stream().mapToInt(i -> i).toArray();
    }

    public static int[] mergeSort(int[] array){
        if(array.length == 1)
            return array;

        int mid = (array.length + 1) / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right){
        int[] temp = new int[left.length + right.length];
        int iLeft = 0;
        int iRight = 0;
        int index = 0;

        while (index < temp.length){
            boolean isLeft = false;

            if(iLeft != -1 && iRight != -1){
                if(left[iLeft] <= right[iRight])
                   isLeft = true;
            } else if(iLeft != -1){
                isLeft = true;
            }

            if(isLeft){
                temp[index] = left[iLeft];
                if(iLeft == left.length-1)
                    iLeft = -1;
                else
                    iLeft++;
            } else {
                temp[index] = right[iRight];
                if(iRight == right.length-1)
                    iRight = -1;
                else
                    iRight++;
            }
            index++;
        }

        return temp;
    }

    public static int[] quickSort(int[] array, int left, int right){
        int pivot;
        int partitionIndex;

        if(left < right) {
            pivot = right;
            partitionIndex = partition(array, pivot, left, right);

            //sort left and right
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
        return array;
    }

    public static int partition(int[] array, int pivot, int left, int right){
        int pivotValue = array[pivot];
        int partitionIndex = left;

        for(int i = left; i < right; i++) {
            if(array[i] < pivotValue){
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, right, partitionIndex);
        return partitionIndex;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex){
        var temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static int fibonacciIterativeRecursiveMem(int num){

        if(fibMap.containsKey(num))
            return fibMap.get(num);

        if(num == 0) {
            fibMap.put(num, 0);
            return 0;
        }
        if(num == 1) {
            fibMap.put(num, 1);
            return 1;
        }

        fibMap.put(num, fibonacciIterativeRecursiveMem(num-1) + fibonacciIterativeRecursiveMem(num-2));
        return fibMap.get(num);
    }






}
