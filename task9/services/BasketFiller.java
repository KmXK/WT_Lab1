package task9.services;

import task9.models.Ball;
import task9.models.Basket;
import task9.models.Color;

import java.util.Random;

public class BasketFiller {
    private final Random random;

    public BasketFiller() {
        random = new Random();
    }

    public void generateRandomBalls(Basket basket, int count){
        for (var i = 0; i < count; i++){
            Ball ball = generateBall();
            basket.addBall(ball);
        }
    }

    public Ball generateBall() {
        return new Ball(random.nextDouble() * 10, Color.values()[random.nextInt(Color.values().length)]);
    }
}
