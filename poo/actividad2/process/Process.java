package process;

import data.Data;

public class Process {
    private final Data data;
    private int[] storedEvenNumbers;

    public Process(Data data) {
        this.data = data;
    }

    // Validar si el nombre ingresado coincide con el predefinido
    public boolean validateName(String userName) {
        return userName.equals(data.getCorrectName());
    }

    // Generar números pares en un rango específico
    public int[] generateEvenNumbers(int start, int end) {
        int size = (end - start) / 2 + 1; // Calcular tamaño del arreglo
        int[] evenNumbers = new int[size];
        int index = 0;

        for (int i = start; i <= end; i += 2) {
            evenNumbers[index++] = i;
        }

        return evenNumbers;
    }

    public void storeEvenNumbers(int[] evenNumbers) {
        this.storedEvenNumbers = evenNumbers;
    }

    public int[] getStoredEvenNumbers() {
        return storedEvenNumbers;
    }

    // Ejecutar el proceso con los datos
    public void execute() {
        // Example implementation
        int[] evenNumbers = generateEvenNumbers(0, 10);
        storeEvenNumbers(evenNumbers);
    }
}
