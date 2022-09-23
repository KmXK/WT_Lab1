package task1;

import task1.repositories.DoublesRepository;
import task1.services.CalculatorService;

public final class Task1 {
    public static void main(String[] args) {
        DoublesRepository repository = new DoublesRepository();

        double x = repository.getNext();
        double y = repository.getNext();

        CalculatorService service = new CalculatorService();

        double value = service.calculate(x, y);

        System.out.printf("Answer is %.5f.\n", value);
    }
}
