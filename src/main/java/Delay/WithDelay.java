package Delay;

import java.util.List;

public class WithDelay {
    public static <T> void forEachWithDelay(List<T> list, int delay, CustomConsumer<T> consumer) {
        list.forEach(t -> {
            consumer.execute(t);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

    }
    public static void main(String[] args) {
        forEachWithDelay(List.of(1, 2, 7, 51, 125, 2, 5), 1000, System.out::println);
    }
}
