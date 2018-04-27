package ocp.studyGuide.Concurrency;

import java.util.concurrent.*;

/**
 * @Author matus.korenek
 * @Date 3.2.2018
 */
public class ConcurrentCollections {
      public static void main(String[] args) {
            try {
                  System.out.println("BlockingDeque");
                  BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

                  blockingDeque.offer(91);
                  blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
                  blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
                  blockingDeque.offer(3, 4, TimeUnit.SECONDS);

                  System.out.println(blockingDeque.poll());
//                  System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
                  System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
                  System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));

                  System.out.println(blockingDeque.peek());

                  System.out.println("\nBlockingQueue");
                  BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

                  blockingQueue.offer(39);
                  blockingQueue.offer(3, 4, TimeUnit.SECONDS);
                  System.out.println(blockingQueue.poll());
                  System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));

            } catch (InterruptedException e) {
                  e.getStackTrace();
            }
      }
}
