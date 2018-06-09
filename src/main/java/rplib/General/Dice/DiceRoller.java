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
        this.rnd = new Random((long) Math.random());
    }

    /**
     * Roll a two-sided die
     *
     * @return      the result of rolling a two-sided die
     */
    public int d2() {

        return this.between(Sides.TWO.numSides());

    }

    /**
     *
     * Roll n two-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n two-sided dice
     */
    public int d2(int n) {

        return this.between(n, n * Sides.TWO.numSides());

    }

    /**
     *
     * Roll a four-sided die
     *
     * @return      the result of rolling a four-sided die
     */
    public int d4() {

        return this.between(Sides.FOUR.numSides());

    }

    /**
     *
     * Roll n four-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n four-sided dice
     */
    public int d4(int n) {

        return this.between(n, n * Sides.FOUR.numSides());

    }

    /**
     *
     * Roll a six-sided die
     *
     * @return      the result of rolling a six-sided die
     */
    public int d6() {

        return this.between(Sides.SIX.numSides());

    }

    /**
     *
     * Roll n six-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n six-sided dice
     */
    public int d6(int n) {

        return this.between(n, n * Sides.SIX.numSides());

    }

    /**
     *
     * Roll an eight-sided die
     *
     * @return      the result of rolling a eight-sided die
     */
    public int d8() {

        return this.between(Sides.EIGHT.numSides());

    }

    /**
     *
     * Roll n eight-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n eight-sided dice
     */
    public int d8(int n) {

        return this.between(n, n * Sides.EIGHT.numSides());

    }

    /**
     *
     * Roll a ten-sided die
     *
     * @return      the result of rolling a ten-sided die
     */
    public int d10() {

        return this.between(Sides.TEN.numSides());

    }

    /**
     *
     * Roll n ten-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n ten-sided dice
     */
    public int d10(int n) {

        return this.between(n, n * Sides.TEN.numSides());

    }

    /**
     *
     * Roll a twelve-sided die
     *
     * @return      the result of rolling a twelve-sided die
     */
    public int d12() {

        return this.between(Sides.TWELVE.numSides());

    }

    /**
     *
     * Roll n twelve-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n twelve-sided dice
     */
    public int d12(int n) {

        return this.between(n, n * Sides.TWELVE.numSides());

    }

    /**
     *
     * Roll a twenty-sided die
     *
     * @return      the result of rolling a twenty-sided die
     */
    public int d20() {

        return this.between(Sides.TWENTY.numSides());

    }

    /**
     *
     * Roll n twenty-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n twenty-sided dice
     */
    public int d20(int n) {

        return this.between(n, n * Sides.TWENTY.numSides());

    }

    /**
     *
     * Roll a hundred-sided die
     *
     * @return      the result of rolling a hundred-sided die
     */
    public int d100() {

        return this.between(Sides.HUNDRED.numSides());

    }

    /**
     *
     * Roll n hundred-sided dice
     *
     * @param n     the number of dice to roll
     * @return      the result of rolling n hundred-sided dice
     */
    public int d100(int n) {

        return this.between(n, n * Sides.HUNDRED.numSides());

    }

    /**
     * Roll an s-sided die
     *
     * @param s     the number of sides on the die
     * @return      the result of rolling an s-sided die
     */
    public int customDie(int s) {

        return this.between(s);

    }

    /**
     * roll n s-sided dice
     *
     * @param s     the number of sides on the dice
     * @param n     the number of s-sided dice to roll
     * @return      the result of rolling n s-sided dice
     */
    public int customDie(int s, int n) {
        return this.between(n, n * s);
    }

    /**
     * Helper function to generate numbers between 1 and max inclusive
     *
     * @param max   the maximum desired value
     * @return      an integer value between 1 and max
     */
    private int between(int max) {
        return this.between(1, max);
    }

    /**
     *
     * Helper function to generate numbers between min and max inclusive
     *
     * @param min       the minimum desired value
     * @param max       the maximum desired value
     * @return          an integer value between min and max
     */
    private int between(int min, int max) {
        return this.rnd.nextInt(max - min + 1) + min;
    }

}

