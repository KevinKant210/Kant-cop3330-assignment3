/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_46Test;


import Ex_46.WordManipulator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Ex_46.*;

public class Ex_46AppTester {
    @Test
    public void map_maker_stores_words_in_map(){
        WordManipulator wordMaker = new WordManipulator();
        assertTrue(wordMaker.addWord("boolin"));



    }

    @Test
    public void sorter_returns_true(){
        WordManipulator wordmaker = new WordManipulator();
        for(int i = 0 ; i < 10; i++){
            wordmaker.addWord("pop");
        }
        wordmaker.addWord("corn");

        assertTrue(wordmaker.sortWordList());


    }

    @Test
    public void sorter_properly_sorts_words(){
        WordManipulator wordmaker = new WordManipulator();

        wordmaker.addWord("corn");
        wordmaker.addWord("corn");

        for(int i = 0 ; i < 10; i++){
            wordmaker.addWord("pop");
        }



        wordmaker.addWord("wall");

        wordmaker.sortWordList();

        for(Word w : wordmaker.wordList){
            System.out.println(w.Amount);
        }
        assertEquals(0, wordmaker.wordList.get(0).Word.compareToIgnoreCase("pop"));
    }

}
