import java.util.ArrayList;

public class Paragraph extends Text {
    private ArrayList<Sentence> sentences;

    public Paragraph() {
        super.readTextFromConsole();
        createListOfSentences(super.getAllText());
    }

    public void createListOfSentences(String string) {
        sentences = new ArrayList<>();
        for (String subs : string.split("\\.|!|\\?")) {
            subs.trim();
            sentences.add(new Sentence(subs));
        }
    }

    public ArrayList<Sentence> getSentencesList() {
        return sentences;
    }
}
