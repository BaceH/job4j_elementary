package ru.job4j.pools;

public class RolColSum {

    public static Sums[] sum(int[][] matrix) {
        Sums[] sumsArray = new Sums[matrix.length];
        for (int col = 0; col < matrix.length; col++){
            int colSum = 0;
            int rowSum = 0;
            for (int row = 0; row < matrix.length; row++){
                colSum += matrix[col][row];
                rowSum += matrix[row][col];
            }
            Sums sums = new Sums();
            sums.setColSum(colSum);
            sums.setRowSum(rowSum);
            sumsArray[col] = sums;
        }
        return sumsArray;
    }

    public static Sums[] asyncSum(int[][] matrix) {

        return new Sums[0];
    }

}