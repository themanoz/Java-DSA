package Imaginnovate;

public class secSmallest {
    public static void main(String[] args) {
        int[] arr= {10,22,13,43};
        int n = arr.length;
        System.out.println(secSmallest(arr, n));
    }

    static int secSmallest(int[] arr, int n){
        int smallest = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] == smallest){
                smallest = arr[i];
            }
        }
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] != smallest && arr[i] < secSmallest){
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }
}
