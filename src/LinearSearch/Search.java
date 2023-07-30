package LinearSearch;

public class Search {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,6,7,2};

        int target = 2;
        System.out.println(search(arr,target));

    }

    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
