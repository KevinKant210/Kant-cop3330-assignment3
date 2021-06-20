/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_45Test;

import Ex_45.FileParser;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.FileChooserUI;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class Ex_45Tester {
    @Test
    void ensure_string_parser_parses_strings_properly(){
        String testString = "this line is for fun purposes\n";
        FileParser parser = new FileParser("C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\test\\java\\Ex_45Test\\Test.txt");
        assertEquals(testString,parser.parseFile("testing","fun"));
    }

    @Test
    public void ensure_file_placer_places_file(){
        FileParser parser = new FileParser("C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\test\\java\\Ex_45Test\\Test.txt");
        parser.placeOutput("hi","TestFile");
    }

}
