package ocp.studyGuide.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * @Author matus.korenek
 * @Date 11.2.2018
 */
public class CountZooAnimals {
      public static Integer performCount(int exhibitNumber) {
            //Implementation omitted
            return exhibitNumber;
      }

      public static void printResults(Future<?> f) {
            try {
                  System.out.println(f.get());
            } catch (Exception e) {
                  System.out.println("Exception!");
            }
      }

      public static void main(String[] bla) throws InterruptedException, ExecutionException {
            ExecutorService service = Executors.newSingleThreadExecutor();
            final List<Future<?>> results = new ArrayList<>();
            IntStream.range(0, 10)
                    .forEach(i -> results.add(service.submit(() -> performCount(i))));
            results.stream().forEach(f -> printResults(f));
            service.shutdown();
      }
}
