package edu.ppu.algos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc {
    private ArraySumCalc arraySumCalc;


    public Calc(ArraySumCalc arraySumCalc) {
        this.arraySumCalc = arraySumCalc;
    }

    @GetMapping("/v1/sum")
    public int sum(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
        return a + b;
    }

    public int avgCalc(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("invalid input");

        } else
            return arraySumCalc.sum(nums) / nums.length;
    }
}
