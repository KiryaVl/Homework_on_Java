package HomeWorkTasks;

import java.util.ArrayList;
import java.util.List;

//Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
//Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        System.out.println(integerList);
        System.out.println(removeList(integerList));
        ArrayList<String> stringList = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(stringList);
        System.out.println(replacenum(stringList));
    }

    private static ArrayList<Integer> removeList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                arrayList.remove(i);
            }
        }
        return arrayList;
    }

    private static ArrayList<String> replacenum(ArrayList<String> stringArrayList) {
        ArrayList<String> newString = new ArrayList<>();
        for (String s : stringArrayList) {
            if (!isNumber(s)) {
                newString.add(s);
            }
        }
        return newString;
    }


    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

