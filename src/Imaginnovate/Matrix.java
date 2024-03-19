package Imaginnovate;

public class Matrix {
    public static void main(String[] args) {
        int[][] m1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] m2 = {
                {3,6},
                {5,9},
                {2,9}
        };

        int result[][] = new int[2][2];
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    sum = sum + m1[i][k] * m2[k][j];
                }
                result[i][j]= sum;
                sum=0;
            }
        }

        //print the matrix after the multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
