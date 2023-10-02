package Laptop;


public class Laptop {
    String brand;
    Integer ram;
    Integer disk;
    String os;
    String color;


    @Override
    public String toString() {
        return "Laptop(" + "brand " + brand +  
                ", ram " + ram + 
                ", disk " + disk +
                ", os " + os +
                ", color " + color + ")";

    }

}
