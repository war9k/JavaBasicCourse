package Lesson17;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    private int multiplier;
    private int number;

    public Task(int multiplier, int number) {
        this.multiplier = multiplier;
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number * multiplier;
    }
}
