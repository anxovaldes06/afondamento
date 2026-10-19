package Biblioteca;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las filas de la primera matriz: ");
        int firstRows = sc.nextInt();
        System.out.print("Ingrese las columnas de la primera matriz: ");
        int firstColumns = sc.nextInt();
        int[][] first = basicas.fillFromKeyboard(sc, firstRows, firstColumns);

        System.out.print("Ingrese las filas de la segunda matriz: ");
        int secondRows = sc.nextInt();
        System.out.print("Ingrese las columnas de la segunda matriz: ");
        int secondColumns = sc.nextInt();
        int[][] second = basicas.fillFromKeyboard(sc, secondRows, secondColumns);

        int[][] result = basicas.sumArrays(first, second);

        System.out.println("Primera matriz:");
        basicas.printArray(first);
        System.out.println("Segunda matriz:");
        basicas.printArray(second);
        System.out.println("Matriz suma:");
        basicas.printArray(result);
    }
}
