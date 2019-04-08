package utils;

import entity.Ball;
import entity.Coordinates;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallCreator {

    public List<Ball> create(int nBalls, Dimension screenSize) {
        List<Ball> balls = new ArrayList<>();
        Random rand = new Random();
        int nBall = 2;
        for (int i = 0; i < nBall; i++) {
            Coordinates coordinates = new Coordinates(rand.nextInt((int) (screenSize.getWidth()/2)), rand.nextInt((int) (screenSize.getHeight()/2)));
            Ball newBall = new Ball(coordinates);
            balls.add(newBall);
        }
        return balls;
    }
}
