package rplib.General.Dice;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DiceRollerTest {

    static final int NUM_ROLLS = 100;
    static final int NUM_DICE = 10;
    static final int NUM_SIDES = 37;

    DiceRoller roller;

    List<Integer> rolls;

    @Before
    public void init() {

        roller = new DiceRoller();
        rolls = new ArrayList();

    }

    @Test
    public void d2() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d2());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 2);
        }

    }

    @Test
    public void d21() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d2(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (2 * NUM_DICE));
        }

    }

    @Test
    public void d4() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d4());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 4);
        }


    }

    @Test
    public void d41() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d4(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (4 * NUM_DICE));
        }

    }

    @Test
    public void d6() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d6());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 6);
        }

    }

    @Test
    public void d61() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d6(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (6 * NUM_DICE));
        }

    }

    @Test
    public void d8() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d8());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 8);
        }

    }

    @Test
    public void d81() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d8(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (8 * NUM_DICE));
        }

    }

    @Test
    public void d10() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d10());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 10);
        }

    }

    @Test
    public void d101() {
        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d10(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (10 * NUM_DICE));
        }

    }

    @Test
    public void d12() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d12());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 12);
        }

    }

    @Test
    public void d121() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d12(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (12 * NUM_DICE));
        }

    }

    @Test
    public void d20() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d20());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 20);
        }

    }

    @Test
    public void d201() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d20(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (20 * NUM_DICE));
        }

    }

    @Test
    public void d100() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d100());
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= 100);
        }

    }

    @Test
    public void d1001() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.d100(NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (100 * NUM_DICE));
        }

    }

    @Test
    public void customDie() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.customDie(NUM_SIDES));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= 1 && roll <= NUM_SIDES);
        }

    }

    @Test
    public void customDie1() {

        for(int i = 0; i < NUM_ROLLS; i++){
            rolls.add(roller.customDie(NUM_SIDES, NUM_DICE));
        }

        for(Integer r : rolls) {
            int roll = r.intValue();
            assertTrue(roll >= NUM_DICE && roll <= (NUM_SIDES * NUM_DICE));
        }

    }
}
