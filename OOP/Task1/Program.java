package HomeWorkTasks.OOP.Task1;

import java.io.IOException;
import java.util.*;

public class Program {
    public static LinkedList family = new LinkedList<>();

    public static PrinterImple printer = new PrinterImple();

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Object> dict_command = new HashMap<>();
        dict_command.put(1, added(family));
        dict_command.put(2, search(family));
        Scanner sc = new Scanner(System.in);
//        FamilyTree.releishonship(family);

        boolean bool = true;
        System.out.println("Команды для работы со справочником : \n Добавление новой записи  - 1 \n Поиск по справочнику - 2 \n Выход - 3 ");

        while (bool){
            printer.print("Команда > ");
            String command = sc.next();
            Integer com = Integer.valueOf(command);
            if (com == 3){
                bool = exit(bool);
            }
            else if (dict_command.containsKey(com)) {
                dict_command.get(com);
            }
            else {
                printer.print("Command error!!!");
            }
        }
    }

    public LinkedList getFamily() {
        return family;
    }

    public static LinkedList added (LinkedList family){
        Scanner sc = new Scanner(System.in);
        printer.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст: ");
        Integer age = Integer.valueOf(sc.nextLine());
        printer.print("Введите статус члена семьи: ");
        String status = sc.next();
        HomeWorkTasks.OOP.Task1.status thisStatus1 = Person.setStatus(status);
        Person person = new Person(name, age, thisStatus1);
        family.add(person);
        return family;
    }
    public static LinkedList search(LinkedList family){
        Scanner scanner = new Scanner(System.in);
        printer.print("Введите имя: ");
        String name = scanner.next();
        for (Object pers : family
             ) {
            Person temp = (Person) pers;
            if (Objects.equals(temp.getName(), name)){
                printer.print(temp.toString());
            }
        }
        return family;
    }
    public static boolean exit (boolean bool){
        bool = false;
        return bool;
    }
}
