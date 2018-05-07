package ocp.study.part4;

import java.util.ArrayList;
import java.util.List;

class Unicorn {}
class Dragon {}

public class LegacyUnicorns {
    public static void main(String[] args) {
        List<Unicorn> unicorns = new ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0);
    }
    private static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon());
    }

}
