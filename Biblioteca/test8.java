package Biblioteca;

import java.util.Scanner;

public class test8 {
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

        System.out.print("Ingrese las filas de la tercera matriz: ");
        int thirdRow = sc.nextInt();
        System.out.print("Ingrese las columnas de la tercera matriz: ");
        int thirdColumn = sc.nextInt();
        int[][] third = basicas.fillFromKeyboard(sc, thirdRow, thirdColumn);

        int[][] producto = basicas.prodArraysABC(first, second,third);

        System.out.println("Primera matriz:");
        basicas.printArray(first);
        System.out.println("Segunda matriz:");
        basicas.printArray(second);
        System.out.println("Tercera matriz:");
        basicas.printArray(third);
        System.out.println("Matriz producto");
        basicas.printArray(producto);
    }
}
