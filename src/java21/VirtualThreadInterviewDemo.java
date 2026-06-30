package java21;

import java.util.concurrent.Executors;

public class VirtualThreadInterviewDemo {
        public static void main(String[] args) {

            long start = System.currentTimeMillis();

            try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

                for (int i = 1; i <= 100; i++) {

                    int id = i;

                    executor.submit(() -> {
                        System.out.println(
                                "Task " + id +
                                        " : " + Thread.currentThread());

                        Thread.sleep(2000);

                        return null;
                    });
                }
            }

            long end = System.currentTimeMillis();

            System.out.println("Submitted in " + (end - start) + " ms");
        }

}
