package task2.repositories;

import task2.models.Point;
import task2.models.Rect;

public class RectsRepository {
    public Rect[] getAll() {
        return new Rect[]{
            new Rect(new Point(-4, 4), new Point(4, 0)),
            new Rect(new Point(-6, 0), new Point(6, -3))
        };
    }
}
