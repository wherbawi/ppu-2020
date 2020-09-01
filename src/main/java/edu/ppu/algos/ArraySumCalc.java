package edu.ppu.algos;

import java.util.Arrays;

public class ArraySumCalc {
    public int sum(int[] nums){
        return Arrays.stream(nums).sum();
    }
}
