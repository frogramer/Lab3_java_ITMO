package EnumClasses.Places;

public enum DownPlaces implements DefaultPlace {
    HEll("Hell", "Qliphoth fruit", "Perfect Amulet", "Dante and Vergil"),
    BIKINIBOTTOM("Bikini Bottom", "crabsburger recepte", "crabsburger", "Spongebob and Patrick"),
    ABYSS("Abyss", "mother", "money", "mutants"),
    SNOWDIN("Snowdin", "Human soul", "burnt snow",  "Sans and Papyrus"),
    BASEMENT("Basement", "treasure", "bottle of wine", "Guards"),;
    private String place;
    private String item1;
    private String item2;
    private String guards;
    DownPlaces (String place, String item1, String item2, String guards) {
        this.place = place;
        this.item1 = item1;
        this.item2 = item2;
        this.guards = guards;
    }
    public static DownPlaces SetDownPlace()
    {
        double chance = Math.max(1.0, Math.random() * 11);
        switch((int) chance)
        {
            case 1, 2 -> {return HEll;}
            case 3, 5 -> {return BIKINIBOTTOM;}
            case 4, 6 -> {return ABYSS;}
            case 7, 8 -> {return SNOWDIN;}
            default -> {return BASEMENT;}
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
