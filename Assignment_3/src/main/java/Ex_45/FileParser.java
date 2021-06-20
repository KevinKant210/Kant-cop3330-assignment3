/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_45;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileParser {
    private File userFile;

    public FileParser(String FileName){
        this.userFile = new File(FileName);
    }

    public String parseFile(String target, String replacement){
        String output = "";
        //String output
        //try { new fileinput , new scanner
        //while scanner != no such element exception ) temp = reader.nextline
        //temp.replace(target,replacement)
        //output = output.concat(temp)
        //if exception is caught return null
        //end of program return output
        try{
            FileInputStream fileIn = new FileInputStream(userFile);
            Scanner reader = new Scanner(fileIn);

            String holder = reader.nextLine();
            while(holder != null){
                holder = holder.replace(target,replacement);

                output = output.concat(holder).concat("\n");
                try{
                    holder = reader.nextLine();
                }catch (NoSuchElementException e){

                    break;
                }
            }

        }catch (FileNotFoundException e){
            return null;
        }

        return output;
    }

    public boolean placeOutput(String output,String fileName){
        //outputfile = filepath + filename
        File outputFile = new File("C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Output\\"+fileName);

        try{
            //outputfile.createnewfile
            //filewriter outputwriter = new filewriter(outputfile)
            if(!outputFile.createNewFile()) System.err.println("Error Creating File!");
            FileWriter outputWriter = new FileWriter(outputFile);
            //outputwriter.write(parsedstring)
            //close outputwriter
            //return true

            outputWriter.write(output);
            outputWriter.close();
        }catch(IOException e){
            return false;
        }

        return true;
    }
}
