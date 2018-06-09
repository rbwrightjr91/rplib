package rplib.General;

public enum Abilities {
    STR ("Strength"),
    DEX ("Dexterity"),
    CON ("Constitution"),
    INT ("Intelligence"),
    WIS ("Wisdom"),
    CHA ("Charisma");

    private String abil;

    Abilities(String abil){
        this.abil= abil;
    }

    public String val(){ return this.abil; }

}
