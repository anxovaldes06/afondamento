package Biblioteca;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int rows = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int cols = sc.nextInt();
        int[][] array = basicas.fillFromKeyboard(rows, cols);
        int[][] transposedArray = basicas.transpose(array);
        System.out.println("Matriz transpuesta:");
        basicas.printArray(transposedArray);
    }
}
