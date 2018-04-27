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
public class PrintCounter {
      static int counter = 0;
      public static void main(String[] bla) throws InterruptedException, ExecutionException {
            ExecutorService service = Executors.newSingleThreadExecutor();
            List<Future<?>> results = new ArrayList<>();
            IntStream.iterate(0, i -> i+1).limit(5).forEach(
                    i -> results.add(service.submit(() -> counter++))
            );
            for(Future<?> result : results) {
                  System.out.print(result.get()+" ");
            }
            service.shutdown();
      }
}
