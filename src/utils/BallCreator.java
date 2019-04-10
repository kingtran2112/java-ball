package utils;

import entity.Ball;
import entity.Coordinates;
import frame.GUI;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallCreator {

    public List<Ball> create(int nBalls, Dimension screenSize, GUI frame) {
        List<Ball> balls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < nBalls; i++) {
            Coordinates coordinates = new Coordinates(rand.nextInt((int) (screenSize.getWidth()/2)), rand.nextInt((int) (screenSize.getHeight())));
            Ball newBall = new Ball(coordinates, frame);
            balls.add(newBall);
        }
        return balls;
    }
}
