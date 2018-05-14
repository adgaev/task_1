package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 1. Приветствовать любого пользователя при вводе его имени через командную строку*/
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi, " + name + "!");

        /* 2. Отобразить в окне консоли аргументы командной строки в обратном порядке*/
        System.out.println("Enter any value:");
        Scanner value = new Scanner(System.in);
        String mirror = value.nextLine();


        char[] mir = mirror.toCharArray();
        System.out.print("Mirror: ");
        for (int i = mir.length - 1; i >= 0; i--) {
            System.out.print(mir[i] + "");
        }

        /* 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку*/
        System.out.println("Enter random number: ");
        Scanner number = new Scanner(System.in);
        String random = number.nextLine();
        char[] ran = random.toCharArray();

        System.out.println("More than one row: ");
        for (int i = 0; i < ran.length; i++) {
            System.out.println(ran[i]);
        }

        System.out.println("One row: ");
        for (int i = 0; i < ran.length; i++) {
            System.out.print(ran[i]);
        }

        /* 4. Ввести пароль из командной строки и сравнить его со строкой-образцом*/
        System.out.println("Enter a password:");
        Scanner password = new Scanner(System.in);
        String pas = password.next();
        System.out.println("Repeat password");
        Scanner pasrepeat = new Scanner(System.in);
        String rep = pasrepeat.next();

        if (pas.equals(rep)) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is wrong!");
        }

        /*5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль*/
        System.out.println("Enter integers:");
        Scanner integer = new Scanner(System.in);
        int f = integer.nextInt();
        int am = 0;
        int com = 1;
        while (f != 0) {
            am = am + f % 10;
            com *= f % 10;
            f = f / 10;
        }
        System.out.println("Integers amount = " + am);
        System.out.println("Integers composition = " + com);

        /*6.Ввести с консоли n целых чисел. На консоль вывести:*/
        System.out.println("How many integers are you going to enter?");
        Scanner numbers = new Scanner(System.in);
        int size = numbers.nextInt();
        int intNum[] = new int[size];
        System.out.println("Enter integer numbers with a space divider:");

        for (int i = 0; i < size; i++) {
            intNum[i] = numbers.nextInt();
        }

        /*6.1. Четные и нечетные числа*/
        for (int i = 0; i < size; i++) {
            if (intNum[i] % 2 != 0)
                System.out.println("Not integer: " + intNum[i]);
            else if (intNum[i] % 2 == 0)
                System.out.println("Integer: " + intNum[i]);
        }

        /*6.2. Наибольшее и наименьшее число*/
        int min = intNum[0];
        int max = intNum[0];

        for (int i = 0; i < size; i++) {
            if (min > intNum[i])
                min = intNum[i];
            if (max < intNum[i])
                max = intNum[i];
        }
        System.out.println("Minimal: " + min);
        System.out.println("Maximal: " + max);

        /*6.3. Числа, которые делятся на 3 или на 9*/
        for (int i = 0; i < size; i++)
            if ((intNum[i] % 3 == 0) && (intNum[i] % 9 == 0))
                System.out.println("Divided into 3 and 9 : " + intNum[i]);
            else if (intNum[i] % 3 == 0)
                System.out.println("Divided into 3: " + intNum[i]);

        /*6.4. Числа, которые делятся на 5 и на 7*/
        for (int i = 0; i < size; i++)
            if ((intNum[i] % 5 == 0) && (intNum[i] % 7 == 0))
                System.out.println("Divided into 5 and/or 7 : " + intNum[i]);

        /*6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр*/
        int a = 0, b = 0, c = 0;
        for (int x = 0; x < size; x++)
            if ((intNum[x] > 99) && (intNum[x] < 1000)) {
                a = intNum[x] / 10 / 10;
                b = intNum[x] / 10 % 10;
                c = intNum[x] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b) ;

                System.out.println("3digit numbers, in the decimal notation of which there are no identical digits: " + intNum[x]);
            }

        /*6.6. «Счастливые» числа*/
        int d = 0, e = 0;
        for (int j = 0; j < size; j++)
            if ((intNum[j] > 99999) && (intNum[j] < 1000000)) {

                d = intNum[j] / 1000; // select the 1 half
                e = intNum[j] % 1000; // select the 2 half

                int sum1 = 0;
                int sum2 = 0;
                while (d == 0) {  //amount of the 1 half
                    sum1 = sum1 + d % 10;
                    d = d / 10;
                }

                while (e == 0) {  //amount of the 2 half
                    sum1 = sum1 + e % 10;
                    e = e / 10;
                }

                if (sum1 == sum2) {
                    System.out.println("Lucky number: " + intNum[j]);
                }
            }
    }
}




