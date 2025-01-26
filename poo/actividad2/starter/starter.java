package starter;

import cli.Cli;
import data.Data;
import process.Process;

public class starter {
    public static void main(String[] args) {
        Data data = new Data();         // Crear instancia de Data
        Process process = new Process(data); // Pasar Data a Process
        process.execute(); // Ejecutar el proceso con los datos
        Cli cli = new Cli(process);    // Crear instancia de Cli con Process

        cli.start(); 
    }
}
