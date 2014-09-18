/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writer;

import java.io.PrintWriter;

/**
 *
 * @author WGikonyo
 */
public class Writer extends Object {

    Writer() {

    }

    public static String[] strings
            = {
                "Hello World",
                "Goodbye World"
            };

    public static void main(String[] args)
            throws java.io.IOException {

        try (PrintWriter pw = new PrintWriter(new java.io.FileOutputStream("D://out.txt"), true)) {
            for (String s : strings) {
                pw.println(s);
            }
        }

        System.exit(0);
    }
}
