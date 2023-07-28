package Arrays;

import java.util.Scanner;

public class MaximumValue {

    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = in.nextInt();

        // Declaration and Initialisation of an array
        int[] arr = new int[size];

        // take input from the user
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The maximum value of an array is:  " +maxValue(arr));
    }
}
