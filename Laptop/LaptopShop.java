package Laptop;

import java.util.HashMap;

public class LaptopShop {
    static HashMap<Integer, Laptop> laptops = new HashMap<>();
    static int id;
    static void acceptLaptop(Laptop laptop){
        laptops.put(id++, laptop);
    }
    static void printLaptop(){
        System.out.println(laptops.toString());
    }
    static void SearchLaptop(String par){
        for (var elem : laptops.entrySet()) {
            
        }
    }
}
