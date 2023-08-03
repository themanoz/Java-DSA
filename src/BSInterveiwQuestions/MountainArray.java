package BSInterveiwQuestions;

public class MountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
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
}
