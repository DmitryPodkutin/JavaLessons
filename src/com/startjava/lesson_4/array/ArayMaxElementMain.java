package com.startjava.lesson_4.array;

import java.util.Scanner;

/**
 * Created by Dmitry on 25.03.2019.
 */
public class ArayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину масива: ");
        int maxLeght = scanner.nextInt();
        int[] numbers = new int[maxLeght];
        System.out.print("Заполните масив целыми числами через пробел: ");

        for (int i=0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        for (int i=0; i < maxLeght -1; i++){
            if (max < numbers[i+1]){
                max = numbers[i+1];
            }
        }
        System.out.println("Максимально число в массиве: " + max);
    }
}
