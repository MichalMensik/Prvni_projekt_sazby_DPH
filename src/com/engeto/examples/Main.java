package com.engeto.examples;

import java.util.List;

public class Main {

    public static final String FILENAME = "vat-eu.csv";
    public static final String FILENAME2 = "vat-over-20.txt";

    public static void main(String[] args) {
        InputFile inputFiles = new InputFile();
        inputFiles.loadFromFile(FILENAME);
        for (VatRate vatRate : inputFiles.getAllInputFiles()) {

            System.out.println(vatRate);

           }

        try {
            inputFiles.saveToFile(FILENAME2);
            System.out.println("==================");

            } catch (Exception e) {
            e.printStackTrace();
        }

    }
}




