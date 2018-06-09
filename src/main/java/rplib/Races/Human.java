package rplib.Races;

import rplib.General.Abilities;
import rplib.General.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Human class
 * implements Race interface
 *
 */
public class Human implements Race {

    /**
     * Specifies Human racial traits
     *
     */
    private enum Traits {
        NONE          ("No racial traits");

        private String trait;

        Traits(String trait){
            this.trait = trait;
        }

        public String val(){ return this.trait; }
    }

    /**
     * Specifies languages known to a Human
     *
     */
    private enum KnownLanguages {
        COMMON      ("Common");

        private String language;

        KnownLanguages(String language){
            this.language = language;
        }

        public String val() { return this.language; }
    }

    /**
     * Specifies the boosted ability score of the Human race
     *
     */
    private static final List<String> ABILITY_SCORE_BOOST =  new ArrayList<String>(Arrays.asList(Abilities.DEX.val(), Abilities.WIS.val()));

    /**
     * Specifies size of the Human race
     *
     */
    private static final String SIZE = Size.MEDIUM.val();

    /**
     * Specifies base speed of the Human race
     *
     */
    private static final int BASE_SPEED = 30;

    /**
     * Specifies minimum age of adult Human
     */
    private static final int MIN_AGE = 18;

    /**
     * Specifies maximum age of adult Human
     *
     */
    private static final int MAX_AGE = 60;

    /**
     * Human race constructor
     *
     */
    public Human() { }

    /**
     * Method for obtaining Human racial traits
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
     * Method for obtaining languages known to Human
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
     * Method for obtaining the ability score a Human gains a racial increase to
     *
     * @return String
     */
    @Override
    public Collection<String> abilityScore() {

        return ABILITY_SCORE_BOOST;

    }

    /**
     * Method for obtaining Human size
     *
     * @return String
     */
    public static String size() {
        return SIZE;
    }

    /**
     * Method for obtaining Human base speed, in feet
     *
     * @return int
     */
    public static int baseSpeed() {
        return BASE_SPEED;
    }

    /**
     * Method for obtaining Human minimum age
     *
     * @return int the minimum age of Human
     */
    public static int minAge() {
        return MIN_AGE;
    }

    /**
     * Method for obtaining Human maximum age
     *
     * @return int the maximum age of Human
     */
    public static int maxAge() {
        return MAX_AGE;
    }

}