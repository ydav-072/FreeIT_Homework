package ru.freeIt.homeWork.lesson2;
//В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести правильно окончание.
//        Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.

public class Query7 {
    public static void main(String[] args) {
        int value = 25;
        if(value % 10 == 1){
            System.out.println(value + " программист");
        }else {
            if (value % 10 == 2 | value % 10 == 3 | value % 10 == 4) {
                System.out.println(value + " программистa");
            } else {
                System.out.println(value + " программистов");
            }
        }
    }
}
