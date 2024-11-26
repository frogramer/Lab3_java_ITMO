package EnumClasses.Name;

import Being.Human;
import Being.Hunter;
import Being.Nohunter;
import Being.Plant;

public enum OtherName{
        CABBAGE("Onion"),
        SOMETHING("Something"),
        PUPA("Pupa"),
        LUPA("Lupa"),
        FLOWEY("Flowey");
        private String name;
        OtherName(String name) {
            this.name = name;
        }
        public static String SetName()
        {
                double chance = Math.max(1.0, Math.random() * 11);
                switch((int) chance)
                {
                    case 1, 2 -> {return CABBAGE.name;}
                    case 3, 5 -> {return SOMETHING.name;}
                    case 4, 6 -> {return PUPA.name;}
                    case 7, 8 -> {return LUPA.name;}
                    default -> {return FLOWEY.name;}
                }
        }
}
