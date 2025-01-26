package cli;

import java.util.Scanner;

import process.Process;

public class Cli {
    private final Process process;

    public Cli(Process process) {
        this.process = process;
    }

    public void start() {
        // Solicitar nombre del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar nombre del usuario
            System.out.print("Ingrese su nombre: ");
            String userName = scanner.nextLine();
            
            // Validar el nombre ingresado
            if (process.validateName(userName)) {
                System.out.println("¡Hola, " + userName + "! Nombre verificado correctamente.");
            } else {
                System.out.println("Nombre no coincide. Saliendo del programa.");
                scanner.close();
                return;
            }
            
            int option;
            do {
                // Mostrar el menú
                System.out.println("\n=== MENÚ ===");
                System.out.println("1. Generar y almacenar números pares del 2 al 100");
                System.out.println("2. Mostrar los números pares generados");
                System.out.println("3. Salir");
                System.out.print("Elige una opción: ");
                option = scanner.nextInt();
                
                switch (option) {
                    case 1 -> {
                        int[] evenNumbers = process.generateEvenNumbers(2, 100);
                        process.storeEvenNumbers(evenNumbers);
                        System.out.println("Números pares generados y almacenados correctamente.");
                    }
                    case 2 -> {
                        System.out.println("\n=== Números pares generados ===");
                        int[] numbers = process.getStoredEvenNumbers();
                        if (numbers != null) {
                            for (int num : numbers) {
                                System.out.print(num + " ");
                            }
                            System.out.println();
                        } else {
                            System.out.println("No se han generado números pares aún.");
                        }
                    }
                    case 3 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (option != 3);
        }
    }
}
