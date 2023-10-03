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
        System.out.println("Хотите выполнить поиск Ноутбука? 1 - ДА, 2 - НЕТ");
        Integer ans = in.nextInt();
        if (ans == 1) {
            System.out.println("Выберите параметр по которому хотите выполнить поиск");
            System.out.println("1 - Бренд");
            System.out.println("2 - ОЗУ");
            System.out.println("3 - Объем ЖД");
            System.out.println("4 - Операционная система");
            System.out.println("5 - Цвет");
            Integer par = in.nextInt();
            String param;
            switch (par) {
                case 1:
                    System.out.println("Введите бренд для поиска!");
                    String bra = in.next();
                    param = "brand " + bra;
                    LaptopShop.SearchLaptop(param);
                    break;
                case 2:
                    System.out.println("Введите размер ОЗУ!");
                    Integer ra = in.nextInt();
                    param = " ram " + ra;
                    LaptopShop.SearchLaptop(param);
                    break;
                case 3:
                    System.out.println("Введите размер ЖД!");
                    Integer di = in.nextInt();
                    param = " disk " + di;
                    LaptopShop.SearchLaptop(param);
                    break;
                case 4:
                    System.out.println("Введите ОС для поиска!");
                    Integer os = in.nextInt();
                    param = " os " + os;
                    LaptopShop.SearchLaptop(param);
                    break;
                case 5:
                    System.out.println("Введите Цвет для поиска!");
                    Integer co = in.nextInt();
                    param = " color " + co;
                    LaptopShop.SearchLaptop(param);
                    break;
            
                default:
                    System.out.println("Введен некорректный параметр!");
                    break;
            }           
        }else{
            System.out.println("До свидания");
        }
        System.out.println("До свидания");
    }
}
