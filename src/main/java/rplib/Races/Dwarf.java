package rplib.Races;

import rplib.General.Abilities;
import rplib.General.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Dwarf class
 * implements Race interface
 *
 */
public class Dwarf implements Race {

    /**
     * Specifies Dwarf racial traits
     *
     */
    private enum Traits {
        DARKVISION      ("Darkvision"),
        POISON_RESIST   ("Poison Resist"),
        STONECUNNING    ("Stonecunning"),
        DWARVEN_WEAPS   ("Dwarven Weapon Training");

        private String trait;

        Traits(String trait){
            this.trait = trait;
        }

        public String val(){ return this.trait; }
    }

    /**
     * Specifies languages known to a dwarf
     *
     */
    private enum KnownLanguages {
        COMMON      ("Common"),
        DWARVISH    ("Dwarvish");

        private String language;

        KnownLanguages(String language){
            this.language = language;
        }

        public String val() { return this.language; }
    }

    /**
     * Specifies the boosted ability score of the Dwarf race
     *
     */
    private static final List<String> ABILITY_SCORE_BOOST = new ArrayList<String>(Arrays.asList(Abilities.STR.val(), Abilities.CON.val()));

    /**
     * Specifies size of the Dwarf race
     *
     */
    private static final String SIZE = Size.MEDIUM.val();

    /**
     * Specifies base speed of the Dwarf race
     *
     */
    private static final int BASE_SPEED = 25;

    /**
     * Specifies minimum age of adult Dwarf
     *
     */
    private static final int MIN_AGE = 50;

    /**
     * Specifies maximum age of adult Dwarf
     *
     */
    private static final int MAX_AGE = 350;

    /**
     * Dwarf race constructor
     *
     */
    public Dwarf() { }

    /**
     * Method for obtaining Dwarf racial traits
     *
     * @return Collection<String>
     */
    @Override
    public Collection<String> racialTraits() {

        ArrayList<String> traits = new ArrayList<String>();

        for (Traits t : Traits.values()) {
            traits.add(t.val());
        }

        return traits;

    }

    /**
     * Method for obtaining languages known to Dwarf
     *
     * @return Collection<String>
     */
    @Override
    public Collection<String> knownLanguages() {

        ArrayList<String> langs = new ArrayList<String>();

        for (KnownLanguages kl : KnownLanguages.values()) {
            langs.add(kl.val());
        }

        return langs;

    }

    /**
     * Method for obtaining the ability score a Dwarf gains a racial increase to
     *
     * @return String
     */
    @Override
    public Collection<String> abilityScore() {

        return ABILITY_SCORE_BOOST;

    }

    /**
     * Method for obtaining Dwarf size
     *
     * @return String
     */
    public static String size() {
        return SIZE;
    }

    /**
     * Method for obtaining Dwarf base speed, in feet
     *
     * @return int
     */
    public static int baseSpeed() {
        return BASE_SPEED;
    }

    /**
     * Method for obtaining Dwarf minimum age
     *
     * @return int the minimum age of Dwarf
     */
    public static int minAge() {
        return MIN_AGE;
    }

    /**
     * Method for obtaining Dwarf maximum age
     *
     * @return int the maximum age of Dwarf
     */
    public static int maxAge() {
        return MAX_AGE;
    }

}
