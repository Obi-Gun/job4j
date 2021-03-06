package ru.job4j.loop;

public class Board {

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if ((h + w) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
