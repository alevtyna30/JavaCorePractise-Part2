package inheritance.text;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Word word1 = new Word("Set");
        Word word2 = new Word("doesn't");
        Word word3 = new Word("contain");
        Word word4 = new Word("duplicate");
        Word word5 = new Word("elements");

        Sentence sentenceList = new Sentence();

        sentenceList.addWordToSentence(word1);
        sentenceList.addWordToSentence(word2);
        sentenceList.addWordToSentence(word3);
        sentenceList.addWordToSentence(word4);
        sentenceList.addWordToSentence(word5);

        //sentenceList.printSentence();

        Text textList = new Text();

        textList.addSentence(sentenceList);
        textList.printText();
        textList.setHeader("Set");
        textList.getHeader();
















    }
}
