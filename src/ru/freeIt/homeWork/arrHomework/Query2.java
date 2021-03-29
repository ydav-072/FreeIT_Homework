package ru.freeIt.homeWork.arrHomework;

import java.util.Arrays;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 … 7 5 3 1)
public class Query2 {
    public static void main(String[] args) {
        int[] array;
        int index = 0;
        for (int  i = 1; i <= 99; i++){
            if (i % 2 != 0){
                index++;
            }
        }
        array = new int[index];
        int i = 1;
        for (int j = 0; j < array.length; j++) {
                if (i % 2 != 0) {
                    array[j] = i;
                }
                i++;
        }
    }
}
