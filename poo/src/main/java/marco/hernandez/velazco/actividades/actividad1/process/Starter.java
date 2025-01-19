package marco.hernandez.velazco.actividades.actividad1.process;

import marco.hernandez.velazco.actividades.actividad1.ui.CLI;

public class Starter {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        CLI cli = new CLI(stockManager);
        cli.start();
    }
}