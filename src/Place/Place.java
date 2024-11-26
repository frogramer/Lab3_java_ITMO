package Place;
import EnumClasses.Places.*;
public class Place implements ExamplePlace
{
    private int height = ExamplePlace.defaultheight;
    private String nameplace = ExamplePlace.defaultplace;
    private String guards = ExamplePlace.defaultguards;
    private String item1 = ExamplePlace.defaultitem1;
    private String item2 = ExamplePlace.defaultitem2;
    private String direction = ExamplePlace.defaultdirection;
    private String difficulty = ExamplePlace.defaultdifficulty;
    public Place()
    {
        this.height = Height();
        DefaultPlace place = SetPlace(this.height);
        this.nameplace = place.Nameplace();
        this.item1 = place.NameItem1();
        this.item2 = place.NameItem2();
        this.guards = place.NameGuards();
        this.direction = SetDirection(height);
        this.difficulty = Difficulty();
    }
    private int Height() {
        int height = Math.max(1, (int) (Math.random() * 4));
        return height;
    }
    private DefaultPlace SetPlace(int height)
    {
        switch(height)
        {
            case 1 -> {return DownPlaces.SetDownPlace();}
            case 2 -> {return UpPlaces.SetUpPlace();}
            default -> {return SamePlaces.SetSamePlace();}
        }
    }
    private String SetDirection(int height) {
        switch(height)
        {
            case 1 -> {return "down";}
            case 2 -> {return "up";}
            default -> {return "forward";}
        }
    }
    private String Difficulty() {
        int difficulty = (int) (Math.random() * 3);
        switch(difficulty)
        {
            case 1 -> {return "easy";}
            case 2 -> {return "medium";}
            default -> {return "hard";}
        }
    }

    @Override
    public String GetName() {
        return this.nameplace;
    }

    @Override
    public String GetItem1() {
        return this.item1;
    }

    @Override
    public String GetItem2() {
        return this.item2;
    }

    @Override
    public String GetGuard() {
        return this.guards;
    }
    @Override
    public String GetDirection() {
        return this.direction;
    }
    @Override
    public String GetDifficulty() {
        return this.difficulty;
    }
    @Override
    public int hashCode()
    {
        return this.GetName().hashCode() >> 4;
    }
    public boolean equals(String other)
    {
        if (this.hashCode() != other.hashCode() || this.nameplace != other)
        {
            return false;
        }
        return true;
    }
}
