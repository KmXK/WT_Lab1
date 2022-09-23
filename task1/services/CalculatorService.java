package task1.services;

public class CalculatorService {
    public double calculate(double x, double y) {
        var numerator = 1 + Math.pow(Math.sin(x + y), 2);
        var denominator = 2 + Math.abs(x - (2 * x / (1 + Math.pow(x * y, 2))));
        return numerator / denominator + x;
    }
}
