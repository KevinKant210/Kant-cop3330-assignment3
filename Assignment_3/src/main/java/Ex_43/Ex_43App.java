/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_43;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex_43App {
    private static String outputDir = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Output\\website";
    private static Scanner reader = new Scanner(System.in);

    private static String author;
    private static String title;
    private static boolean javaDir;
    private static boolean cssDir;
    public static void main(String[] args) {

        /*
            grabUservals();


            new FileGenerator(outputdir);

            if(create js dir is true){
            filegen.creatdir(userDir.js)

            if)(create css dir is true)
            filegen.createdir(userDir.css);


            return;
         */
        if(!makeWebsiteDir()) System.out.println("Error making website Dir!");

        grabUserVals();

        FileGenerator fileMaker = new FileGenerator(outputDir);

        fileGenStatus(fileMaker);


    }

    private static void fileGenStatus(FileGenerator fileMaker) {
        if(fileMaker.createHTMLTemp(author,title)) System.out.printf("Created  %s/%s \n Created %s/%s/index.html\n",outputDir,author,outputDir,author);

        if(javaDir) {
            if(fileMaker.createDir("JavaScript")) System.out.printf("Created %s/%s/js/\n",outputDir,author);
        }


        if(cssDir){
            if(fileMaker.createDir("CSS")) System.out.printf("Created %s/%s/css/\n",outputDir,author);
        }
    }

    private static boolean makeWebsiteDir() {
        File makeWebDir = new File(outputDir);
        return makeWebDir.mkdir();
    }

    private static void grabUserVals() {
        System.out.print("Please Enter author name: ");
        author = reader.nextLine();
        System.out.print("Please Enter Your Website Title: ");
        title = reader.nextLine();
        System.out.print("Would you like a JavaScript Folder? ");
        String temp = reader.next();
        if(temp.compareToIgnoreCase("y") == 0)javaDir = true;
        System.out.print("Would you like a CSS Folder? ");
        temp = reader.next();
        if(temp.compareToIgnoreCase("y") == 0)cssDir = true;
    }


}
