package Arrays;
import java.util.*;

public class SwapElements {

    public static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] =temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the elements into the array: ");
        int[] arr = new int[5];

        // take input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        swap(arr, 0,4);
        // print items in the array
        System.out.print(Arrays.toString(arr));
    }
}
