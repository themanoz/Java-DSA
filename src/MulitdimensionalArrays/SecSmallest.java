package MulitdimensionalArrays;

public class SecSmallest {
    public static void main(String[] args) {
        int[] arr  = {12,13,141,5};
        int n = arr.length;
        System.out.println(secSmallestNumber(arr,n));
    }

    static int secSmallestNumber(int[] arr, int n){
        int smallest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        int secSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] != smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }
}
