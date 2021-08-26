package org.Blz.SnakendLadder;

public class SnakeAndLadder
{
    public static final int TOTAL_NUMBERS=100;
    public static void main( String[] args )
    {
        System.out.println( "Welcome to The Snake and Ladder Game" );
        double Dice = (Math.floor(Math.random()*10)%6+1);
        System.out.println("Your Dice Roll Number is " + Dice);
    }
}
