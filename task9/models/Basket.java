package task9.models;

import java.util.ArrayList;

public class Basket {

    private final ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public void removeBall(Ball ball){
        balls.remove(ball);
    }

    public double getBallsWeight(){
        return balls.stream().mapToDouble(Ball::getWeight).sum();
    }

    public int countByColor(Color color){
        return (int)balls.stream().filter(b -> b.getColor().equals(color)).count();
    }

    @Override
    public String toString(){
        var sb = new StringBuilder();
        var i = 0;
        for (Ball ball : balls) {
            sb.append(String.format("%d - %s", ++i, ball));
            if(i < balls.size()) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
