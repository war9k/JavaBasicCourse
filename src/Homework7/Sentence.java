import java.util.ArrayList;

public class Sentence extends Text {
    private ArrayList<Word> words;
    private String sentenceText;

    public Sentence(String subs) {
        sentenceText = subs;
        createListOfWords(subs);
    }

    @Override
    public String toString() {
        return getClass().getName() + " : " + sentenceText;
    }

    public void createListOfWords(String string) {
        words = new ArrayList<>();
        for (String subs : string.split(" +")) {
            subs.trim();
            words.add(new Word(subs));
        }
    }

    public ArrayList<Word> getWordsList() {
        return words;
    }
}
