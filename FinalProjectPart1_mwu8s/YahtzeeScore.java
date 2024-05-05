/* Starter file for JHU CTY AP CS Course Final Project 
 * Initial code for YahtzeeScore with stub implementations
 */

import java.util.Arrays;

public class YahtzeeScore
{
    /* Variables */
    private int[] dice;
    private boolean bonusYahtzee = false;

	/* Constructor, parameter dice contains values of dice to be scored 
	 * */
	public YahtzeeScore(int[] dice) {
        this.dice = dice;
	}
	
	/* For a given hand calculate the lower score; if value is 1 score ones, etc. */
    public int getUpperScore(int value) {
        int res = 0;
        for (int i=0;i<5;i++) {
            if (dice[i] == value) {
                res += value;
            }
        }

        return res;
    }
    public int scoreThreeOfAKind() {
        System.out.println(scoreRepeat(3));
        return scoreRepeat(3);
    }

    public int scoreFourOfAKind(){
        return scoreRepeat(4);
    }

    public int scoreFullHouse() {
    	return (scoreRepeat(3) != 0 && scoreRepeat(2) != 0) ? 25 : 0;
    }

    public int scoreSmallStraight() {
        boolean straight = true;
        int[] sortedDice = dice.clone();
        Arrays.sort(sortedDice);
        
        for (int i=0;i<4;i++) {
            System.out.println(straight + ": " + dice[i]);
            if (!(sortedDice[i] + 1 == sortedDice[i+1] || sortedDice[i] == sortedDice[i+1])) {
                straight = false;
            }
        }

        return (straight) ? 30 : 0;
    }

    public int scoreLargeStraight() {
    	int[] sortedDice = dice.clone();
        Arrays.sort(sortedDice);
        if (sortedDice[0] == 1 && sortedDice[1] == 2 && sortedDice[2] == 3 && sortedDice[3] == 4 && sortedDice[4] == 5)
            return 40;
        return 0;
    }


    public int scoreChance() {
        int res = 0;
        for (int i: dice) {
            res += i;
        }
    	return res;
    }


    public int scoreYahtzee() {
        if (scoreRepeat(5) > 0) {
            bonusYahtzee = true;
            return 50;
        }
        return 0;
    }

    public int scoreBonusYahtzee() {
    	return (bonusYahtzee) ? 100 : 0;
    }

    public int scoreRepeat(int number) {
        int res = 0;
        int sum = 0;
        int[] count = new int[6];

        for (int i=0;i<5;i++) {
            count[dice[i]]++;
            sum+=dice[i]; 
        }

        // System.out.println(Arrays.toString(count));

        for (int i=1;i<=5;i++) {
            if (count[i] == number) {
                res = sum;
                break;
            }
        }

        return res;
    }
}
