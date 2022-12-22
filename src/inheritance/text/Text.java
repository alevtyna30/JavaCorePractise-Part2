package inheritance.text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> text = new ArrayList<>();
    private String header;



    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void addSentence(Sentence sentence){
        text.add(sentence);

    }
    public void printText(){
        System.out.println(text);
    }
}
