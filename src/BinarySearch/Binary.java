package BinarySearch;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {-23,-12,0,1,2,4,5,6,8,9,12,14,15,34,63,75};
        int ans = searchBinary(arr, -12);
        System.out.println(ans);
    }

    // return the index
    // return -1 if target does not exist
    static  int searchBinary(int[]  arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find the middle element
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
