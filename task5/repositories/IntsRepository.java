package task5.repositories;

import java.util.Arrays;

public class IntsRepository {
    private static int[] ints = {1,2,3,4,5,6,7,77,7,5,4,4,3,4,4,56,-13};

    public int[] getAll() {
        return Arrays.stream(ints).toArray();
    }
}
