package com.startjava.lesson_2_3.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    public void runGame() {
        int computerNumber = (int) (Math.random() * 100);
        PlayerOne onePlayerName = new PlayerOne();
        PlayerTwo twoPlayerName = new PlayerTwo();
        Scanner scan = new Scanner(System.in);
        System.out.println(computerNumber);
        int[] onePlayerNumber = new int[10];
        int[] twoPlayerNumber = new int[10];
        int i;

        for (i = 0; i < onePlayerNumber.length; i++) {
            System.out.print(onePlayerName.getPlayerName1() + " введите число: ");
            onePlayerNumber[i] = scan.nextInt();

            if (onePlayerNumber[i] == computerNumber) {
                System.out.println("Игрок: " + onePlayerName.getPlayerName1() + " угадал число " + computerNumber + " с " + i + " попытки");
                break;
            }
            if (onePlayerNumber[i] < computerNumber) {
                System.out.println("Введеное вами число = " + onePlayerNumber[i] + " меньше того, что загадал компьютер");
            }
            if (onePlayerNumber[i] > computerNumber) {
                System.out.println("Введеное вами число  " + onePlayerNumber[i] + " больше того, что загадал компьютер");
            }

            System.out.print(twoPlayerName.getPlayerName2() + " введите число: ");
            twoPlayerNumber[i] = scan.nextInt();

            if (twoPlayerNumber[i] == computerNumber) {
                System.out.println("Игрок: " + twoPlayerName.getPlayerName2() + " угадал число " + computerNumber + " с " + i + " попытки");
                break;
            }
            if (twoPlayerNumber[i] < computerNumber) {
                System.out.println("Введеное вами число = " + twoPlayerNumber[i] + " меньше того, что загадал компьютер");
            }
            if (twoPlayerNumber[i] > computerNumber) {
                System.out.println("Введеное вами число  " + twoPlayerNumber[i] + " больше того, что загадал компьютер");
            }

        }

        //Числа игроков введенные во время игры
        int[] a = Arrays.copyOf(onePlayerNumber,i+1);
        int[] b = Arrays.copyOf(twoPlayerNumber,i+1);
        System.out.print("Числа первого игрока : ");
        for (int x: a) { System.out.print(x +  ", ");}
        System.out.print("\nЧисла второго игрока : ");
        for (int y: b) { System.out.print( y + ", ");}
        //Обнуление масива чисел игроков
        Arrays.fill(onePlayerNumber,0,i+1,0);
        Arrays.fill(twoPlayerNumber, 0, i+1, 0);




    }
}
