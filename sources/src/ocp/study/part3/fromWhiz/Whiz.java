package ocp.study.part3.fromWhiz;

import java.util.stream.Stream;

/**
 * @Author matus.korenek
 * @Date 17.11.2017
 */
public class Whiz {
      public static void main(String[] args) {
            Stream<Integer> stream = Stream.of(4,10,8,3);
            System.out.println(stream.peek(System.out::print).anyMatch(x -> x>=10));
      }
}
