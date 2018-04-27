package ocp.study.part1.fromWhiz.testsBook.chapter14;

import java.util.function.Consumer;

/**
 * @Author matus.korenek
 * @Date 16.1.2018
 */
class Sheep {
      private String name = "Dolly";

      @Override
      public String toString() {
            return this.name;
      }
}
public class Dream {
      int MAX_SHEEP = 10;
      int sheepCount;
      public void countSheep(Consumer<Sheep> backToSleep) {
            while(sheepCount<MAX_SHEEP) {
                  backToSleep.accept(new Sheep());
                  sheepCount++;
            }
      }

      public static void main(String[] dark) {
            new Dream().countSheep(System.out::println);
      }
}
