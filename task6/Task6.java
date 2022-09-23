package task6;

import task3.services.TableDrawer;
import task6.repositories.IntsRepository;
import task6.services.MatrixCreator;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        var repository = new IntsRepository();

        var ints = repository.getAll();
        var matrix = MatrixCreator.create(ints);

        var tableDrawer = new TableDrawer(ints.length);
        for (var matrixRow : matrix) {
            tableDrawer.addRow(Arrays.stream(matrixRow).boxed().toArray());
        }

        System.out.println(tableDrawer);
    }
}
