package task1.repositories;

public class DoublesRepository {
    private static final double[] doubles = {3.5, 2.0};

    private int index = 0;

    public double getNext() {
        return doubles[index++ % doubles.length];
    }
}
