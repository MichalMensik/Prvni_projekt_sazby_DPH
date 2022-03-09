package com.engeto.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFile {
    private List<VATRate> vatRateList = new ArrayList<>();

    public void loadFromFile(String filename) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}