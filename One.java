package ru.mirea.arkabaev.lab1;
import java.util.*;

public class One {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        int[] array = new int[10];
        Random rnd = new Random();
        for (i = 0; i < array.length; i++)
            array[i] = rnd.nextInt();
        System.out.println("Сумма с рандомными значениями и циклом FOR.");
        System.out.print("Элементы массива:");
        for (i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            sum = sum + array[i];
        }
        System.out.println("\nСумма: " + sum);
        sum = 0;

        System.out.println("Сумма со значениями, полученными от юзера и циклом   FOR");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Сумма: " + sum);
        sum = 0;

        System.out.println("Сумма со значениями, полученными от юзера и циклом WHILE");
        System.out.println("Введите элементы массива:");
        i = 0;
        while (i < array.length) {
            array[i] = input.nextInt();
            sum = sum + array[i];
            i++;
        }
        System.out.println("Сумма: " + sum);
        sum = 0;

        System.out.println("Сумма со значениями, полученными от юзера и циклом DO...WHILE");
        System.out.println("Введите элементы массива:");
        i = 0;
        do {
            array[i] = input.nextInt();
            sum = sum + array[i];
            i++;
        } while (i < array.length);
        System.out.println("Сумма: " + sum);
    }
}


