import Being.*;
import Place.*;
import EnumClasses.Characteristics.*;
import EnumClasses.Places.DownPlaces;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int randomjob1 = randomjob();
        int randomjob2 = randomjob();

        int job1 = Math.min(randomjob1, randomjob2);
        int job2 = Math.max(randomjob1, randomjob2);

        AliveBeing FirstCharacter = SetCharacter(job1);
        AliveBeing SecondCharacter = SetCharacter(job2);
        Place place = new Place();
        String character1 = FirstCharacter.toString();
        String character2 = SecondCharacter.toString();
        String pronounce1 = FirstCharacter.GetPronounce();
        String pronounce2 = SecondCharacter.GetPronounce();
        String placename = place.GetName();
        String guards = place.GetGuard();
        String direction = place.GetDirection();
        String difficulty = place.GetDifficulty();
        String item1 = place.GetItem1();
        String item2 = place.GetItem2();

        System.out.println(place.hashCode());

        StoryStart(character1, character2, pronounce1,
                pronounce2, item1, item2, placename, guards,
                direction, difficulty);

        if (FirstCharacter.IsSeen() | SecondCharacter.IsSeen())
        {
            StoryContuinueIsSeen(character1, character2, pronounce1, guards);
            if(FirstCharacter.Run() & SecondCharacter.Run())
            {
                StoryEndingRan();
            }
            else
            {
                if (FirstCharacter.getClass() == Hunter.class | SecondCharacter.getClass() == Hunter.class) {
                    StoryEndingHunter(character1, character2,
                            item1, item2, placename, guards);
                }
                else
                {
                    if (character1 == character2)
                    {
                        StoryEndingTylerDurden(character1, character2, guards);
                    }
                    else
                    {
                        StoryEndingRat(character1, character2, pronounce2, guards);
                    }
                }
            }
        }
        else {
            if (place.equals("hill"))
            {
                StoryEndingHill(pronounce1, character1, guards);
            }
            else
            {
                StoryEndingNotSeen(character1, character2, pronounce1, item1, item2);
            }
        }
    }
    private static int randomjob() {
        int random = Math.max(1, (int) (Math.random() * 3));
        return random;
    }

    private static int characteristic() {
        int random = (int) (Math.random() * 100);
        return random;
    }

    private static AliveBeing SetCharacter(int job) {
        int randombeing = Math.max(1, (int) (Math.random() * 3));
        switch (randombeing) {
            case 0 -> {
                Human no = new Human(2, 2, 1);
                return new Human(characteristic(), characteristic(), job);
            }
            case 1 -> {
                return new Nohunter(characteristic(), characteristic(), job);
            }
            case 2 -> {
                return new Hunter(characteristic(), characteristic(), job);
            }
            default -> {
                return new Plant(characteristic(), job);
            }
        }
    }
    private static void StoryStart(String character1, String character2, String pronounce1,
                            String pronounce2, String item1, String item2, String placename,
                            String guards, String direction, String difficulty)
    {
        System.out.printf("Why didn't %s wanted to go to the %s alone? If %s really wanted to find %s there, " +
                        "this would be much easier to do alone, isn't it? But what if %s got caught? " +
                        "Then %s could blame %s. Actually, %s had already prepared an answer for %s: " +
                        "I had to accompany %s against my will, because %s wanted %s. " +
                        "Going %s to the %s turned out to be %s task for both of them. \n",
                character1, placename, pronounce1, item1, pronounce1, pronounce1,
                character2, character1, guards, character2, pronounce2,
                item2, direction, placename, difficulty);
        String pathdesription = switch (difficulty)
        {
            case "easy" -> "It was fast. At first, they didn't even realize, that way came to ";
            case "medium" -> "When they just started to struggle, they came right to ";
            default -> "They were panting hard and sweating profusely... It seemed they were going for an " +
                    "eternity... but, finally, they came to ";
        };
        System.out.println(pathdesription + placename + ".\n");
        System.out.printf("Then they saw %s standing nearby. They immediately hided and %s told %s to get " +
                "%s without being noticed. Well, %s had no choice. ", guards, character2, character1, item2, character1);
    }
    private static void StoryEndingNotSeen(String character1, String character2, String pronounce1, String item1,
                                    String item2)
    {
        System.out.printf("But anyway, %s managed to secretly get the %s and %s and get away" +
                " with it. Both %s and %s lived happily ever after.", character1, item1, item2, pronounce1, character2);
    }
    private static void StoryEndingHill(String pronounce1, String character1, String guards)
    {
        System.out.printf("But %s had a different idea... %s promised to come back long ago... %s forgot him... but still, he came back... \n " +
                "First there was fire, then there was smoke  \n " +
                "Then that preacher man was hangin' by a rope \n " +
                "Then they all fell to their knees and begged that drifter \n " +
                "Begged him please, as he raised his fist before he spoke:  \n" +
                "\"I am the righteous hand of God   \n" +
                "And I am the devil that you forgot  \n" +
                "And I told you one day you will see  \n" +
                "That I'll be back I guarantee  \n" +
                "And that hell's coming, hell's coming \n" +
                "Hell, hell's coming with me... \n" +
                "*cool banjo solo*", pronounce1, character1, guards);
    }
    private static void StoryContuinueIsSeen(String character1, String character2, String pronounce1, String guards)
    {
        System.out.printf("So, %s tried to get all %s needed secretly, but %s saw the violator. " +
                        "Both %s and %s tried to run, ", character1, pronounce1,
                guards, character1, character2 );
    }
    private static void StoryEndingRan()
    {
        System.out.println("which was successful. Even though they didn't get things they wanted, " +
                "they were happy, that both of them were alive. They even got married and submitted an " +
                "application for P.S.ZH. and lived happily ever after (until ITMO dropped new banger: " +
                "list for otchislenie)");
    }
    private static void StoryEndingHunter(String character1, String character2, String item1, String item2,
                                   String placename, String guards)
    {
        System.out.printf("which wasn't successful: %s caught them and then %s panicked and suddenly..." +
                        "ate them. " +
                        "And %s. And %s. And %s. And the fabric of the universe itself. " +
                        "Everything... there was no %s, no light, no sound, not a single person, " +
                        "no will, no cry... only void... public static final void...",
                guards, character1, character2, item1, item2, placename);
    }
    private static void StoryEndingTylerDurden(String character1, String character2, String guards)
    {
        System.out.printf("\"why are you here alone?\" - asked on of the %s. \"But I'm not alone\" - " +
                        "%s thought. \"I'm here with the %s\". \"No, you are not\" - %s said.\n" +
                        "-Why do they they think I'm alone?" +
                        "-You don't know?\n-No, I don't.\n-Yes, you do. Why would anyone possibly confuse" +
                        " you with me?\n" +
                        "-Because...\n-Say it -Because we are the same person...\n-That's right\n" +
                        "-Oh my god, it's Tyler Durden - %s shouted\n" +
                        "Then, together they exploded all the banks and started new era... " +
                        "But don't you dare tell anyone about that \n c====3",
                guards, character1, character2, character2, guards);
    }
    private static void StoryEndingRat(String character1, String character2, String pronounce2, String guards)
    {
        System.out.printf("which wasn't successful. Then, %s told them what he planned to say them. It really shocked %s, " +
                        "but it didn't matter anyway... %s was accused of being LOH and then sent to " +
                        "Gorniy University by %s... %s was suffering, while %s was peacefully kicking balda...",
                character1, character2, pronounce2, guards, pronounce2, character1);
    }
}

