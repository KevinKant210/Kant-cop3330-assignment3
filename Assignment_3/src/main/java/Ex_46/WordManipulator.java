/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Kevin Kant
 *
 */

package Ex_46;

import java.util.ArrayList;
import java.util.*;

public class WordManipulator {
    public List<Word> wordList = new ArrayList<>();


    public boolean addWord(String Word){
        //for(words in wordList){
        //check if word is already in list and add one to amount return true;
        //else newWord = new Word()
        //amount = 1
        //word = word;
        //return true
        for(int i = 0 ; i < wordList.size(); i++){
            if(wordList.get(i).Word.compareToIgnoreCase(Word) == 0){
                wordList.get(i).Amount++;
                return true;
            }
        }

        Word newWord = new Word();
        newWord.Amount = 1;
        newWord.Word = Word;

        wordList.add(newWord);

        return true;

    }

    public boolean sortWordList (){
        /*
        Comparator<word> compare = new Comparator(word)
        return word1.amount.compareTo(word2.amount
        interesting use of lambda intellij did it automatically so ima keep it looks cool
        */
        Comparator<Word> comparator = (w1, w2) -> -(w1.Amount.compareTo(w2.Amount));
        //Collections.sort(wordList,comparator);
        wordList.sort(comparator);
        return true;
    }

}
