package BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[]  arr = {-12,-3,0,3,5,6,7,8,9,13,15,23,53,74};
        int target = 74;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
