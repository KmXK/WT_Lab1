package task3.repositories;

public class DoublesRepository {
    private static double[] doubles = {3.5, 12, 0.3};

    private int index = 0;

    public double getNext() {
        return doubles[index++ % doubles.length];
    }
}
