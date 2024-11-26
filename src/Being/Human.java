package Being;

import EnumClasses.Characteristics.Gender;
import EnumClasses.Characteristics.Job;
import EnumClasses.Name.*;

public class Human implements AliveBeing{
    private String name = AliveBeing.defaultname;
    private String job = AliveBeing.defaultjob;
    private Gender gender = AliveBeing.defaultgender;
    private int visibility = AliveBeing.defaultvisibility;
    private int speed = AliveBeing.defaultspeed;
    public Human(int visibility, int speed, int joblevel)
    {
        this.job = Job.SetJob(joblevel);
        this.gender = Gender.SetGender();
        this.visibility = visibility;
        this.speed = speed;
        if (gender == gender.MALE)
        {
            this.name = MaleName.SetName();
        }
        if (gender == Gender.FEMALE)
        {
            this.name = FemaleName.SetName();
        }
        if (gender == Gender.OTHER)
        {
            this.name = OtherName.SetName();
        }
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
        double chance = (Math.random() * speed) / 100;
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
        return (job + " " + name);
    }
    @Override
    public String GetPronounce()
    {
        return this.gender.Pronaunce();
    }
}
