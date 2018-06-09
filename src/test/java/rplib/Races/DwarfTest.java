package rplib.Races;

import rplib.General.Dice.DiceRoller;

import org.junit.Before;
import org.junit.Test;
import rplib.General.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DwarfTest {

    static final int NUM_D = 10;
    static final int NUM_SIDES = 7;
    static final int NUM_DICE = 50;

    List<Dwarf> dwarves = new ArrayList<Dwarf>();
    DiceRoller dr;

    @Before
    public void setUp() throws Exception {

        dr = new DiceRoller();

        for(int i = 0; i < (int) Math.ceil(NUM_D/2); i++){
            dwarves.add(new Dwarf(dr.customDie(NUM_SIDES, NUM_DICE)));
        }

        for(int i = (int) Math.ceil(NUM_D/2); i < NUM_D; i++){
            dwarves.add(new Dwarf());
        }

        assertEquals(dwarves.size(), NUM_D);

    }

    @Test
    public void racialTraits() {
        String[] traits = {"Darkvision", "Poison Resist", "Stonecunning"};
        List<String> expected = new ArrayList<>(Arrays.asList(traits));

        for (Dwarf d:
             dwarves) {
            assertEquals(d.racialTraits(), expected);
        }
    }

    @Test
    public void abilityScore() {
        String expected = "Constitution";

        for (Dwarf d:
             dwarves) {
            assertEquals(expected, d.abilityScore());
        }
    }

    @Test
    public void weaponProfs() {
        String[] profs = {"Battleaxe", "Warhammer"};
        List<String> expected = new ArrayList<>(Arrays.asList(profs));

        for (Dwarf d:
                dwarves) {
            assertEquals(d.weaponProfs(), expected);
        }
    }

    @Test
    public void age() {
        for (Dwarf d:
             dwarves) {
            assertTrue(d.age() >= 50 && d.age() <= 350);
        }
    }

    @Test
    public void size() {
        for (Dwarf d:
                dwarves) {
            assertEquals(Size.MEDIUM.val(), Dwarf.size());
        }
    }

    @Test
    public void baseSpeed() {
        for (Dwarf d:
                dwarves) {
            assertEquals(25, Dwarf.baseSpeed());
        }
    }

    @Test
    public void knownLanguages() {
        String[] langs = {"Common", "Dwarvish"};
        List<String> expected = new ArrayList<>(Arrays.asList(langs));

        for (Dwarf d:
                dwarves) {
            assertEquals(d.knownLanguages(), expected);
        }
    }
}