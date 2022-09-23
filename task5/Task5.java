package task5;

import task5.repositories.IntsRepository;
import task5.services.SequenceAnalyzer;

public class Task5 {
    public static void main(String[] args) {
        var intsRepository = new IntsRepository();

        var array = intsRepository.getAll();

        var sequenceFinder = new SequenceAnalyzer();
        var countElements = sequenceFinder.countElementsToDelete(array);

        System.out.printf("Count elements to delete to make sequence increasing: %d\n", countElements);
    }
}
