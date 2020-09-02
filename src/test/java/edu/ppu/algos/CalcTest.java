package edu.ppu.algos;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalcTest {
    @Test
    public void testSum() {
        Calc calc = new Calc(null);
        int rest = calc.sum(2, 3);
        assertEquals(5, rest);

    }

    @Test
    public void testAvgCalc() {

        ArraySumCalc mockASM = mock(ArraySumCalc.class);
        Calc calc = new Calc(mockASM);
        int[] nums = {4, 2, 3};
        when(mockASM.sum(nums)).thenReturn(19);
        int res = calc.avgCalc(nums);
        assertEquals(3, res);
    }

}