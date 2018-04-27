package ocp.study.part1.fromWhiz.testsBook.chapter14;

import java.util.function.*;

/**
 * @Author matus.korenek
 * @Date 16.1.2018
 */
public class Asteroid {
      public void mine(BiFunction<Integer, Integer, Double> lambda) {
            // TODO: Apply functional interface
            System.out.println(lambda.apply(2,7));
      }
      public static void dawn(Function<String, String> sunrise) {
            System.out.println(sunrise.apply("What "));
      }
      public static Integer rest(BiFunction<Integer, Double, Integer> takeABreak) {
            return takeABreak.apply(3, 10.2);
      }
      public class FindMovie {
            private Function<String, String> printer;
            protected FindMovie() {
                  printer = s -> {return s;};
            }
      }
      public static void main(String[] debris) {


            //            System.out.println(rest((n, e) -> n + e.intValue()));
            /*BiFunction<Integer, Integer, Double> biFunction = (s,p) -> (double) s + p;
            new Asteroid().mine(biFunction);*/

//            Supplier<String> supplier = System.out::print;
//            Consumer<Object> c = System.out::println;
//            DoubleUnaryOperator duo = s -> s+1;
//            System.out.println(duo.applyAsDouble(2.0));
//            dawn(s -> s+1);
      }
}
