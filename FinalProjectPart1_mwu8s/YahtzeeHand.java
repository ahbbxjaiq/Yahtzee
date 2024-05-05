/* Starter file for JHU CTY AP CS Course Final Project 
 * Initial code for YahtzeeHand with stub implementations
 */

import java.util.Arrays;
import java.util.Scanner;

public class YahtzeeHand
{
    /* Variables */
    private Die[] dice;
    private Scanner sc;

    /* Constructor */
    public YahtzeeHand() {
        this.dice = new Die[] {new Die(), new Die(), new Die(), new Die(), new Die()};
        this.sc = new Scanner(System.in);
    }

    /*
     * Returns array of integers with current values of the dice
     */
    public int[] getDice() {
    	return new int[] {dice[0].getValue(), dice[1].getValue(), dice[2].getValue(), dice[3].getValue(), dice[4].getValue()};
    }
    
    /* Roll all dice */
    public void rollAll() {
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }

    /* Rolls specific dice */
    public void roll(int number) {
        dice[number].roll();
    }
    
    /* Allow user to change dice by rolling two
     * more times, user can choose which dice to keep
     */
    public void changeHand() {
        System.out.print("Choose Keepers (1 | 2 | 3 | 4 | 5): ");
        String[] input = sc.nextLine().split(" ");
        Integer[] keepers = new Integer[input.length];

        for (int i=0;i<input.length;i++) {
            keepers[i] = Integer.parseInt(input[i]);
        }

        for (int i=0;i<5;i++) {
            if (!Arrays.asList(keepers).contains(i+1)) {
                dice[i].roll();
            }
        }
    }
    
    /* Returns value of specified dice */
    public int get(int number) {
        return dice[number].getValue();
    }

    /* Return string representing current state of the dice in 
     * the following format:
     * +------+---+---+---+---+---+
     * | Dice | 1 | 2 | 3 | 4 | 5 |
     * +------+---+---+---+---+---+
     * | Face | 4 | 2 | 4 | 6 | 1 |
     * +------+---+---+---+---+---+
     * 
     */
    public String showDice() {
    	return "+------+---+---+---+---+---+\n| Dice | 1 | 2 | 3 | 4 | 5 |\n+------+---+---+---+---+---+\n| Face | " + dice[0].getValue() + " | " + dice[1].getValue() + " | " + dice[2].getValue() + " | " + dice[3].getValue() + " | " + dice[4].getValue() + " |\n+------+---+---+---+---+---+";
    }
}
