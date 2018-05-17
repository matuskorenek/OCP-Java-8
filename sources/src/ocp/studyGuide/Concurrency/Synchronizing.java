package ocp.studyGuide.Concurrency;

import java.util.Arrays;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Synchronizing {

    public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
        deque.offer(103);
        deque.offerFirst(20, 1, TimeUnit.SECONDS);
        deque.offerLast(85, 7, TimeUnit.HOURS);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        /*Integer i1 = Arrays.asList(1, 2, 3, 4, 5).stream().findAny().get();
        synchronized (i1) {
            Integer i2 = Arrays.asList(6, 7, 8, 9, 10)
                .parallelStream()
                .sorted()
                .findFirst().get();
            System.out.println(i1 + " " + i2);
        }*/
     /*--------------------------------------------------------------------------------------------------------------------------*/

        System.out.println(Arrays.asList("duck", "chicken", "flamengo", "pelican")
        .parallelStream().parallel() //to je jedno ze zavolas parallel na parallelStream
        .reduce(0, (c1, c2) -> c1 + c2.length(),
            (s1, s2) -> s1 + s2));

        /*--------------------------------------------------------------------------------------------------------------------------*/



        /*--------------------------------------------------------------------------------------------------------------------------*/
    }
}
