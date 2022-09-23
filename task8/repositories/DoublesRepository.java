package task8.repositories;

import java.util.Arrays;

public class DoublesRepository {
    private static final double[][] ints = {
            {-1,0,0.5,1.5,2,3,4},
            {1,4,6,7},
    };

    private int index = 0;

    public double[] getArray() {
        return Arrays.stream(ints[index++ % 2]).toArray();
    }
}
