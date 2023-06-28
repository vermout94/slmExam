package at.technikum.slmExam.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    private long totalSum = 0;

    public long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input number should be a non-negative integer.");
        }

        long result = factorial(number);
        totalSum += result;
        return result;
    }

    public long getTotalFactorialSum() {
        return totalSum;
    }

    private long factorial(int number) {
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
