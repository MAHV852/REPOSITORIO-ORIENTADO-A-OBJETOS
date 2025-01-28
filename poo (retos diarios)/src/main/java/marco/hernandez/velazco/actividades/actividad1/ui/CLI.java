package marco.hernandez.velazco.actividades.actividad1.ui;

import java.util.Scanner;

import marco.hernandez.velazco.actividades.actividad1.model.Car;
import marco.hernandez.velazco.actividades.actividad1.process.StockManager;

public class CLI {
    private final StockManager stockManager;

    public CLI(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\n=== MENÚ ===");
                System.out.println("1. Subir un auto");
                System.out.println("2. Mostrar catálogo");
                System.out.println("3. Salir");
                System.out.print("\nElige una opción: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                
                switch (choice) {
                    case 1 -> addCar(scanner);
                    case 2 -> showCatalog();
                    case 3 -> System.out.println("\nSaliendo del programa...");
                    default -> System.out.println("\nOpción no válida. Inténtalo de nuevo.");
                }
            } while (choice != 3);
        }
    }

    private void addCar(Scanner scanner) {
        System.out.println("\n--- Subir un Auto ---");
        System.out.print("Ingrese la marca del auto: ");
        String brand = scanner.nextLine();

        System.out.print("Ingrese el modelo del auto: ");
        String model = scanner.nextLine();

        System.out.print("Ingrese el año del auto: ");
        int year = scanner.nextInt();

        System.out.print("Ingrese el precio del auto: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        Car car = new Car(brand, model, year, price);
        stockManager.addCar(car);
        System.out.println("\nAuto agregado al catálogo con éxito.");
    }

    private void showCatalog() {
        System.out.println("\n=== Catálogo de Autos ===");

        if (stockManager.getCars().isEmpty()) {
            System.out.println("No hay autos en el catálogo.");
        } else {
            for (Car car : stockManager.getCars()) {
                System.out.println(car);
                System.out.println("----------------------------------");
            }
        }
    }
}