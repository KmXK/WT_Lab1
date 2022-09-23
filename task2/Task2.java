package task2;

import task2.models.Point;
import task2.models.Rect;
import task2.repositories.PointsRepository;
import task2.repositories.RectsRepository;
import task2.services.PointCheckerService;

public class Task2 {
    public static void main(String[] args) {
        RectsRepository rectsRepository = new RectsRepository();
        PointsRepository pointsRepository = new PointsRepository();
        Rect[] rects = rectsRepository.getAll();
        Point point = pointsRepository.getNext();

        if(point == null || rects == null) {
            System.out.println("Error occurs when reading from repository.");
            return;
        }

        PointCheckerService checker = new PointCheckerService();

        System.out.println(checker.isPointInRects(point, rects)
                ? "Point inside the area or on the bound."
                : "Point outside the are.");
    }
}
