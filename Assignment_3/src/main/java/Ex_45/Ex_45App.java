/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_45;

import java.io.FileWriter;
import java.util.Scanner;

public class Ex_45App {
    private static String inputFile = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\main\\java\\Ex_45\\exercise45_input.txt";
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        //Fileparser = new fileparser(input file)


        FileParser fileCreator = new FileParser(inputFile);

        //sout please enter file name
        //filename = reader.nextline
        System.out.print("Please Enter a file name: ");
        //run input file through parser
        //if (filecreator == true) terminate program
        //else sout error creating file
        if(!fileCreator.placeOutput(fileCreator.parseFile("utilize","use"),reader.next())){
            System.out.println("Error creating file! Please Try Again!");
        }


    }
}
