package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6,34,67,4,57,456,7};
        int target = 456;
        System.out.println(searchInRange(arr, 2,9,target));
    }

    public static int searchInRange(int[] arr, int start, int end,int target) {

        for (int i = start; i <= end ; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
