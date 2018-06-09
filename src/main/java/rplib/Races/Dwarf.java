package rplib.Races;

import rplib.General.Abilities;
import rplib.General.Size;
import rplib.General.Dice.DiceRoller;

import java.util.ArrayList;
import java.util.Collection;

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
        STONECUNNING    ("Stonecunning");

        private String trait;

        Traits(String trait){
            this.trait = trait;
        }

        public String val(){ return this.trait; }
    }

    /**
     * Specifies Dwarf weapon proficiencies
     *
     */
    private enum WeaponProfs {
        BATTLEAXE ("Battleaxe"),
        WARHAMMER ("Warhammer");

        private String weap;

        WeaponProfs(String weap){
            this.weap = weap;
        }

        public String val(){ return this.weap; }

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
     * Specifies size of a dwarf
     *
     */
    private static final String SIZE = Size.MEDIUM.val();

    /**
     * Specifies base speed of a dwarf
     *
     */
    private static final int BASE_SPEED = 25;

    private int age;

    /**
     * Dwarf constructor that takes age parameter
     *
     * @param age int
     */
    public Dwarf(int age) {
        this.age = age;
    }

    /**
     * Dwarf null constructor that sets age randomly between 50 and 350
     *
     */
    public Dwarf() {

        DiceRoller dr = new DiceRoller();

        this.age = dr.customDie(7, 50); //Age is between 50 and 350

    }

    /**
     * Method for obtaining Dwarf racial traits
     *
     * @return Collection<String>
     */
    public Collection<String> racialTraits() {

        ArrayList<String> traits = new ArrayList<String>();

        traits.add(Traits.DARKVISION.val());
        traits.add(Traits.POISON_RESIST.val());
        traits.add(Traits.STONECUNNING.val());

        return traits;

    }

    /**
     * Method for obtaining Dwarf weapon proficiencies
     *
     * @return Collection<String>
     */
    public Collection<String> weaponProfs() {

        ArrayList<String> weaps = new ArrayList<String>();

        weaps.add(WeaponProfs.BATTLEAXE.val());
        weaps.add(WeaponProfs.WARHAMMER.val());

        return weaps;
    }

    /**
     * Method for obtaining languages known to Dwarf
     *
     * @return Collection<String>
     */
    public Collection<String> knownLanguages() {

        ArrayList<String> langs = new ArrayList<String>();

        langs.add(KnownLanguages.COMMON.val());
        langs.add(KnownLanguages.DWARVISH.val());

        return langs;

    }

    /**
     * Method for obtaining the ability score a Dwarf gains a racial increase to
     *
     * @return String
     */
    public String abilityScore() {

        return Abilities.CON.val();

    }

    /**
     * Method for obtaining age of a Dwarf, in years
     *
     * @return int
     */
    public int age() {
        return age;
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
}
