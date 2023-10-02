package Laptop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добропожаловать в Магазин Ноутбуков!");
        System.out.println("Введите количество ноутбуков которые хотите добавить!");
        Integer current = in.nextInt();
        for (int i = 0; i < current; i++) {
            Laptop laptop = new Laptop();
            System.out.println("Введите Бренд");
            String br = in.next();
            laptop.brand = br;
            System.out.println("Введите размер ОЗУ");
            Integer rm = in.nextInt();
            laptop.ram = rm;
            System.out.println("Введите размер ЖД");
            Integer hd = in.nextInt();
            laptop.disk = hd;
            System.out.println("Введите какая ОС");
            String o = in.next();
            laptop.os = o;
            System.out.println("Введите Цвет");
            String col = in.next();
            laptop.color = col;
            LaptopShop.acceptLaptop(laptop);
        }
        
    }
    
    

    
}
