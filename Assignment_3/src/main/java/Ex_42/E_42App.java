/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_42;
import Ex_41.FileMaster;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;


public class E_42App {

    private static final String inputFile = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\main\\java\\Ex_42\\exercise42_input.txt";

    public static void main(String[] args) {
        /*
             create filemaster object
             filemaster filereader = new filemaster ();

             filereader.get(file)

              String holder = filereader.readline
              while(holder != null) nameArray.add(parse(holder))

              will need custom method for formatting tabular output

              filereader.formattabular(outputfilename,nameArray);

              terminate program



         */

        FileMaster fileReader = new FileMaster();
        fileReader.getFile(inputFile);

        ArrayList<String[]> inputHolder = new ArrayList<>();

        String holder = fileReader.readLine();
        while (holder != null) {

            inputHolder.add(StringParser.parseWithCommas(holder));
            holder = fileReader.readLine();
        }

        writeToFileTabular(inputHolder);
    }

    public static void writeToFileTabular(ArrayList<String[]> output) {


        System.out.println(String.format("%-10s%-10s%-10s", "Last", "First", "Salary"));


        System.out.println("--------------------------");
        for (int i = 0; i < output.size(); i++) {
            System.out.println(String.format("%-10s%-10s%-10s", output.get(i)[0], output.get(i)[1], output.get(i)[2]));
            //our array is holding a string list in the format last first and salary
            // String.format("%-10s%-10s%-10s",output.get(i)[0],output.get(i)[1],output.get(i)[2]);
        }


    }

}
