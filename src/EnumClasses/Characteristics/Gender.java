package EnumClasses.Characteristics;

import Being.Human;
import Being.Hunter;
import Being.Nohunter;

public enum Gender
{
    MALE("he"),
    FEMALE("she"),
    OTHER("it");
    private String pronounce;
    Gender(String pronounce)
    {
        this.pronounce = pronounce;
    }
    public static Gender SetGender()
    {
        double chance = Math.max(1, Math.random() * 10);
        switch((int) chance)
        {
            case 1, 2, 3 -> {return MALE;}
            case 4, 5, 6 -> {return FEMALE;}
            default -> {return OTHER;}
        }
    }
    public String Pronaunce()
    {
        return this.pronounce;
    }
}
