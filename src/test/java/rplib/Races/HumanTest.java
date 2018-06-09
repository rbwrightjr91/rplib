package rplib.Races;

import org.junit.Before;
import org.junit.Test;
import rplib.General.Abilities;
import rplib.General.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human e;

    @Before
    public void setUp() {

        e = new Human();

    }

    @Test
    public void racialTraits() {
        String[] traits = {"No racial traits"};
        List<String> expected = new ArrayList<>(Arrays.asList(traits));

        assertEquals(e.racialTraits(), expected);
    }

    @Test
    public void abilityScore() {
        String[] abilities = {Abilities.DEX.val(), Abilities.WIS.val()};
        List<String> expected = new ArrayList<String>(Arrays.asList(abilities));

        assertEquals(e.abilityScore(), expected);

    }

    @Test
    public void knownLanguages() {
        String[] langs = {"Common"};
        List<String> expected = new ArrayList<>(Arrays.asList(langs));

        assertEquals(e.knownLanguages(), expected);
    }

    @Test
    public void minAge() {
        assertEquals(18, Human.minAge());
    }

    @Test
    public void maxAge() {
        assertEquals(60, Human.maxAge());
    }

    @Test
    public void size() {

        assertEquals(Size.MEDIUM.val(), Human.size());

    }

    @Test
    public void baseSpeed() {

        assertEquals(30, Human.baseSpeed());

    }

}