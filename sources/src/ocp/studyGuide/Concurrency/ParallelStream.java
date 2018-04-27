package ocp.studyGuide.Concurrency;

import java.util.Arrays;

/**
 * @Author matus.korenek
 * @Date 11.2.2018
 */
public class ParallelStream {
      public static void main(String[] bla) {
            System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican")
                  .parallelStream().parallel()
                  .reduce("", (c1, c2) -> c1 + c2));
      }
}
