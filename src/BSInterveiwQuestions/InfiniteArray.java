package BSInterveiwQuestions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[]  arr = {3,5,6,7,8,9,13,15,23,53,74,83,93,106,234,334,363,445};
        int target = 93;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        // first find the range
        // first start off with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
        }
        return binarySearch(arr, target,start,end);
    }
    public static int binarySearch(int[] arr, int target,int start, int end){

        while(start <= end){
            int mid = start +  (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
