package Homework4;

public class Massive {

    //метод принимает в качестве аргументов массив и печатает его в консоли в одну строку, ничего не возвращает;
    public void printMassiveAsLine(int[] arr) {
        System.out.println("Array");
        for (int out : arr) {
            System.out.print(out + " ");
        }
        System.out.println();
    }
    //метод который принимает в качестве аргументов массив и печатает его в консоли в одну строку в обратном порядке,
    // ничего не возвращает;
    public void printReverseMassiveAsLine(int[] arr) {
        System.out.println("Revers order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //метод который принимает массив, а возвращает сумму его элементов
    public int getSumOfElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //метод который принимает массив, умножает каждый элемент массива на 3 и возвращает умноженный массив;
    public int[] multiptyBy3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;

        }
        return arr;
    }
}
