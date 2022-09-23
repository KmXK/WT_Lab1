package task7.repositories;

import java.util.Arrays;

public class DoublesRepository {
    private static double[] ints = {3,2.5,5,6,7.1,1,2,3.3,4,5.5,6,3,3.6};

    public double[] getAll() {
        return Arrays.stream(ints).toArray();
    }
}
