package poo.reto1;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            
            System.out.println("Ingresa texto para invertir. Escribe 'salir' para terminar este show.");
            
            while (true) {
                System.out.print("Ingresa texto: ");
                input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("salir")) {
                    System.out.println("Gracias, ten un buen día.");
                    break;
                }
            
                String reversed = new StringBuilder(input).reverse().toString();
                
                System.out.println("Texto invertido: " + reversed);
            }
        }
    }
}

