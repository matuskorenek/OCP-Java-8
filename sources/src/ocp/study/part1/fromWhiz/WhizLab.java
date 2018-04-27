package ocp.study.part1.fromWhiz;


import java.util.Arrays;

/**
 * @Author matus.korenek
 * @Date 25.2.2018
 */
public class WhizLab {
      public static void main(String[] args) {

      Value[] values = { Value.LOW, Value.HIGH, Value.MEDIUM };

      Arrays.sort(values);
      System.out.println(values[1]);
      }
}

enum Value {
      HIGH(1), MEDIUM(6), LOW(3);

      private final int level;

      Value(int level) {
            this.level = level;
      }
}
