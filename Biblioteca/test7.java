package Biblioteca;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las filas de la primera matriz: ");
        int firstRow = sc.nextInt();
        System.out.print("Ingrese las columnas de la primera matriz: ");
        int firstColumn = sc.nextInt();
        int[][] first = basicas.fillFromKeyboard(sc, firstRow, firstColumn);

        System.out.print("Ingrese las filas de la segunda matriz: ");
        int secondRow = sc.nextInt();
        System.out.print("Ingrese las columnas de la segunda matriz: ");
        int secondColumn = sc.nextInt();
        int[][] second = basicas.fillFromKeyboard(sc, secondRow, secondColumn);

        int[][] producto = basicas.prodArrays(first, second);

        System.out.println("Primera matriz:");
        basicas.printArray(first);
        System.out.println("Segunda matriz:");
        basicas.printArray(second);
        System.out.println("Matriz producto");
        basicas.printArray(producto);
    }
}
