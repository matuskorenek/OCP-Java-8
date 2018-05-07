package ocp.study.assessmentTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Anything {

    private static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 5).limit(3).max((x,y) -> x-y);
//        System.out.println(o.ifPresent(() -> o.get()));  //Original from test
        o.ifPresent(System.out::println);

        if (o.isPresent())
            System.out.println(o.get());
        else
            System.out.println("Ooops");
    }
    public static void main(String[] args) {
//        magic(Stream.empty());

//        System.out.println( Duration.ofDays(1).toString());
//        System.out.println( Period.ofDays(1).toString());
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;
        s.filter(l -> l != null).map(u).peek(System.out::println).forEach(System.out::println);
    }
}
