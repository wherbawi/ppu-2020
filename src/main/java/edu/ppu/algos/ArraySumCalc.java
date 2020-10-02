package edu.ppu.algos;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class ArraySumCalc {
    public int sum(int[] nums){
        return Arrays.stream(nums).sum();
    }
}
