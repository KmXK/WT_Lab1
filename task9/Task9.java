package task9;

import task9.models.Basket;
import task9.models.Color;
import task9.services.BasketFiller;

public class Task9 {
    public static void main(String[] args){
        Basket basket = new Basket();
        var basketFiller = new BasketFiller();
        basketFiller.generateRandomBalls(basket, 10);

        System.out.printf("Balls in basket: \n%s\n", basket);

        System.out.printf("Summary weight: %f \n", basket.getBallsWeight());
        System.out.printf("Count of blue balls: %d \n", basket.countByColor(Color.BLUE));
    }
}
