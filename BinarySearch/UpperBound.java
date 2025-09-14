package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
           int[] arr = {2, 3, 7, 10, 11, 11, 25};
           int target = 6;
           int mid = -1;
           int low = 0;
           int high = arr.length-1;
           while(low<=high) {
               mid = (low+high)/2;
               if(arr[mid]<target) {
                   low=mid+1;
               }else if(arr[mid]>target){
                   high = mid-1;
               }
               else{
                   break;

               }
           }
            System.out.println("The Upper Bound is "+high);
    }
}
