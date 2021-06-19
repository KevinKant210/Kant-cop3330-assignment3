/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_42;

import java.util.ArrayList;

public class StringParser {

    //will create a list of strings in which we can state that index 0 is last index 1 is first and index 2 is salary

    public static String[] parseWithCommas(String s){
        String[] output = new String[3];

        output = s.split(",");

        return output;
    }
}
