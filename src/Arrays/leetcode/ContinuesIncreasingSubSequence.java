package Arrays.leetcode;

public class ContinuesIncreasingSubSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,4,7};
        System.out.println(findLengthOfLCIS(arr));
    }
    static  int findLengthOfLCIS(int[] nums){
        int currentLengthOfSequence  = 0;
        int maximumLengthOfSequence = 0;
        int n = nums.length;

        for(int i=0; i < n-1; i++){
            if(nums[i] < nums[i+1]){
                currentLengthOfSequence ++;
            }else{
                maximumLengthOfSequence = Math.max(currentLengthOfSequence,maximumLengthOfSequence);
                currentLengthOfSequence = 0;
            }
        }

        return Math.max(currentLengthOfSequence,maximumLengthOfSequence);
    }
}
