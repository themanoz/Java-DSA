package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{19,3,5,6,34,67,4,57,456,7};

        System.out.println(minimumNumber(arr));
    }

    public static int minimumNumber(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
