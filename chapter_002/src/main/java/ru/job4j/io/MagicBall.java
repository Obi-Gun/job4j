package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Class for "Магический шар. [#179514]" task.
 * Этот код возвращает один из трёх ответов на вопрос: да, нет и может быть.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.09.2019
 */
public class MagicBall {

    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            String inText = input.nextLine();
            int answer = new Random().nextInt(3);
            if (inText.equals("exit")) {
                break;
            } else if (answer == 0) {
                    System.out.println("Yes");
            } else if (answer == 1) {
                    System.out.println("No");
            } else {
                    System.out.println("May be");
            }
        }
    }
}
