package BubbleSort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {-1,24,0,23,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void bubbleSort(int[] arr){
        boolean swapped;
        // run the steps for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step the maximum element will be at the respective position
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
                  swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
