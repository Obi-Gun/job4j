package ru.job4j.io;

import java.util.Scanner;

/**
 * Class for "Scanner и чтение числа из консоли. [#179518]" task.
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 24.09.2019
 */
public class Matches {
    private int counter = 11;
    private int select = 0;
    private String player1 = "номер 1";
    private String player2 = "номер 2";
    private String player = this.player2;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Matches game = new Matches();
        game.logic();
    }

    /**
     * Main logic of the game. Method checks the winner.
     */
    private void logic() {
        System.out.println("ИГРА 11\n" + "На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. "
                + "Выигрывает тот, кто забрал последние спички.");
        boolean exit = false;
        while (!exit) {
            this.switchPlayers();
            this.input();
            this.counter -= this.select;
            if (this.counter <= 0) {
                this.showTheWinner();
                exit = true;
            }
        }
    }

    /**
     * Method switches players. Because they need to play one by one.
     */
    private void switchPlayers() {
        if (this.player.equals(this.player1)) {
            this.player = this.player2;
        } else {
            this.player = this.player1;
        }
    }

    /**
     * Method writes who is the winner.
     */
    private void showTheWinner() {
        if (this.player.equals(this.player1)) {
            System.out.println("Победил игрок " + this.player1);
        } else {
            System.out.println("Победил игрок " + this.player2);
        }
    }

    /**
     * Method asks to input integer, then checks is input equals 1 or 2 or 3.
     */
    private void input() {
        System.out.println("Очередь игрока " + this.player + ". Осталось " + this.counter
                + " спичек. Сколько спичек хотите взять?");
        int tmp = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("Введите 1, 2 или 3:");
            tmp = Integer.valueOf(this.input.nextLine());
            if (tmp == 1 || tmp == 2 || tmp == 3) {
                exit = true;
            } else {
                System.out.print("Введено неправильное число. ");
            }
        }
        this.select = tmp;
    }
}
