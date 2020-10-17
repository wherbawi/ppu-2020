package edu.ppu.algos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class MainClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter fileWriter = new FileWriter(new File("ppu-dep-test.txt"));
        //for(int i=0;i<100;i++) {
        fileWriter.write("Hello worl ...");
        //   Thread.sleep(1000);
        // }

        fileWriter.close();

    }
}
