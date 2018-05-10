package ocp.study.ch3_GenericsAndCollections;

import ocp.study.Album;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Collections {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Sam", null);

        favorites.merge("Tom", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);

        System.out.println(favorites);
    }

}
