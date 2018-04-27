package ocp.study.part1.fromWhiz.testsBook.chapter15;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

import static java.util.stream.Collectors.toMap;

/**
 * @Author matus.korenek
 * @Date 20.1.2018
 */
public class StreamsExamples {
      public static void  main(String[] args) {
            Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
            BinaryOperator<String> merge = (a, b) -> a;
            Map<Integer, String> map = s.collect(toMap(String::length, k -> k, merge));
            System.out.println(map.size() + " " + map.get(4));

            Stream<Character> chars = Stream.of('o', 'b', 's', 't', 'a', 'c', 'l', 'e');
            ArrayList<Character> charArr = chars.map(c -> c).collect(Collectors.toCollection(ArrayList::new));
            System.out.println(charArr);
      }
}
