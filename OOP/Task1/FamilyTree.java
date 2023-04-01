package HomeWorkTasks.OOP.Task1;


import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class FamilyTree extends Program {
    public LinkedList familyList = Program.family;

     public static LinkedList releishonship(LinkedList familyList){
         SaveFiles saveFiles = new PrinterImple();
         Scanner scanner = new Scanner(System.in);
         for (int i = 0; i < familyList.size(); i++) {
             Person tempPerson = (Person) familyList.get(i);
             if (tempPerson.getStatus() == status.mother) {
                 System.out.println("У " + tempPerson.getName() + " есть дети?");
                 String answer = scanner.next();
                 answer = answer.toLowerCase();
                 String yes = "да";
                 if (Objects.equals(answer, yes)){
                     System.out.println("Введите имя ребенка: ");
                     String answer2 = scanner.next();
                     for (int j = 0; j < familyList.size(); j++){
                         Person tempPerson2 = (Person) familyList.get(j);
                         if (Objects.equals(answer2,tempPerson2.getName())){
                             String name = tempPerson.getName();
                             LinkedList list = new LinkedList<>();
                             list.add(tempPerson2);
                             System.out.println("Дети " + name + list);
                             saveFiles.savefile(list.toString());
                         }
                     }
                 }
             }
         }
         return familyList;
    }
}
