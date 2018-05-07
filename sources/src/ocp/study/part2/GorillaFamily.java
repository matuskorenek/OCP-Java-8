package ocp.study.part2;

import java.util.ArrayList;
import java.util.function.Supplier;

interface Gorilla { String move(); }
public class GorillaFamily {
    String walk = "walk";
    void everyonePlay(boolean baby) {
        String approach = "amble";
//        approach ="run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }
    void play(Gorilla g) {
        System.out.println(g.move());
    }

    public static void main(String[] args) {
//        GorillaFamily gorillaFamily = new GorillaFamily();
//        gorillaFamily.everyonePlay(true);
//        Supplier<StringBuilder> s1 = StringBuilder::new;
//        Supplier<StringBuilder> s2 = () -> new StringBuilder();
        Supplier<ArrayList<String>> s1 = ArrayList::new;

        System.out.println(s1.get());
//        System.out.println(s2.get());
    }
}
