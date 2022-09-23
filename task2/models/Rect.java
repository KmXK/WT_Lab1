package task2.models;

public class Rect {
    public final Point topLeft;
    public final Point bottomRight;

    public Rect(Point topLeft, Point bottomRight) throws NullPointerException {
        if (topLeft == null) throw new NullPointerException("Top left point cannot be null");
        if (bottomRight == null) throw new NullPointerException("Bottom right point cannot be null");

        this.topLeft = new Point(Math.min(topLeft.x, bottomRight.x), Math.max(topLeft.y, bottomRight.y));
        this.bottomRight = new Point(Math.max(topLeft.x, bottomRight.x), Math.min(topLeft.y, bottomRight.y));
    }
}
