package Heaps;

public class HeapFromUnsortedArray {
    static int[] arr = {10, 11, 20, 60, 1, 90};

    public static void downheap(int index) {
        int min = index;
        int left = 2*index+1;
        int right = 2* index + 2;

        if(left<arr.length && arr[min]>arr[left]) {
            min=left;
        }
        if(right<arr.length && arr[min]>arr[right]) {
            min=right;
        }
        if(index!=min) {
            int temp = arr[index];
            arr[index] = arr[min];
            arr[min]=temp;
            downheap(min);
        }
    }
    public static void main(String[] args) {
        for(int i=arr.length/2; i>=0; i--) {
            downheap(i);
        }
        for(int i:arr) {
            System.out.print(" "+i);
        }
    }
}
