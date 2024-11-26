package EnumClasses.Places;

public enum UpPlaces implements DefaultPlace
{
    HEAVEN("Heaven", "God", "peace and quiet" , "Angels"),
    CELESTE("mt.Celeste", "bravery", "red berries", "Illusions"),
    HILL("hill", "black magic preacher", "poor souls's money", "hill residents"),
    EBOTT("mt.Ebott", "determination", "butterscotch-cinnamon pie", "cruel people"),
    EREBOR("mt.Erebor", "Arkenston", "countless treasures", "Gnomes");
    private String place;
    private String item1;
    private String item2;
    private String guards;
    UpPlaces (String place, String item1, String item2, String guards) {
        this.place = place;
        this.item1 = item1;
        this.item2 = item2;
        this.guards = guards;
    }
    public static UpPlaces SetUpPlace()
    {
        double chance = Math.max(1.0, Math.random() * 11);
        switch((int) chance)
        {
            case 1, 2 -> {return HEAVEN;}
            case 3, 5 -> {return CELESTE;}
            case 4, 6 -> {return HILL;}
            case 7, 8 -> {return EBOTT;}
            default -> {return EREBOR;}
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
