package task4;

import task4.repositories.IntsRepository;
import task4.services.PrimeChecker;

public class Task4 {
    public static void main(String[] args) {
        var repository = new IntsRepository();
        var primeChecker = new PrimeChecker();

        var ints = repository.getAll();

        for (var i = 0; i < ints.length; i++) {
            if(primeChecker.isPrime(ints[i])) {
                System.out.printf("Number %d with index %d is prime.\n", ints[i], i);
            }
        }
    }
}
