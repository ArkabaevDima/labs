package ru.mirea.arkabaev.lab1;

import java.util.Random;

public class Four {
    public static void main(String[] args) {
        int i;
        int q = 1;
        int[] array = new int[10];
        Random rnd = new Random();
        for (i = 0; i < array.length; i++){
            array[i] = rnd.nextInt();
            System.out.println(q + " элемент массива: " + array[i]);
            q++;
        }
        int n = array.length;
        for (i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
        }
        System.out.println("Отсортированный массив:");
        for (i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
        }
    }

