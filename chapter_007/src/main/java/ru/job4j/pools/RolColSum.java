package ru.job4j.pools;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RolColSum {

    public static Sums[] sum(int[][] matrix) {
        Sums[] sumsArray = new Sums[matrix.length];
        for (int row = 0; row < matrix.length; row++){
            sumsArray[row] = resultByLine(row, matrix);
        }
        return sumsArray;
    }

    public static Sums[] asyncSum(int[][] matrix) throws ExecutionException, InterruptedException {
        Sums[] sumsArray = new Sums[matrix.length];
        for (int row = 0; row < matrix.length; row++){
            CompletableFuture<Sums> bm = getAsyncSumLine(row, matrix);
            sumsArray[row] = bm.get();
        }
        return sumsArray;
    }

    private static CompletableFuture<Sums> getAsyncSumLine(int row, int[][] matrix) {
        return CompletableFuture.supplyAsync(
                () -> resultByLine(row, matrix)
        );
    }

    private static Sums resultByLine(int row, int[][] matrix) {
        int colSum = 0;
        int rowSum = 0;

        for (int col = 0; col < matrix.length; col++){
            rowSum += matrix[row][col];
            colSum += matrix[col][row];
        }
        return new Sums(rowSum, colSum);
    }

}