package EnumClasses.Characteristics;

public enum Job
{
    PRAKTIK("praktik", 3),
    STUDENT("student", 0),
    DUKE("duke", 1),
    BARON("baron", 2);
    private String job;
    private int level;
    Job(String job, int level)
    {
        this.job = job;
        this.level = level;
    }
    public static String SetJob(int level)
    {
        switch(level)
        {
            case 0 -> {return Job.STUDENT.job;}
            case 1 -> {return Job.DUKE.job;}
            case 2 -> {return Job.BARON.job;}
            default -> {return Job.PRAKTIK.job;}
        }
    }
    public String SetJobName()
    {
        return this.job;
    }
    public int SetJobLevel()
    {
        return this.level;
    }
}
