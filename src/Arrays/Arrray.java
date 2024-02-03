package Arrays;

import java.util.Scanner;

public class Arrray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("array");
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
