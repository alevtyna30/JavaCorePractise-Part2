package inheritance.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> sentence = new ArrayList<>();


    public void addWordToSentence(Word word){
        sentence.add(word);

    }
    public void printSentence(){
        System.out.println(sentence);
    }

    public List<Word> getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }
}
