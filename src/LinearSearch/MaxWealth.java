package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
      int[][] accounts = {{2,3},{3,1},{4,5}};

      int max = maximumWealth(accounts);
      System.out.println(max);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }

            if(sum > ans){
                ans=sum;
            }
        }
        return ans;
    }
}
