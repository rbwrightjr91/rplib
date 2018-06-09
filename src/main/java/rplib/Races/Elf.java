package rplib.Races;

import rplib.General.Abilities;
import rplib.General.Size;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Elf class
 * implements Race interface
 *
 */
public class Elf implements Race {

    /**
     * Specifies Elf racial traits
     *
     */
    private enum Traits {
        DARKVISION      ("Darkvision"),
        KEEN_SENSES     ("Keen Senses"),
        FEY_ANCESTRY    ("Fey Ancestry"),
        TRANCE          ("Trance");

        private String trait;

        Traits(String trait){
            this.trait = trait;
        }

        public String val(){ return this.trait; }
    }

    /**
     * Specifies languages known to a Elf
     *
     */
    private enum KnownLanguages {
        COMMON      ("Common"),
        ELVISH    ("Elvish");

        private String language;

        KnownLanguages(String language){
            this.language = language;
        }

        public String val() { return this.language; }
    }

    /**
     * Specifies the boosted ability score of the Elf race
     *
     */
    private static final String ABILITY_SCORE_BOOST = Abilities.DEX.val();

    /**
     * Specifies size of the Elf race
     *
     */
    private static final String SIZE = Size.MEDIUM.val();

    /**
     * Specifies base speed of the Elf race
     *
     */
    private static final int BASE_SPEED = 30;

    /**
     * Specifies minimum age of adult Elf
     */
    private static final int MIN_AGE = 100;

    /**
     * Specifies maximum age of adult Elf
     *
     */
    private static final int MAX_AGE = 750;

    /**
     * Elf race constructor
     *
     */
    public Elf() { }

    /**
     * Method for obtaining Elf racial traits
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
     * Method for obtaining languages known to Elf
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
     * Method for obtaining the ability score a Elf gains a racial increase to
     *
     * @return String
     */
    @Override
    public String abilityScore() {

        return ABILITY_SCORE_BOOST;

    }

    /**
     * Method for obtaining Elf size
     *
     * @return String
     */
    public static String size() {
        return SIZE;
    }

    /**
     * Method for obtaining Elf base speed, in feet
     *
     * @return int
     */
    public static int baseSpeed() {
        return BASE_SPEED;
    }

    /**
     * Method for obtaining Elf minimum age
     *
     * @return int the minimum age of Elf
     */
    public static int minAge() {
        return MIN_AGE;
    }

    /**
     * Method for obtaining Elf maximum age
     *
     * @return int the maximum age of Elf
     */
    public static int maxAge() {
        return MAX_AGE;
    }

}