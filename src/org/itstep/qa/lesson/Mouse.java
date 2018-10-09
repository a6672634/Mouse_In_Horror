package org.itstep.qa.lesson;

public class Mouse {
    String name;
    private final int START_X;
    private final int START_Y;
    private int currentX;
    private int currentY;
    private String color;

    public Mouse(String name, int x, int y) {
        this.name = name;
        START_X = x;
        START_Y = y;
        currentX = START_X;
        currentY = START_Y;
        color = "white";
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run(int wind) {
        currentX += wind + 1;
        currentY += wind + 1;
    }

    public void digTonnel() {
        currentY += 5;
        currentY += 5;
    }

    public String toString() {
        return name;
    }
}
