package com.engeto.examples;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFile {
    private List<VatRate> vatRateList = new ArrayList<>();

public void loadFromFile(String filename) {
    try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {

        while (scanner.hasNextLine()) {
            // změna desetinných čárek na tečky
            String newCharacter = scanner.nextLine();
            String newCharacter2 = newCharacter.replace(",", ".");

            // rozdělení vstupních dat na pole textových řetězců
            String[] parts = newCharacter2.split("\t");
            // kontrolní výpis: System.out.println(Arrays.toString(parts));
            String stateAbbreviation = parts[0];
            String state = parts[1];
            int fullRate = Integer.parseInt(parts[2]);
            double reducedDate = Double.parseDouble(parts[3]);
            boolean specialRate = Boolean.parseBoolean(parts[4]);

            VatRate vatRate = new VatRate(state, stateAbbreviation, fullRate, reducedDate, specialRate);
                if (specialRate == false) {
                    if (fullRate > 20) {
                        vatRateList.add(vatRate);
                    }
                }
            }


        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private List<VatRate> getVatRateList() {
        return vatRateList;
    }

    public List<VatRate> getAllInputFiles() {
        return new ArrayList<>(vatRateList);
        }

        public void saveToFile (String filename2){
             try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename2)))) {

                 for (VatRate vatRate : vatRateList) {

                     String outputLine = vatRate.toString();
                     writer.println(outputLine);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }



