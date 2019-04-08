package utils;

import entity.Ball;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BallExecutor {
    private List<Ball> balls;

    public BallExecutor(List<Ball> balls) {
        this.balls = balls;
    }

    public void execute() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit((Runnable) () -> {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balls.forEach(ball -> ball.changeDirection(2, 2));
            }
        });
    }

}
