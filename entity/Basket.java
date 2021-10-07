package by.epamtc.stanislavmelnikov.task02.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket {
    private List<Ball> ballsList;

    public Basket() {
        this.ballsList = new ArrayList<>();
    }

    public void fillBasket(List<Ball> balls) {
        ballsList.addAll(balls);
    }

    public void addBall(Ball ball) {
        ballsList.add(ball);
    }

    public double countTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : ballsList) {
            totalWeight = totalWeight + ball.getWeight();
        }
        return totalWeight;
    }

    public int countBallsAmountByColor(String color) {
        int amountBalls = 0;
        for (Ball ball : ballsList) {
            if (ball.getColor().equalsIgnoreCase(color)) {
                amountBalls++;
            }
        }
        return amountBalls;
    }

    public void removeBall(String color, double weight) {
        Iterator<Ball> iterator = ballsList.iterator();
        while (iterator.hasNext()) {
            Ball ball = iterator.next();
            if (ball.getColor().equals(color) && ball.getWeight() == weight) {
                iterator.remove();
            }
        }
    }

    public void removeBall(String color) {
        Iterator<Ball> iterator = ballsList.iterator();
        while (iterator.hasNext()) {
            Ball ball = iterator.next();
            if (ball.getColor().equals(color)) {
                iterator.remove();
            }
        }
    }

    public void removeBall(double weight) {
        Iterator<Ball> iterator = ballsList.iterator();
        while (iterator.hasNext()) {
            Ball ball = iterator.next();
            if (ball.getWeight() == weight) {
                iterator.remove();
            }
        }
    }

    public void clearBasket() {
        ballsList.clear();
    }
}
