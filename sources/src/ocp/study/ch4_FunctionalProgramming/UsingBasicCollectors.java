package ocp.study.ch4_FunctionalProgramming;

public class UsingBasicCollectors {

    public static void main(String[] args) {
//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        String result = ohMy.collect(Collectors.joining(","));
//        System.out.println(result);

//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        double result = ohMy.collect(Collectors.averagingInt(String::length));
//        System.out.println(result);

//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        TreeSet<String> result = ohMy.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(result);

//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
//        System.out.println(map);

//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
////        Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + "," + s2));
//        TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + "," + s2, TreeMap::new));
//        System.out.println(map);
//        System.out.println(map.getClass());

//        Grouping
//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Boolean, Set<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
//        System.out.println(map);

//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        System.out.println(map);

        //Get the first letter of the first animal alphabetically of each length
//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Optional<Character>> map = ohMy.collect(
//                Collectors.groupingBy(
//                    s -> s.length(),
//                    Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
//        System.out.println(map);
    }
}
