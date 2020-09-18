package edu.ppu.std;

import java.util.List;

public class SumOverMaxService {
    public SumOverMaxService(ListMaxService listMaxService,
                             ListSumService listSumService) {
        this.listMaxService = listMaxService;
        this.listSumService = listSumService;
    }

    private ListMaxService listMaxService;
    private ListSumService listSumService;

    public float getSumOverMax(List<Integer> numbers) {
        throw new RuntimeException("this method is not implemented yet");
    }
}
