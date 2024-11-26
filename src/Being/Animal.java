package Being;
import EnumClasses.Characteristics.Gender;
import EnumClasses.Characteristics.Job;
public abstract class Animal implements AliveBeing
{
    protected String name = AliveBeing.defaultname;
    protected String job = AliveBeing.defaultjob;
    protected Gender gender = AliveBeing.defaultgender;
    protected int visibility = AliveBeing.defaultvisibility;
    protected int speed = AliveBeing.defaultspeed;
    @Override
    public String toString()
    {
        return (job + " " + name);
    }
    @Override
    public String GetPronounce()
    {
        return this.gender.Pronaunce();
    }
}
