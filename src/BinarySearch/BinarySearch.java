package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr = {-12,-3,0,3,5,6,7,8,9,13,15,23,53,74};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start +  (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
