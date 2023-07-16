import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework_6 {
    public static void main(String[] args) {

        Laptop laptop_1 = new Laptop("apple", 8, 256, "macos", "silver", 250000);
        Laptop laptop_2 = new Laptop("apple", 16, 512, "macos", "silver", 500000);
        Laptop laptop_3 = new Laptop("asus", 12, 512, "windows", "black", 100000);
        Laptop laptop_4 = new Laptop("hp", 8, 256, "linux", "red", 50000);
        Laptop laptop_5 = new Laptop("samsung", 32, 128, "windows", "white", 150000);

        Set<Laptop> set = new HashSet<>();
        set.add(laptop_1);
        set.add(laptop_5);
        set.add(laptop_2);
        set.add(laptop_3);
        set.add(laptop_4);

        //System.out.println(set);

        System.out.println("Введите цифру, соответсвующую необходимому критерию:\n1-Марка;\n2-ОЗУ;\n3-Жесткий диск;\n4-ОС;\n5-Цвет;\n6-Цена");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Проверка ту стринг");
        laptop_1.toString();
        String yes = "yes";
        String no = "no";

        switch(input){
            case("1"):
            System.out.println("\nВведите модель ноутбука");
            String input_1 = scanner.nextLine();
            for (Laptop somethingLaptop : set) {
                if(somethingLaptop.filter_name(input_1)){

                   System.out.println(somethingLaptop.toString());
                }
            }
            break;
            case("2"):
            System.out.println("\nВведите ОЗУ ноутбука");
            int input_2 = Integer.parseInt(scanner.nextLine());
            System.out.println("\nЕсли вы хотите больше или равной этому значению, то напишите да\nЕсли хотите меньше, то напишите нет");
            String input_2_1 = scanner.nextLine();
            if(input_2_1.equals(yes)){
                for (Laptop somethingLaptop : set) {
                    if(somethingLaptop.filter_ram_more(input_2)){

                        System.out.println(somethingLaptop.toString());
                    }
                }
            }
            else if(input_2_1.equals(no)){
                for (Laptop somethingLaptop : set) {
                if(somethingLaptop.filter_ram_less(input_2)){

                   System.out.println(somethingLaptop.toString());
                }

            }
        }
            break;
            case("3"):
            System.out.println("\nВведите размер жесткого диска ноутбука");
            String input_3 = scanner.nextLine();
            System.out.println("\nЕсли вы хотите больше или равной этому значению, то напишите yes\nЕсли хотите меньше, то напишите no");
            String input_3_1 = scanner.nextLine();
            if(input_3_1.equals("yes")){
                for (Laptop somethingLaptop : set) {
                    if(somethingLaptop.filter_hard_drive_more(input_3)){

                     System.out.println(somethingLaptop.toString());
                    }

                }
            }
            else if(input_3_1.equals("no")){
                for (Laptop somethingLaptop : set) {
                     if(somethingLaptop.filter_hard_drive_less(input_3)){

                     System.out.println(somethingLaptop.toString());
                    }
                
                }
            }
            break;
            case("4"):
            System.out.println("\nВведите ОС ноутбука");
            String input_4 = scanner.nextLine();
            for (Laptop somethingLaptop : set) {
                if(somethingLaptop.filter_os_laptop(input_4)){

                   System.out.println(somethingLaptop.toString());
                }
            }
            break;
            case("5"):
            System.out.println("\nВведите цвет ноутбука");
            String input_5 = scanner.nextLine();
            for (Laptop somethingLaptop : set) {
                if(somethingLaptop.filter_color(input_5)){

                   System.out.println(somethingLaptop.toString());
                }
            }
            break;
            case("6"):
            System.out.println("\nВведите цену ноутбука");
            String input_6 = scanner.nextLine();
            System.out.println("\nЕсли вы хотите больше или равной этому значению, то напишите yes\nЕсли хотите меньше, то напишите no");
            String input_6_1 = scanner.nextLine();
            if(input_6_1.equals("yes")){
                for (Laptop somethingLaptop : set) {
                if(somethingLaptop.filter_price_more(input_6)){

                   System.out.println(somethingLaptop.toString());
                }
                
            }

            }
            else if(input_6_1.equals("no")){
                for (Laptop somethingLaptop : set) {
                if(somethingLaptop.filter_price_less(input_6)){

                   System.out.println(somethingLaptop.toString());
                }
                
            }
                
            }
            break;

        }





    }
    
}