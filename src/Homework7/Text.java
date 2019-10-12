import java.util.Arrays;
import java.util.Scanner;

public abstract class Text {
    private String allText;

    public String getAllText() {
        return allText;
    }

    public void setAllText(String text) {
        this.allText = text;
    }

    public final void readTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter some text: ");
        str = scanner.nextLine();
        str.trim();
        setAllText(str);
    }

    public static char[] returnCopyOfCharArray(char[] someArray) {
        return Arrays.copyOf(someArray, someArray.length);
    }
}
