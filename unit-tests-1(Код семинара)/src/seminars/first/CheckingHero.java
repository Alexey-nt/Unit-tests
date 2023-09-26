package seminars.first;

import java.util.List;
import java.util.Arrays;

public class CheckingHero {
    public static void main(String[] args) {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
        checkingHero(emmett);
    }

    public static void checkingHero(Hero emmett) {

    }
}
