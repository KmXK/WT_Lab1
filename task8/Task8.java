package task8;

import task8.repositories.DoublesRepository;
import task8.services.ArrayMerger;

public class Task8 {
    public static void main(String[] args) {
        var repository = new DoublesRepository();
        var a = repository.getArray();
        var b = repository.getArray();

        var instructions = ArrayMerger.getMergeInstructions(a, b);

        for (var i = 0; i < instructions.length; i++) {
            System.out.printf("You should place b[%d] after a[%d].\n", i, instructions[i]);
        }

    }
}
