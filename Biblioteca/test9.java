
package Biblioteca;
public class test9 {
    public static void main(String[] args) {
        System.out.println("=== INICIO DEL TEST DE DETERMINANTE ===");
        
        try {
            basicas.pedirYCalcularDeterminante3x3();
            
        } catch (Exception e) {
            System.out.println("Error durante la ejecución del test: " + e.getMessage());
        }
        
        System.out.println("=== FIN DEL TEST ===");
    }
}