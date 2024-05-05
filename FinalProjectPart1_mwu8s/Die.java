/* Starter file for JHU CTY AP CS Course Final Project 
 * Initial code for Die with stub implementations
 */

public class Die
{
    /* Variables */
    private int value;

    /* Constructor */
    public Die() {
    	this.roll();
    }

    /* Roll a die and return its numerical value */
    public int roll() {
    	return value = (int)(Math.random() * 5) + 1;
    }
    
    /* Return numerical value of the die without re-rolling it */
    public int getValue() {
    	return value;
    }
}