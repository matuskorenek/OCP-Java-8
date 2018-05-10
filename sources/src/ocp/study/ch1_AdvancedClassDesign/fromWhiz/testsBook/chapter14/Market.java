package ocp.study.ch1_AdvancedClassDesign.fromWhiz.testsBook.chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author matus.korenek
 * @Date 16.1.2018
 */
public class Market {
      private static void checkPrices(List<Double> prices, Consumer<Double> scanner) {
            prices.forEach(scanner);
      }
      public static void main(String[] right) {
            List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
            checkPrices(prices,
                    p -> {
                        String result = p<5 ? "Correct" : "Too high";
                        System.out.println(result);
                    });
      }
}
