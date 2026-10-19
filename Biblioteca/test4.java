package Biblioteca;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int rows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int cols = sc.nextInt();
        int[][] array = basicas.fillFromKeyboard(rows, cols);
        System.out.println("Matriz ingresada");
        basicas.printArray(array);
        System.out.println("¿ Es diagonal ?" +basicas.esDiagonal(array));
    }
}