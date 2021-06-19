/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

//open a stream to grab file input A.1
    //remember to close file at end of program
//store file input
    //store files in a way that allows us to sort by lastname

//sort stored file input A.3
    //potentially create a object that stores first and last names in people objects, have an array of those objects and fill them in, also have a sorter static sort func
//return sorted file input as output A.4
    //return the output of our people array by writing it to a text file
//end program
    //close our open input streams to prevent leaks
package Ex_41;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class E_41App {
    private static final String outputDir = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Output";

    public static void main(String[] args) {

        //A.1
        // List<String> array = new Arraylist<>();

        // this is where we put each input line
        //build scanner object "reader"
            //fileobject inputfile = new fileobject(input.txt
            // Scanner reader = new scanner(inputfile)
        //counter variable int i = 0;
        // String inputline = reader.nextline;
        //while inputline != EOF) array.add = inputline;
            //i++
            //inputline = reader.nextline;
        // END OF A.1 SECTION
        //A.3
        //array.sort();

        //A.4
        // output = new fileoutput(output.txt);'
        //for(String s : array) output.write(string);
        //input.close
        //output.close
        //terminate program

        ArrayList<String> namesArray = new ArrayList<>();

        FileMaster fileReader = new FileMaster();
        fileReader.getFile("C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\main\\java\\Ex_41\\exercise41_input.txt");

        storeFile(namesArray, fileReader);


        Collections.sort(namesArray);


        fileReader.writeFile(namesArray,outputDir + "\\exercise41_output.txt");

        fileReader.closeFile();





    }

    private static void storeFile(ArrayList<String> namesArray, FileMaster fileReader) {
        String holder = fileReader.readLine();

        while(holder != null){

            namesArray.add(holder);
            holder = fileReader.readLine();
        }
    }
}
