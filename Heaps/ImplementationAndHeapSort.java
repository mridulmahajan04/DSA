package Heaps;

import java.util.ArrayList;

public class ImplementationAndHeapSort {
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> heapSort = new ArrayList<>();
    public static void insert(int val) {
        list.add(val);
        upheap(list.size()-1);
    }
    public static void upheap(int index) {
        if(index==0) return;
        int parent = (index-1)/2;
        if(list.get(index)<list.get(parent)) {
            int temp = list.get(parent);
            list.set(parent, list.get(index));
            list.set(index, temp);
            upheap(parent);
        }
    }
    public static void downheap(int index) {
        int min = index;
        int left = 2*index+1;
        int right = 2*index+2;
        if(left<list.size() && list.get(left)<list.get(min)) {
            min=left;
        }
        if(right<list.size() && list.get(right)<list.get(min)) {
            min=right;
        }
        if(index!=min) {
            int temp = list.get(index);
            list.set(index, list.get(min));
            list.set(min, temp);
            downheap(min);
        }

    }
    public static void remove() {
        if(list.isEmpty()) return;
        int val = list.getFirst();
        heapSort.add(val);
        int last = list.getLast();
        list.set(0, last);
        list.removeLast();
        downheap(0);
    }
    public static void main(String[] args) {
//        Min Heap
        insert(15);
        insert(5);
        insert(3);
        insert(20);
        insert(12);
        insert(16);
        insert(1);
        insert(105);
        insert(11);
        insert(0);

        while(!list.isEmpty()) {
            remove();
        }
        for(int val : heapSort) {
            System.out.print(" "+val);
        }

    }
}
