package Being;

import EnumClasses.Characteristics.Gender;
import EnumClasses.Characteristics.Job;
import EnumClasses.Name.FemaleName;
import EnumClasses.Name.MaleName;
import EnumClasses.Name.OtherName;

public class Nohunter extends Animal
{
    public Nohunter(int visibility, int speed, int joblevel)
    {
            this.job = Job.SetJob(joblevel);
            this.gender = Gender.SetGender();
            this.visibility = visibility;
            this.speed = speed;
            if (gender == Gender.MALE)
            {
                this.name = MaleName.SetName();
            }
            if (gender == Gender.FEMALE)
            {
                this.name = FemaleName.SetName();
            }
            else
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
        if (chance > 0.5) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString()
    {
        return (job + " " + name);
    }
}
