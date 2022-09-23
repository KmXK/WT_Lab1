package task2.repositories;

import task2.models.Point;

public class PointsRepository {
    public Point getNext() {
        return new Point(1, 2);
    }
}
