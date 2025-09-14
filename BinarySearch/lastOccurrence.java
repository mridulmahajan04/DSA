package BinarySearch;

public class lastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 4, 4, 4};
        int target = 4;

        int low = 0;
        int high = arr.length - 1;
        int sol = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]<target) {
                low=mid+1;
            } else if (arr[mid]>target) {
                high=mid-1;
            } else{
               if(mid!=arr.length-1 && arr[mid+1]==target) {
                   low=mid+1;
               }else{
                   sol=mid;
                   break;
               }
            }
        }
        System.out.println("The index is "+sol);
    }
}
