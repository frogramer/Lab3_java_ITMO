package EnumClasses.Name;

import Being.*;

public enum MaleName{
    ORANGE("Orange"),
    IVAN("Ivan"),
    BILL("Bill Cipher"),
    SANS("Sans"),
    PRAVDIN("Pravdin");
    private String name;
    MaleName(String name) {
        this.name = name;
    }
    public static String SetName()
    {
        double chance = Math.max(1.0, Math.random() * 11);
        switch((int) chance)
        {
            case 1, 2 -> {return ORANGE.name;}
            case 3, 5 -> {return IVAN.name;}
            case 4, 6 -> {return BILL.name;}
            case 7, 8 -> {return SANS.name;}
            default -> {return PRAVDIN.name;}
        }
    }
}