package ocp.studyGuide.Concurrency;

import java.util.concurrent.*;

/**
 * @Author matus.korenek
 * @Date 10.2.2018
 */
public class WakeStaff {
      public static void main(String[] args) throws InterruptedException, ExecutionException {
            ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
            service.scheduleWithFixedDelay(() -> { System.out.println("Open Zoo"); }, 0, 1, TimeUnit.MINUTES);
            Future<?> result = service.submit(() -> System.out.println("Wake Staff"));
            System.out.println(result.get());
      }
}
