import java.util.Scanner;

public class ChangeSymbol implements IChangeSymbol {
    private int numOfSymbol;

    public ChangeSymbol() {
        getSymbolNumberToChange();
    }

    public void getSymbolNumberToChange() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number of changed symbol:");
            while (!scanner.hasNextInt()) {
                System.out.println("Enter only integer :");
                scanner.next();
            }
            numOfSymbol = scanner.nextInt();
        }
        while (numOfSymbol < 1);
    }

    @Override
    public String changeEveryNSymbol(char[] text) {
        char changeChar = '%';
        char[] copyOfCharArray = Text.returnCopyOfCharArray(text);

        if (numOfSymbol <= copyOfCharArray.length) {
            for (int i = numOfSymbol - 1; i < copyOfCharArray.length; i = i + numOfSymbol) {
                copyOfCharArray[i] = changeChar;
            }
        }
        return String.valueOf(copyOfCharArray);
    }

}
