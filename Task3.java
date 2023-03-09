package HomeWorkTasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//2) Создать файл с названием file.txt. Если файл уже есть, то создавать не надо
// Записать в него Слово "TEXT" 100 раз
public class Task3 {
    public static void main (String[] args) {


    String text = "TEXT ";
    int value = 100;
    File file = new File("file.txt");
    try {
        FileWriter writer = new FileWriter("file.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write((printMethod(value, text)));
        bufferWriter.close();
    }
        catch (IOException e) {
        System.out.println(e);
    }

}
        private static String printMethod(int value, String text){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < value; i++){
                result.append(text);
            }


            return String.valueOf(result);
}
}