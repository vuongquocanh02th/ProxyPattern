public class MathCalculator implements Calculator {
    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double subtract(double first, double second) {
        return first - second;
    }

    @Override
    public double divide(double first, double second) {
        return first / second;
    }

    @Override
    public double multiply(double first, double second) {
        return first * second;
    }
}
