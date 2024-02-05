package BinarySearch.Matrix;

import java.util.Arrays;

public class SearchinTwoD {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {11,21,31},
                {12,22,32},
        };
//        System.out.println(arr.length);
        System.out.println(Arrays.toString(search(arr,20)));
    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}

