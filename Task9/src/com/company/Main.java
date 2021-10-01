package com.company;

import com.company.task9.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addBall(new Ball(Color.PINK, 1.3));
        basket.addBall(new Ball(Color.BLUE, 0.6));
        basket.addBall(new Ball(Color.RED, 1.85));
        basket.addBall(new Ball(Color.BLUE, 2.1));

        System.out.println("Weight = " + basket.getBasketWeight() +
                ", number of blue balls = " + basket.getNumberOfBlueBalls());
    }
}
