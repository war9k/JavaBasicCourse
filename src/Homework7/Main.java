public class Main {

    public static void main(String[] args) {

        Paragraph paragraph = new Paragraph();
        ChangeSymbol changeSymbol = new ChangeSymbol();
        for (Sentence sen : paragraph.getSentencesList()) {
            System.out.println(sen);
            for (Word word : sen.getWordsList()) {
                System.out.print("\tOriginal : " + word.getWordText() + "\n");
                System.out.print("\tChanged : " + changeSymbol.changeEveryNSymbol(word.getWordText().toCharArray()) + "\n");
            }
        }
    }
}
