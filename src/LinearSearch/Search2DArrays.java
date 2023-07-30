package LinearSearch;

import java.util.Arrays;

public class Search2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,6,5},
                {8,9,6},
                {3,10,23,78}
        };

        int target = 78;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1,-1};
    }
}
