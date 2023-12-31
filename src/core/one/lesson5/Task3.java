package core.one.lesson5;

import java.util.Arrays;


/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 *                          |-> [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] |-> [0, 0]
 *                          |-> [1, 9, 3]
 */
public class Task3 {

    private static final int POSITIVE = 1;
    private static final int ZERO = 0;
    private static final int NEGATIVE = -1;


    public static void main(String[] args) {

        int[] valuesMixed = {-4, 0, 1, 9, 0, -18, 3};
        System.out.println("Исходный массив:");
        printArray(valuesMixed);
        System.out.println("Результирующие массивы:");
        printArray(splitArray(valuesMixed));
    }

    private static int[][] splitArray(int[] values) {
        int[][] result = new int[3][];
        result[0] = getOnly(NEGATIVE, values);
        result[1] = getOnly(ZERO, values);
        result[2] = getOnly(POSITIVE, values);
        return result;
    }

    private static int[] getOnly(int type, int[] values) {
        if (values == null || values.length == 0) {
            return new int[]{};
        }
        int countValues = countValues(type, values);
        if (countValues > 0) {
            int[] newArray = new int[countValues];
            int index = 0;
            for (int value : values) {
                if (condition(type, value)) {
                    newArray[index++] = value;
                }
            }
            return newArray;
        }
        return new int[]{};
    }

    private static int countValues(int type, int[] values) {
        int count = 0;
        if (values != null) {
            for (int value : values) {
                if (condition(type, value)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean condition(int type, int value) {
        return switch (type) {
            case POSITIVE -> value > 0;
            case ZERO -> value == 0;
            case NEGATIVE -> value < 0;
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    private static void printArray(int[][] arrays) {
        for (int[] array : arrays) {
            printArray(array);
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
