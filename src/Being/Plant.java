package Being;
import EnumClasses.Characteristics.Gender;
import EnumClasses.Characteristics.Job;
import EnumClasses.Name.OtherName;

public class Plant implements AliveBeing {
    private String name = AliveBeing.defaultname;
    private String job = AliveBeing.defaultjob;
    private Gender gender = AliveBeing.defaultgender;
    private int visibility = AliveBeing.defaultvisibility;
    private int speed = AliveBeing.defaultspeed;
    public Plant(int visibility, int joblevel)
    {
        this.name = OtherName.SetName();
        this.job = Job.SetJob(joblevel);
        this.visibility = visibility;
    }
    @Override
    public Boolean IsSeen() {
        double chance = (Math.random() * visibility) / 100;
        if (chance > 0.5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public Boolean Run() {
        double chance = Math.random() * speed;
        if (chance > 0.5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        return (this.job + " " + this.name);
    }
    @Override
    public String GetPronounce()
    {
        return this.gender.Pronaunce();
    }
}
