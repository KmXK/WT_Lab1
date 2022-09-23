package task6.repositories;

import java.util.Arrays;

public class IntsRepository {
    private static int[] ints = {1,2,3,4,5,6,7};

    public int[] getAll() {
        return Arrays.stream(ints).toArray();
    }
}
