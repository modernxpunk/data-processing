/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.fileworks;

/**
 *
 * @author alex
 */
public class FileWorker {

    private static String fileName = "";

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        FileWorker.fileName = fileName;
    }

}