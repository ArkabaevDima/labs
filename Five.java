package ru.mirea.arkabaev.lab1;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int a, i;
        int result = 1;
        System.out.println("Введите значение");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a < 0) {
            System.out.println("Вы ввели отрицательное значение");
        }
        else {
            for (i = 1; i <= a; i++)
                result *= i;
            System.out.println("Факториал равен: " + result);
        }
        }
    }