package Being;
import EnumClasses.Characteristics.Gender;
import EnumClasses.Characteristics.Job;

public interface AliveBeing
{
    public static String defaultname = "Nobody";
    public static final String defaultjob = Job.STUDENT.SetJobName();
    public static final Gender defaultgender = Gender.OTHER;
    public static final int defaultvisibility = 0;
    public static final int defaultspeed = 1;
    Boolean Run();
    Boolean IsSeen();
    String toString();
    String GetPronounce();
}
