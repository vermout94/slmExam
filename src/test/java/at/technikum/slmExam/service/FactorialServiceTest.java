package at.technikum.slmExam.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialServiceTest {

    private FactorialService factorialService = new FactorialService();

    @Test
    public void testCalculateFactorial() {
        long result = factorialService.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testGetTotalFactorialSum() {
        factorialService.calculateFactorial(5);
        factorialService.calculateFactorial(4);
        long totalSum = factorialService.getTotalFactorialSum();
        assertEquals(144, totalSum);
    }
}