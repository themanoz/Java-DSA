package Arrays;

import java.util.Scanner;

// we have to print the sum of the elements in the array
public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take size of array from the user
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        // declaration and initialisation of array
        int[] arr = new int[n];

        // enter the elements into  the array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The sum of the elements in the array: " + sumArray(arr));
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
}
