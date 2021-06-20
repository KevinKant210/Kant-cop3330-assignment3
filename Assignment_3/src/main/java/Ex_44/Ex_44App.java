/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_44;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Ex_44App {
    private static Scanner reader = new Scanner(System.in);
    private static File inputFile = new File("C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\main\\java\\Ex_44\\exercise44_input.json");
    public static void main(String[] args) {

        //File inputfile = new file(inputfile);
        //List<Product> products =- new Arraylist();


        List<ProductsClass> products = new ArrayList<>();

        //this creates a new json element from a json file being read by a newly constructed file reader and parsed by gsons json parser
        //JsonElement fileElelment = JsonParser.parserReader(new FileReader(inputfile));
        GrabProducts(products);



        //this converts the json file that got turned into an element now into a java object that we can interact with
        //JsonObject fileObj = fileElement.getasJsonObject();

        //we can now use getters such as get("product") or get("dog")

        //we have an array of products that we need to fetch so we can use
        //JsonArray productsArray = fileObj.get(Products).getasJsonArray;

        //for(JsonElement products : productsArray){
            //Jsonobj = ProductObject = Products.getasJsonObject();
        //Product product = new prroduct
            //ProductproductObject.get"name".GetasString*(;
        GrabProducts(products);


        findUserProduct(products);

        //}

    }

    private static void findUserProduct(List<ProductsClass> products) {
        boolean exit = false;
        //while(exit != true)
        //sout(userprompt)
        //if (searchProducts) return product
        //else sout(no product found)
        // exit = false;
        while(!exit){
            System.out.print("What is the product name: ");
            String userInput = reader.next();

            if(searchInventory(products, userInput)){
                exit = true;
                return;
            }

            System.out.println("Sorry, that product was not found in our inventory");
        }
    }

    private static boolean searchInventory(List<ProductsClass> products, String userInput) {
        for(ProductsClass item : products){
            if(item.name.compareToIgnoreCase(userInput) == 0){
                System.out.printf("Name: %s\nPrice: %.2f\nQuantity %d", item.name,item.price,item.quantity);
                return true;
            }
        }
        return false;
    }

    public static void GrabProducts(List<ProductsClass> products) {
        try{
            JsonElement fileElement = JsonParser.parseReader((new FileReader(inputFile)));
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray productJsonArray = fileObject.getAsJsonArray("products");

            for(JsonElement productElement: productJsonArray){
                JsonObject productObj = productElement.getAsJsonObject();

                ProductsClass product = new ProductsClass(productObj.get("name").getAsString(),productObj.get("price").getAsDouble(),productObj.get("quantity").getAsInt());
                products.add(product);
            }
        }catch(FileNotFoundException e){
            System.err.println("Error Finding File");

        }
    }

}
