package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /* 1. Приветствовать любого пользователя при вводе его имени через командную строку */
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi, " + name + "!");

        /* 2. Отобразить в окне консоли аргументы командной строки в обратном порядке */
        System.out.println("Enter any value:");
        Scanner value = new Scanner(System.in);
        String mirror = value.nextLine();

        char[] mir = mirror.toCharArray();
        System.out.print("Lets check it in the mirror: ");
        for (int i = mir.length - 1; i >= 0; i--) {
            System.out.print(mir[i]);
        }

        /* 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку */
                System.out.println("Enter random number: ");
        Scanner number = new Scanner(System.in);
        String random = number.nextLine();
        char[] ran = random.toCharArray();

        System.out.println("More than one row: ");
        for (int i = 0; i < ran.length; i++) {
            System.out.println(ran[i]);
        }

        System.out.print("One row: ");
        for (int i = 0; i < ran.length; i++) {
            System.out.print(ran[i]);
        }
    }
}