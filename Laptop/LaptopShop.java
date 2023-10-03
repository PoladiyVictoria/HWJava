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
        int cur = 0;
        for (var elem : laptops.entrySet()) {
            String[] lap = new String[5];
            lap = elem.getValue().toString().split(",");
            for (int i = 0; i < lap.length; i++) {
                if (lap[i].equals(par)) {
                    System.out.println(elem);
                    cur++;
                }
            }
        }
        if (cur == 0) {
            System.out.println("Такого ноутбука нет или параметр введен не правильно!!!");
        }
    }
}
