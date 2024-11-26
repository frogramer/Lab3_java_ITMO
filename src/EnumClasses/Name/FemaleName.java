package EnumClasses.Name;

import Being.Human;
import Being.Hunter;
import Being.Nohunter;
import Being.Plant;

public enum FemaleName{
        ONION("Onion"),
        VASILISA("Vasilisa"),
        MABEL("Mabel"),
        POPA("Popa"),
        CHARA("Chara");
        private String name;
        FemaleName(String name) {
            this.name = name;
        }
        public static String SetName()
        {
                double chance = Math.max(1.0, Math.random() * 11);
                switch((int) chance)
                {
                    case 1, 2 -> {return ONION.name;}
                    case 3, 5 -> {return VASILISA.name;}
                    case 4, 6 -> {return MABEL.name;}
                    case 7, 8 -> {return POPA.name;}
                    default -> {return CHARA.name;}
                }
        }
}
