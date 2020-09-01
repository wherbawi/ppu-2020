package edu.ppu.algos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class MainClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter fileWriter = new FileWriter(new File("ppu.txt"));
            fileWriter.write(Calendar.getInstance().getTime().toString() + "\n");
            fileWriter.close();

    }
}
