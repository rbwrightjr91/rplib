package rplib.Races;

import java.util.Collection;
import java.util.Map;

public interface Race {

    Collection<String> racialTraits();

    Collection<String> weaponProfs();

    Collection<String> knownLanguages();

    String abilityScore();

    int age();

}
