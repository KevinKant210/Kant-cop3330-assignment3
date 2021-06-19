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
    private static File userFile = null;
    private static Scanner reader;
    private static FileInputStream fileRead;

    public boolean getFile(String filePath){
        userFile = new File(filePath);
        if(userFile == null)return false;


        try{
            fileRead = new FileInputStream(userFile);
            reader = new Scanner(fileRead);
        }catch(FileNotFoundException e){
            return false;
        }

        return true;
    }

    public String readLine(){
        try{
            String output =  reader.nextLine();
            if(output == null)return null;
            return output;
        }catch (NoSuchElementException e){
            return null;
        }


    }

    public boolean closeFile(){
        try{
            fileRead.close();
            reader.close();
            return true;
        }catch(IOException e){
            return false;
        }
    }

    public boolean writeFile(ArrayList<String> output,String FileName){
        File outputFile = new File(FileName);


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
