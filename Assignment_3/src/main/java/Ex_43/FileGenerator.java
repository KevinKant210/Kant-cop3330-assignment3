/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    private String outputDir;


    //fileGen Constructor takes the path to the outputDir and assigns it to a static string
    // do this to allow users to create multiple fileGen objects with desired output locations

    public FileGenerator(String outputDir){
        this.outputDir = outputDir;

    }


    public boolean createDir(String Dirname){

        try{
            File dirMaker = new File(outputDir+"\\"+Dirname);
            return dirMaker.mkdir();
        }catch(NullPointerException e){

            return false;
        }

    }

    public boolean createHTMLTemp(String author,String title){
        File webTemp = new File(outputDir+"\\index.html");

        try{
            FileWriter webMaker = new FileWriter(webTemp);

            webMaker.write("<!doctype html>\n");
            webMaker.write("<html lang=\"en\">\n");
            webMaker.write("<head>\n");
            webMaker.write("\t<meta charset=\"utf-8\">\n");
            webMaker.write("\t<meta name=\"author\" content=\""+author+"\">\n");
            webMaker.write("\t<title>"+title+"</title>\n");
            webMaker.write("</head>");
            webMaker.close();
        }catch (IOException e){
            return false;
        }


        return true;
    }

    // not utilized in app but needed function to maintain test code
    public boolean deleteDir(String Dirname){
        try{
            File dirDelete = new File(outputDir+"\\"+Dirname);
            return dirDelete.delete();
        }catch (NullPointerException e){
            return false;
        }
    }
}
