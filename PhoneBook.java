import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static HashMap<Integer, String> phoneBook = new HashMap<Integer, String>();
    // public PhoneBook(){
    //     phoneBook = new HashMap<Integer, String>();
    // }
    public static void writePhonebook(int col){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < col; i++) {
            System.out.println("Введите номер телефона!");
            Integer num = in.nextInt();
            System.out.println("Введите имя владельца телефона!");
            String name = in.nextLine();
            PhoneBook.phoneBook.put(num, name);
        }
    }
    public static void readPhonebook(String nam){
        for (var elem : phoneBook.entrySet()) {
            if (elem.getValue().equals(nam)) {
                System.out.println(elem);
            }else{
                System.out.println("Такого номера нет или имя введено не правильно!!!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Введите желаемое действие!");
        System.out.println("1 - Чтение; 2 - запись");
        Integer op = re.nextInt();
        if (op == 1) {
            System.out.println("Введите имя которое хотите найти!");
            String fname = re.nextLine();
            PhoneBook.readPhonebook(fname);
        }else if (op == 2) {
            System.out.println("Введите количество пользователей которых хотите добавить!");
            Integer current = re.nextInt();
            PhoneBook.writePhonebook(current);
        }
    }
}
