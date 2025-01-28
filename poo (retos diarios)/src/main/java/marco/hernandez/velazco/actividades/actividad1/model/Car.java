package marco.hernandez.velazco.actividades.actividad1.model;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Marca: " + brand + "\n" +
               "Modelo: " + model + "\n" +
               "Año: " + year + "\n" +
               "Precio: $" + String.format("%.2f", price);
    }
}