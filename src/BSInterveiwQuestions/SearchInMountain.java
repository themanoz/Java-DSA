package BSInterveiwQuestions;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);

        if(firstTry != -1){
            return firstTry;
        }

        // try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak+1,arr.length -1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                // you are in desc part of array
                // it may be the answer
                // this is why end != mid + 1
                end = mid;
            }else {
                start = mid + 1; // because we know that mid+1 is greater than mid element
            }
        }
        return end; // or return end as both point to the same element
    }
    public static int orderAgnosticBinarySearch(int[] arr, int target,int start, int end){

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
