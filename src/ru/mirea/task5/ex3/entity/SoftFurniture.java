package ru.mirea.task5.ex3.entity;

public class SoftFurniture extends Furniture {

    public String type;
    public String appointment;

    public SoftFurniture(String material, int weight, int price) {
        super(material, weight, price);
    }

    public SoftFurniture(String material, int weight, int price, String type, String appointment) {
        super(material, weight, price);
        this.type = type;
        this.appointment = appointment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "SoftFurniture{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", appointment='" + appointment + '\'' +
                '}';
    }
}
