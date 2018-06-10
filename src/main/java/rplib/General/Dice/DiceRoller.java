package rplib.General.Dice;

import java.util.Random;

/**
 * Class for rolling dice
 */
public class DiceRoller {

    enum Sides {
        TWO     (2),
        FOUR    (4),
        SIX     (6),
        EIGHT   (8),
        TEN     (10),
        TWELVE  (12),
        TWENTY  (20),
        HUNDRED (100);

        private final int sides;

        Sides(int sides){
            this.sides = sides;
        }

        public int numSides() {
            return this.sides;
        }
    }

    private Random rnd;

    public DiceRoller() {
        this.rnd = new Random((long) (Math.random() * Math.pow(10, 6)));
    }

    /**
     * Roll a two-sided die
     *
     * @return      the result of rolling a two-sided die
     */
    public int d2() {

        return this.oneDie(Sides.TWO.numSides());

    }

    /**
     *
     * Roll n two-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n two-sided dice
     */
    public int d2(int n) {

        return this.multipleDice(n, Sides.TWO.numSides());

    }

    /**
     *
     * Roll a four-sided die
     *
     * @return      the result of rolling a four-sided die
     */
    public int d4() {

        return this.oneDie(Sides.FOUR.numSides());

    }

    /**
     *
     * Roll n four-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n four-sided dice
     */
    public int d4(int n) {

        return this.multipleDice(n, Sides.FOUR.numSides());

    }

    /**
     *
     * Roll a six-sided die
     *
     * @return      the result of rolling a six-sided die
     */
    public int d6() {

        return this.oneDie(Sides.SIX.numSides());

    }

    /**
     *
     * Roll n six-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n six-sided dice
     */
    public int d6(int n) {

        return this.multipleDice(n, Sides.SIX.numSides());

    }

    /**
     *
     * Roll an eight-sided die
     *
     * @return      the result of rolling a eight-sided die
     */
    public int d8() {

        return this.oneDie(Sides.EIGHT.numSides());

    }

    /**
     *
     * Roll n eight-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n eight-sided dice
     */
    public int d8(int n) {

        return this.multipleDice(n, Sides.EIGHT.numSides());

    }

    /**
     *
     * Roll a ten-sided die
     *
     * @return      the result of rolling a ten-sided die
     */
    public int d10() {

        return this.oneDie(Sides.TEN.numSides());

    }

    /**
     *
     * Roll n ten-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n ten-sided dice
     */
    public int d10(int n) {

        return this.multipleDice(n, Sides.TEN.numSides());

    }

    /**
     *
     * Roll a twelve-sided die
     *
     * @return      the result of rolling a twelve-sided die
     */
    public int d12() {

        return this.oneDie(Sides.TWELVE.numSides());

    }

    /**
     *
     * Roll n twelve-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n twelve-sided dice
     */
    public int d12(int n) {

        return this.multipleDice(n, Sides.TWELVE.numSides());

    }

    /**
     *
     * Roll a twenty-sided die
     *
     * @return      the result of rolling a twenty-sided die
     */
    public int d20() {

        return this.oneDie(Sides.TWENTY.numSides());

    }

    /**
     *
     * Roll n twenty-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n twenty-sided dice
     */
    public int d20(int n) {

        return this.multipleDice(n, Sides.TWENTY.numSides());

    }

    /**
     *
     * Roll a hundred-sided die
     *
     * @return      the result of rolling a hundred-sided die
     */
    public int d100() {

        return this.oneDie(Sides.HUNDRED.numSides());

    }

    /**
     *
     * Roll n hundred-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n hundred-sided dice
     */
    public int d100(int n) {

        return this.multipleDice(n, Sides.HUNDRED.numSides());

    }

    /**
     * Roll an s-sided die
     *
     * @param s     the number of sides on the die
     * @return      the result of rolling an s-sided die
     */
    public int customDie(int s) {

        return this.oneDie(s);
    }

    /**
     * roll n s-sided dice
     *
     * @param n     the number of s-sided dice to roll
     * @param s     the number of sides on the dice
     * @return      the result of rolling n s-sided dice
     */
    public int customDie(int n, int s) {
        return this.multipleDice(s, n);
    }

    /**
     * Helper function to generate numbers Dice 1 and max inclusive
     *
     * @param s     the number of sides
     * @return      the result of the roll
     */
    private int oneDie(int s) {
        return this.multipleDice(1, s);
    }

    /**
     *
     * Helper function to generate numbers Dice min and max inclusive
     *
     * @param n         the number of dice
     * @param s         the number of sides
     * @return          the total result of the rolls
     */
    private int multipleDice(int n, int s) {

        int total = 0;

        for(int i = 0; i < n; i++){
            total += this.rnd.nextInt(s) + 1;
        }

        return total;
    }

}

