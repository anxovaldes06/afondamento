package Biblioteca;

import java.util.Scanner;
public class basicas {

    public static int[][] fillFromKeyboard(int rows, int cols) {
        return fillFromKeyboard(new Scanner(System.in), rows, cols);
    }

    public static int[][] fillFromKeyboard(Scanner sc, int rows, int cols) {
        int[][] array = new int[rows][cols];
        System.out.println("Añade " + (rows * cols) + " números: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static int[][] transpose (int[][] array){
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposed = new int[cols][rows];
        for(int i= 0 ; i<rows; i++){
            for(int j=0 ; j<cols; j++){
                transposed[j][i] = array[i][j];

            }
        }
        return transposed;
    }

    public static int[][] sumArrays(int[][] first, int[][] second) {
        if (first.length != second.length || first[0].length != second[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones");
        }

        int[][] result = new int[first.length][first[0].length];

        for (int row = 0; row < first.length; row++) {
            for (int column = 0; column < first[row].length; column++) {
                result[row][column] = first[row][column] + second[row][column];
            }
        }

        return result;
    }

      public static int[][] resArrays(int[][] first, int[][] second) {
        if (first.length != second.length || first[0].length != second[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones");
        }

        int[][] result = new int[first.length][first[0].length];

        for (int row = 0; row < first.length; row++) {
            for (int column = 0; column < first[row].length; column++) {
                result[row][column] = first[row][column] - second[row][column];
            }
        }

        return result;
    }

       public static int[][] prodArrays(int[][] first, int[][] second) {
        if (first.length != second.length || first[0].length != second[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones");
        }

        int[][] result = new int[first.length][first[0].length];

        for (int row = 0; row < first.length; row++) {
            for (int column = 0; column < first[row].length; column++) {
                result[row][column] = first[row][column] * second[row][column];
            }
        }

        return result;
    }

    public static int[][] prodArraysABC(int[][] A, int[][] B, int[][] C) {

    if (A[0].length != B.length) {
        throw new IllegalArgumentException("Columnas de A deben coincidir con filas de B");
    }

    if (B[0].length != C.length) {
        throw new IllegalArgumentException("Columnas de B deben coincidir con filas de C");
    }

    int[][] AB = new int[A.length][B[0].length];

    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < B[0].length; j++) {
            for (int k = 0; k < B.length; k++) {
                AB[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    int[][] resultado = new int[AB.length][C[0].length];

    for (int i = 0; i < AB.length; i++) {
        for (int j = 0; j < C[0].length; j++) {
            for (int k = 0; k < C.length; k++) {
                resultado[i][j] += AB[i][k] * C[k][j];
            }
        }
    }

    return resultado;
}
            
        public static boolean esSimetrica(int[][] array){
            int rows = array.length;
            int cols = array[0].length;

            if (rows != cols) {
                throw new IllegalArgumentException("la matriz debe ser cuadrada para ser simétrica");
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (array[i][j] != array[j][i]) {
                        return false;
                    }
                }
            }
            return true;
    }

    

            public static boolean esDiagonal(int[][] array){
                int rows = array.length;
                int cols = array[0].length;

                if(rows!= cols){
                    throw new IllegalArgumentException("la matriz debe ser cuadrada para ser diagonal");
                }

                for(int i=0; i< cols; i++){
                    for(int j=0; j<rows;j++){
                            if(i!=j && array[i][j] != 0){
                                return false;
                            }

                    }
                }
                    return true;
            }


            




    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }




}