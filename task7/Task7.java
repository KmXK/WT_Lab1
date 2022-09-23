package task7;

import task7.repositories.DoublesRepository;
import task7.services.GnomeSort;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        var repository = new DoublesRepository();
        var array = repository.getAll();

        System.out.println("Array before sorting: " + Arrays.toString(array));
        GnomeSort.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
