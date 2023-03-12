package za.ac.cput.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.domain.Calculator;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add_equality_PassTest() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void objectIdentity_PassTest() {
        Calculator calc1 = new Calculator();
        Calculator calc2 = calc1;
        assertSame("Expected same object", calc1, calc2);
    }

    @Test
    public void subtraction_PassTest() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Disabled("Do not execute multiply")
    @Test
    public void multiply_DisabledTest() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(0,0);
        assertEquals(0, result);
        fail("disabled");
    }
    @Test
    public void divide_ThrowsException_FailTest() throws IllegalArgumentException {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
    @Test
    public void incomplete_FailTest() throws IllegalArgumentException {
        fail("incomplete unit test");
    }

    @Test
    public  void Add_Timeout_FailTest() throws InterruptedException {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            addTimeout();
        });
    }
    public void addTimeout()  throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }






}