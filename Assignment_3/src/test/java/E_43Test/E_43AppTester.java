/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package E_43Test;


import static org.junit.jupiter.api.Assertions.*;
import Ex_43.*;

import org.junit.jupiter.api.Test;


public class E_43AppTester {

    public static String testOut = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\TestOutput";
    @Test
    public void ensure_html_gen_returns_true(){

        FileGenerator webMaker = new FileGenerator(testOut);

        assertTrue(webMaker.createHTMLTemp("Kevin","TestTitle"));
    }

    @Test
    public void ensure_dir_maker_returns_true(){
        FileGenerator fileMaker = new FileGenerator(testOut);

        assertTrue(fileMaker.createDir("JavaScript"));
        //can toggle this on and off to prevent the dir from being instantly deleted but for multiple tests this is neccessary
        fileMaker.deleteDir("JavaScript");
    }


}
