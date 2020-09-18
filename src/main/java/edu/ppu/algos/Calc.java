package edu.ppu.algos;


public class Calc {
    private ArraySumCalc arraySumCalc;

    public Calc(ArraySumCalc arraySumCalc) {
        this.arraySumCalc = arraySumCalc;
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public int avgCalc(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("invalid input");

        } else
            return arraySumCalc.sum(nums) / nums.length;
    }
}
