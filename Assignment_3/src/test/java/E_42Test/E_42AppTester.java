/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package E_42Test;

import static org.junit.jupiter.api.Assertions.*;

import Ex_42.E_42App;
import Ex_42.StringParser;
import org.junit.jupiter.api.Test;

import java.awt.event.ItemEvent;
import java.util.ArrayList;

public class E_42AppTester {
    @Test
    public void ensure_strings_get_parsed_correctly(){
        String test = "this,should,split";
        String[] testArray = StringParser.parseWithCommas(test);

        assertEquals(testArray[0], "this");
        assertEquals(testArray[1], "should");
        assertEquals(testArray[2], "split");
    }


}
