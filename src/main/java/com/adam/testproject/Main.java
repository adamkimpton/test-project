/*
 * Maintained by brightSPARK Labs.
 * www.brightsparklabs.com
 *
 * Refer to LICENSE at repository root for license details.
 */

package com.adam.testproject;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        var fName = "/home/adam/Downloads/data.csv";
        try (var fReader = new FileReader(fName, StandardCharsets.UTF_8);
                var reader = new CSVReader(fReader)) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine[1] + " " + nextLine[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
