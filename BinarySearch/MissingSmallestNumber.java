package BinarySearch;

public class MissingSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length-1;
        int ans = arr.length;
        while(left<=right) {
            int mid = (left+right)/2;
            if(arr[mid] != mid) {
                ans=mid;
                right=mid-1; // Potential to be the answer
            }else{
                left=mid+1;
            }
        }
        System.out.println("The Answer is " +ans);
    }
}
