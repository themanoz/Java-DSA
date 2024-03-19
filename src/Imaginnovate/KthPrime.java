package Imaginnovate;

public class KthPrime {
    public static void main(String[] args) {
        int k = 5;
        System.out.println("The " + k + "th prime number is: " + kthPrime(k));
    }

    public static int kthPrime(int k) {
        int count = 0;
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

