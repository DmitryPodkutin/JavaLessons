package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "да";
        System.out.println("У вас 10 попыток чтобы угадать число");
        GuessNumber logic = new GuessNumber();
        Scanner scan = new Scanner(System.in);
        while (answer.equals("да")) {
            logic.runGame();
            do {
                System.out.print( "\nХотите продолжить [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }

    }
}