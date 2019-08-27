package Homework4;

public class Task4_2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        Massive massive = new Massive();
        massive.printMassiveAsLine(array);
        massive.printReverseMassiveAsLine(array);
        System.out.println(massive.getSumOfElements(array));
        array = massive.multiptyBy3(array);
        massive.printMassiveAsLine(array);
        massive.printReverseMassiveAsLine(array);


    }
}
