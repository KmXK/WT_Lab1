package task2.services;

import task2.models.Point;
import task2.models.Rect;

public class PointCheckerService {
    public boolean isPointInRect(Point point, Rect rect) throws NullPointerException {
        if (point == null) throw new NullPointerException("Point cannot be null.");
        if (rect == null) throw new NullPointerException("Rect cannot be null.");

        return point.x >= rect.topLeft.x &&
                point.x <= rect.bottomRight.x &&
                point.y >= rect.bottomRight.y &&
                point.y >= rect.topLeft.y;
    }

    public boolean isPointInRects(Point point, Rect[] rects) throws NullPointerException {
        if (point == null) throw new NullPointerException("Point cannot be null.");
        if (rects == null) throw new NullPointerException("Rects array cannot be null.");

        for (Rect rect : rects) {
            if(isPointInRect(point, rect)) return true;
        }

        return false;
    }
}
