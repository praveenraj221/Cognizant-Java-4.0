package FinancialForecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return calculateFutureValue(amount * (1 + rate), rate, years - 1);
    }

    // Optimized version using iteration (to compare)
    public static double calculateFutureValueIterative(double amount, double rate, int years) {
        for (int i = 0; i < years; i++) {
            amount *= (1 + rate);
        }
        return amount;
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0; // ₹10,000
        double annualRate = 0.10; // 10% annual growth
        int years = 5;

        double resultRecursive = calculateFutureValue(initialAmount, annualRate, years);
        double resultIterative = calculateFutureValueIterative(initialAmount, annualRate, years);

        System.out.printf("Recursive Forecast: ₹%.2f%n", resultRecursive);
        System.out.printf("Iterative Forecast: ₹%.2f%n", resultIterative);
    }
}