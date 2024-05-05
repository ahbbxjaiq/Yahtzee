import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        YahtzeeHand yahtzee = new YahtzeeHand();
        YahtzeeGuiScoreCard scoreCard = new YahtzeeGuiScoreCard();
        System.out.println(yahtzee.showDice());
        yahtzee.changeHand();
        System.out.println(yahtzee.showDice());
        yahtzee.changeHand();
        System.out.println(yahtzee.showDice());

        YahtzeeScore score = new YahtzeeScore(yahtzee.getDice());

        System.out.println("Score:");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%15s: %d%n", i + "s", score.getUpperScore(i));
        }

        System.out.printf("%15s: %d%n", "Three Of A Kind", (score.scoreFourOfAKind() > score.scoreThreeOfAKind()) ? score.scoreFourOfAKind() : score.scoreThreeOfAKind());
        System.out.printf("%15s: %d%n", "Four Of A Kind", score.scoreFourOfAKind());
        System.out.printf("%15s: %d%n", "Full House", score.scoreFullHouse());
        System.out.printf("%15s: %d%n", "Small Straight", score.scoreSmallStraight());
        System.out.printf("%15s: %d%n", "Large Straight", score.scoreLargeStraight());
        System.out.printf("%15s: %d%n", "Chance", score.scoreChance());
        System.out.printf("%15s: %d%n", "Yahtzee", score.scoreYahtzee());
        System.out.printf("%15s: %d%n", "Bonus Yahtzee", score.scoreBonusYahtzee());
    }
}
