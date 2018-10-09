package org.itstep.qa.runner;

import org.itstep.qa.lesson.Bush;
import org.itstep.qa.lesson.Mouse;

import java.util.Random;

public class Game {
    private static final Bush[] BUSHES = new Bush[18];
    private static final Mouse[] MICE = new Mouse[2];
    private static final String[] NAMES = {"Petya", "Jerry", "Fred", "Tom", "Anton", "Boris"};
    private static final String[] COLORS = {"Yellow", "Red", "Blue", "Pink", "Black"};
    private final static Random RANDOM = new Random();


    public static void main(String[] args) {
        buhesInit();
        miceInit();
        startGame();
    }

    private static void buhesInit() {
        for(int i = 0; i < BUSHES.length; i++)
            BUSHES[i] = new Bush(RANDOM.nextInt(99),RANDOM.nextInt(99), COLORS[RANDOM.nextInt(4)]);
    }

    private static void miceInit() {
        for(int i = 0; i < MICE.length; i++)
            MICE[i] = new Mouse(NAMES[RANDOM.nextInt(5)],RANDOM.nextInt(99), RANDOM.nextInt(99));
    }

    private static Mouse winner(Mouse mouse) {
        for(Bush bush : BUSHES) {
            if(mouse.getCurrentX() == bush.getX() && mouse.getCurrentY() == bush.getY()) {
                mouse.setColor(bush.getColor());
                return mouse;
            }
        }
        return null;
    }

    private static void startGame() {
        while(true) {
            boolean hasWinner = false;
            for(int i = 0; i < MICE.length; i++) {
                move(MICE[i]);
                Mouse winner = winner(MICE[i]);
                if(winner != null) {
                    System.out.println("The winner is " + winner + ".Mouse found a bush in the coordinates "
                            + winner.getCurrentX() + ":" + winner.getCurrentY()
                            + " and changed color to " + winner.getColor());
                    hasWinner = true;
                    break;
                }
            }
            if(hasWinner)
                break;
        }
    }

    private int move() {
        return move();
    }

    private int move(Mouse mouse) {
        int wind = 2;
        public int move(int XX, int YY) {
            if ((XX + 1 + wind) >= 99){
            } if ((YY + 1 + wind) >= 99);
            return (((XX + 1 + wind) - 1)& ((YY + 1 + wind) -1));
        }
        mouse.run(wind);
    }
}
