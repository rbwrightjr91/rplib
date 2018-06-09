package rplib.Races;

import rplib.General.Size;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElfTest {

    Elf e;

    @Before
    public void setUp() {

        e = new Elf();

    }

    @Test
    public void racialTraits() {
        String[] traits = {"Darkvision", "Keen Senses",
                "Fey Ancestry", "Trance"};
        List<String> expected = new ArrayList<>(Arrays.asList(traits));

        assertEquals(e.racialTraits(), expected);
    }

    @Test
    public void abilityScore() {
        String expected = "Dexterity";

        assertEquals(e.abilityScore(), expected);

    }

    @Test
    public void knownLanguages() {
        String[] langs = {"Common", "Elvish"};
        List<String> expected = new ArrayList<>(Arrays.asList(langs));

        assertEquals(e.knownLanguages(), expected);
    }

    @Test
    public void minAge() {
        assertEquals(100, Elf.minAge());
    }

    @Test
    public void maxAge() {
        assertEquals(750, Elf.maxAge());
    }

    @Test
    public void size() {

        assertEquals(Size.MEDIUM.val(), Elf.size());

    }

    @Test
    public void baseSpeed() {

        assertEquals(30, Elf.baseSpeed());

    }

}