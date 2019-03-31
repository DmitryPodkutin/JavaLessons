package com.startjava.lesson_4.array;

/**
 * Created by Dmitry on 24.03.2019.
 */
public class ArrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, 0.5f,200.5f};
//
//        System.out.println(numbers.length);
//        System.out.println(numbers1.length);
        for(int i=0; i < numbers.length; i++){
            numbers[i] = (int) ( Math.random() * 100 );
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        String [] text = new String[3];
        for(String string: text) {
            System.out.println(string);

        }

    }
}
