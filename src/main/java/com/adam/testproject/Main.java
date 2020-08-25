/*
 * Maintained by brightSPARK Labs.
 * www.brightsparklabs.com
 *
 * Refer to LICENSE at repository root for license details.
 */

package com.adam.testproject;

import com.opencsv.bean.CsvToBeanBuilder;

public class Main {
    public static void Main(String[] args) {
        //        System.out.println("Hello, world!");
        //        try (BufferedReader reader =
        //                Files.newBufferedReader(Paths.get("book.csv"), Charset.defaultCharset()))
        // {
        //            String line;
        //            while ((line = reader.readLine()) != null) {
        //                String[] values = line.split(",");
        //                System.out.println(values[1]);
        //            }
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }

        List<MyBean> beans =
                new CsvToBeanBuilder(FileReader("yourfile.csv"))
                        .withType(Visitors.class)
                        .build()
                        .parse();
    }
}
