package rplib.Races;

import rplib.General.Abilities;
import rplib.General.Size;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DwarfTest {

    Dwarf d;

    @Before
    public void setUp() {

        d = new Dwarf();

    }

    @Test
    public void racialTraits() {
        String[] traits = {"Darkvision", "Poison Resist",
                            "Stonecunning", "Dwarven Weapon Training"};
        List<String> expected = new ArrayList<>(Arrays.asList(traits));

        assertEquals(d.racialTraits(), expected);
    }

    @Test
    public void abilityScore() {
        String[] abilities = {Abilities.STR.val(), Abilities.CON.val()};
        List<String> expected = new ArrayList<String>(Arrays.asList(abilities));

        assertEquals(d.abilityScore(), expected);

    }

    @Test
    public void knownLanguages() {
        String[] langs = {"Common", "Dwarvish"};
        List<String> expected = new ArrayList<>(Arrays.asList(langs));

        assertEquals(d.knownLanguages(), expected);
    }

    @Test
    public void minAge() {
        assertEquals(50, Dwarf.minAge());
    }

    @Test
    public void maxAge() {
        assertEquals(350, Dwarf.maxAge());
    }

    @Test
    public void size() {

        assertEquals(Size.MEDIUM.val(), Dwarf.size());

    }

    @Test
    public void baseSpeed() {

        assertEquals(25, Dwarf.baseSpeed());

    }

}