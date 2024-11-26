package Place;

import EnumClasses.Places.DefaultPlace;

public interface ExamplePlace
{
    public static final String defaultguards = "nobodies";
    public static final String defaultdifficulty = "easy";
    public static final int defaultheight = 0;
    public static final String defaultplace = "nowhere";
    public static final String defaultdirection = "forward";
    public static final String defaultitem1 = "nothing";
    public static final String defaultitem2 = "nothing";
    public String GetName();
    public String GetItem1();
    public String GetItem2();
    public String GetGuard();
    public String GetDirection();
    public String GetDifficulty();

}
