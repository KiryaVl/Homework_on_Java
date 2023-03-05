package HomeWorkTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in.nextInt();
        System.out.println(isLeapYear(year));

        in = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int len = in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int initialValue = in.nextInt();

        int[] array1 = createArray(len, initialValue);
        System.out.println(Arrays.toString(array1));


        // *1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] myArray ={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(myArray));
        int[] newArray = swapValue(myArray);
        System.out.println(Arrays.toString(newArray));

        // *2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int [] niceArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(niceArray));
        int [] multiplicationNiceArray = multiplicationValue(niceArray);
        System.out.println(Arrays.toString(multiplicationNiceArray));

        // *3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // * Также заполнить элементы побочной диагонали

        in = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int value = in.nextInt();
        int [] [] doubleArray = fillArray(value);
        System.out.println(Arrays.deepToString(doubleArray));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int i = a + b;
        if ((20 >= i) & (i >= 10)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        //напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            return false;
        }
        return true;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    //**
    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    /* Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    /* 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    /* 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    /* и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    /* Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    /* Также заполнить элементы побочной диагонали
    /*/




    private static int[] swapValue(int[] array) {
        int[] swapArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                swapArray[i] = 0;
            }
            else {
                swapArray[i] = 1;
            }
        }
        return swapArray;

    }

    private static int[] multiplicationValue(int [] array) {
        int [] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                newArray[i] = array[i] * 2;
            }
            else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
    private static int[][] fillArray(int value) {
        int [][] array = new int [value][value];
        for (int i = 0; i < array.length;i++ ){
            for (int j = 0; j < array.length; j++){
                if (i == j){
                    array[i][j] = 1;
                }
                else if (j == (value -1)) {
                    array[i][j] = 1;
                    value -= 1;
                }

                else {
                    array[i][j] = j;
                }
            }
        }
        return array;
    }

}

