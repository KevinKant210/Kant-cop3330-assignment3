/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_41;

import java.io.*;
import java.util.*;

public class FileMaster {
    private static File userFile;
    private static Scanner reader;
    private static FileInputStream fileRead;

    public boolean getFile(String filePath){
        //userinput = new File(filepath)
        userFile = new File(filePath);
        //if(file DNE) return false ERROR
        if(userFile == null)return false;


        try{
            //filereader = new fileinputstream(userFile)
            //reader = new scanner(filereader)
            fileRead = new FileInputStream(userFile);
            reader = new Scanner(fileRead);
        }catch(FileNotFoundException e){
            return false;
        }
        //return true
        return true;
    }

    public String readLine(){
        //return reader.nextline
        //
        try{
            String output =  reader.nextLine();
            return output;
        }catch (NoSuchElementException e){
            return null;
        }




    }

    public String readToken(){
        //same code as above instead of reading line reads next token
        try{
            String output =  reader.next();
            return output;
        }catch (NoSuchElementException e){
            return null;
        }
    }

    public boolean closeFile(){
        try{
            //filereader.close
            //reader.close
            //return true
            fileRead.close();
            reader.close();
            return true;
        }catch(IOException e){
            return false;
        }
    }

    public boolean writeFile(ArrayList<String> output,String FileName){
        File outputFile = new File(FileName);

        //file outputfile = new file(filename)
        //filewriter = new filewriter(outputfile)
        //if (filenotfound or error occurs) return false
        //filewriter.write(there is a total of output.size names)
        //filewriter.write(----------);
        //for(each element in output) filewriter.write (output.get(i)\n)
        //filewriter.close;
        //return true

       try{
           FileWriter fileWriter = new FileWriter(outputFile);
           fileWriter.write("There is a total of " + output.size() + " names\n");
           fileWriter.write("-----------------------------------\n");
           for(int i = 0 ; i < output.size(); i++){
               fileWriter.write(output.get(i));
               fileWriter.write("\n");
           }
           fileWriter.close();
       }catch(IOException e){
           return false;
       }

        return true;
    }
}
