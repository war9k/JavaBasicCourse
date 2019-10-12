public class Word extends Text {
    private String wordText;

    public Word(String subs) {
        wordText = subs;
    }

    @Override
    public String toString() {
        return getClass().getName() + " : " + wordText;
    }

    public String getWordText() {
        return wordText;
    }
}