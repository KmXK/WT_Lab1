package task4.services;

public class PrimeChecker {
    public boolean isPrime(int value) {
        if(value <= 1) {
            return false;
        }

        var upperBound = Math.sqrt(value) + 1;
        for (var i = 2; i < upperBound; i++) {
            if(value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
