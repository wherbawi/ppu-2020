package edu.ppu.algos;

/**
 * this class 1 2 3 4 5 6
 */
public class Calc {
    private ArraySumCalc arraySumCalc;

    public Calc(ArraySumCalc arraySumCalc) {
        this.arraySumCalc = arraySumCalc;
    }

    /**
     * this is hhhhhhh
     *
     * @param a this is ......
     * @param b thhhdhdhdhdhd
     * @return uskjhsfkjsdhfkj
     */
    public int sum(int a, int b) {
        return a + b;
    }

    public int avgCalc(int[] nums) {
        return arraySumCalc.sum(nums) / nums.length;
    }
}
