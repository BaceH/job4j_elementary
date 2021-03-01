package ru.job4j.pools;

public class Sums {
    private int rowSum;
    private int colSum;

    public int getRowSum() {
        return rowSum;
    }

    public Sums(int rowSum, int colSum) {
        this.rowSum = rowSum;
        this.colSum = colSum;
    }

    public void setRowSum(int rowSum) {
        this.rowSum = rowSum;
    }

    public int getColSum() {
        return colSum;
    }

    public void setColSum(int colSum) {
        this.colSum = colSum;
    }
}
