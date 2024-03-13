package org.example;

import java.util.Random;

public class kt_6_1 {
    public static void main(String[] args) {
        int[][] matrix1 = createAndFillMatrix();
        int[][] matrix2 = createAndFillMatrix();
        int[][] matrix3 = createAndFillMatrix();

        printMatrix(matrix1);
        printMatrix(matrix2);
        printMatrix(matrix3);

        int[][] largestMatrix = getLargestMatrix(getLargestMatrix(matrix1, matrix2), matrix3);
        System.out.println("Suurima elementide summaga massiiv on:");
        printMatrix(largestMatrix);
    }

    public static int[][] createAndFillMatrix() {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] getLargestMatrix(int[][] matrix1, int[][] matrix2) {
        int sum1 = getMatrixSum(matrix1);
        int sum2 = getMatrixSum(matrix2);
        return sum1 > sum2 ? matrix1 : matrix2;
    }

    public static int getMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}