package org.Blz.SnakendLadder;

public class SnakeAndLadder {
    public static final int TOTAL_NUMBERS = 100;
    public static int InitialPosition = 0;
    public static int CurrentPosition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to The Snake and Ladder Game");

        int DiceNum = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Your Dice Roll Number is " + DiceNum);

        int NoPlay = 1;
        int Ladder = 2;
        int Snake = 3;
        int Options = (int) (Math.floor(Math.random() * 10) % 3 + 1);
        if (Options == NoPlay) {
            CurrentPosition += 0;
            System.out.println("You got No Play and Your current position is " + CurrentPosition);
        } else if (Options == Ladder) {
            CurrentPosition += DiceNum;
            System.out.println("You got Ladder and Your current position is " + CurrentPosition);
        } else if (Options == Snake) {
            CurrentPosition -= DiceNum;
            System.out.println("You were caught by snake and Your current position is " + CurrentPosition);
        }
    }

}

