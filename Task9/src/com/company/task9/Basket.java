package com.company.task9;

import java.awt.*;
import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball>  basket;

    public ArrayList<Ball> getBasket() {
        return basket;
    }

    public Basket() {
        basket = new ArrayList<Ball>();
    }

    public void addBall(Ball ball) {
        basket.add(ball);
    }

    public double getBasketWeight() {
        double totalWeight = 0;

        for(Ball ball : basket) {
            totalWeight += ball.getWeight();
        }

        return totalWeight;
    }

    public int getNumberOfBlueBalls() {
        int blueBallsCounter = 0;

        for(Ball ball : basket) {
            if (ball.getColor().equals(Color.BLUE)) {
                blueBallsCounter++;
            }
        }

        return blueBallsCounter;
    }
}
