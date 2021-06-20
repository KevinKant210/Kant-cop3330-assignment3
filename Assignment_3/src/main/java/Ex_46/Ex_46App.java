/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_46;

import Ex_41.FileMaster;

public class Ex_46App {
    public static String inputFile = "C:\\Users\\Kevin\\Desktop\\Git Projects\\Kant-cop3330-assignment3\\Assignment_3\\src\\main\\java\\Ex_46\\exercise46_input.txt";
    public static void main(String[] args) {


        // File usedrfile = new file(filepath0
        // Scanner reader = new scanner (userfile)
        // WordManipulator wordHolder == new WordManipulator();

        FileMaster fileFetcher = new FileMaster();

        if(!fileFetcher.getFile(inputFile)) System.out.println("Error Accessing File");

        WordManipulator wordHolder = new WordManipulator();



        //while(!EOF)
        // {
        //      String temp = reader.next
        //      maplist.addword(temp);
        //  }
        grabWords(fileFetcher, wordHolder);

        DisplayList(wordHolder);
        //maplist.sortListReverse()
        //DisplayList(maplist.list);


    }

    private static void grabWords(FileMaster fileFetcher, WordManipulator wordHolder) {
        String holder = fileFetcher.readToken();
        while(holder != null){
            wordHolder.addWord(holder);
            holder = fileFetcher.readToken();
        }
    }

    private static void DisplayList(WordManipulator wordHolder) {
        wordHolder.sortWordList();

        for(int j = 0 ; j < wordHolder.wordList.size(); j++){
            System.out.printf("%-10s :",wordHolder.wordList.get(j).Word);
            for(int i = 0 ; i < wordHolder.wordList.get(j).Amount; i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
