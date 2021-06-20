/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_44Test;

import Ex_44.Ex_44App;
import Ex_44.ProductsClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ex_44AppTester {

    @Test
    public void test_we_grab_values_from_JSON(){
        List<ProductsClass> things = new ArrayList<>();
        Ex_44App.GrabProducts(things);

        assertEquals(3, things.size());
    }

    @Test
    public void test_we_hold_values_from_JSON(){
        List<ProductsClass> things = new ArrayList<>();
        Ex_44App.GrabProducts(things);

        assertEquals(things.get(0).getName(),"Widget");
    }
}
