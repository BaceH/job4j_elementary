package ru.job4j.pools;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

public class RolColSumTest {

      private int[][] matrix = {
              {1,1,3},
              {1,1,1},
              {5,1,1}};

    @Test
    public void matrix3x3sumFirstIndexCol() {
        long startTime = System.currentTimeMillis();
        Sums[] sums = RolColSum.sum(matrix);
        assertThat(sums[0].getColSum(), is(7));
    }
    @Test
    public void matrix3x3sumFirstIndexRow() {
        Sums[] sums = RolColSum.sum(matrix);

        assertThat(sums[0].getRowSum(), is(5));
    }

    @Test
    public void matrix3x3asyncSumFirstIndexCol() throws ExecutionException, InterruptedException {
        Sums[] sums = RolColSum.asyncSum(matrix);
        assertThat(sums[0].getColSum(), is(7));
    }
    @Test
    public void matrix3x3asyncSumFirstIndexRow() throws ExecutionException, InterruptedException {
        Sums[] sums = RolColSum.asyncSum(matrix);

        assertThat(sums[0].getRowSum(), is(5));
    }
}
