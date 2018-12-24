package ru.mirea.arkabaev.lab1;

public class Three {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 1.0;
        double c;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            c = a / b;
            b++;
            sum += c;
            System.out.println(c);
        }
        System.out.println("Sum is " + sum);
    }
}
