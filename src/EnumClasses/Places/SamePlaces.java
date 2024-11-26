package EnumClasses.Places;

public enum SamePlaces implements DefaultPlace
{
    LOMO("st.Lomonosova, house №9", "zachet po matanalizu", "knowledge", "Milushin and Kasik"),
    HYRULE("Hyrule", "Magical sword", "nintendo switch", "Ganon"),
    REDGRAVECITY("Red Grave City", "Yamato", "red orbs", "V and Nero"),
    NOVIGRAD("Novigrad", "Ciri", "unic Gwint card", "Wild Hunt"),
    NEWWORLD("New World", "Zorah Magdaros", "Chef's plate", "Nergigante"),;
    private String place;
    private String item1;
    private String item2;
    private String guards;
    SamePlaces (String place, String item1, String item2, String guards) {
        this.place = place;
        this.item1 = item1;
        this.item2 = item2;
        this.guards = guards;
    }
    public static SamePlaces SetSamePlace()
    {
        double chance = Math.max(1.0, Math.random() * 11);
        switch((int) chance)
        {
            case 1, 2 -> {return LOMO;}
            case 3, 5 -> {return HYRULE;}
            case 4, 6 -> {return REDGRAVECITY;}
            case 7, 8 -> {return NOVIGRAD;}
            default -> {return NEWWORLD;}
        }
    }
    @Override
    public String Nameplace()
    {
        return this.place;
    }
    @Override
    public String NameItem1()
    {
        return this.item1;
    }
    @Override
    public String NameItem2()
    {
        return this.item2;
    }
    @Override
    public String NameGuards()
    {
        return this.guards;
    }
}
