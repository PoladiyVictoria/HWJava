import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static HashMap<Integer, String> phoneBook = new HashMap<>();
    
    public static void writePhonebook(int col){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < col; i++) {
            System.out.println("Введите номер телефона!");
            Integer num = in.nextInt();
            System.out.println("Введите имя владельца телефона!");
            String name = in.next();
            PhoneBook.phoneBook.put(num, name);
        }
        System.out.println(phoneBook);
    }
    public static void readPhonebook(String nam){
        for (var elem : phoneBook.entrySet()) {
            int cur = 0;
            if (elem.getValue().equals(nam)) {
                System.out.println(elem);
                cur++;
            }
            if (cur == 0) {
                System.out.println("Такого номера нет или имя введено не правильно!!!");
            }    
            
        }
    }
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Добропожаловать в Телефонный Справочник!");
        System.out.println("Введите количество пользователей которых хотите добавить!");
        Integer current = re.nextInt();
        System.out.println("Вводите новые имена!");
        PhoneBook.writePhonebook(current);
        System.out.println("Хотите выполнить поиск по имени?");
        System.out.println("1 - ДА; 2 - НЕТ");
        Integer op = re.nextInt();
        if (op == 1) {
            System.out.println("Введите имя которое хотите найти!");
            String fname = re.next();
            PhoneBook.readPhonebook(fname);
            System.out.println("До свидания!");
        }else if (op == 2) {
            System.out.println("До свидания!");
        }else{
            System.out.println("Введен неправильный оператор действия!");
        }
    }
}