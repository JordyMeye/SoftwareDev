package za.ac.cput.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Customer;

import java.time.Duration;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class CustomerTest {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;


    public void setUp() {
        customer1 = new Customer("John", "Doe", 29);
        customer2 = new Customer("John", "Doe", 29);
        customer3 = new Customer("Jane", "Tim", 26);


    }




    @Test
    public void testObjectEquality() {
        assertEquals(customer1, customer2);
        System.out.println("Customer1 & customer2 are equals");

        // assertNotEquals(customer3, customer1);

    }

    @Test
    public void testObjectIdentity() {
        assertNotSame(customer1, customer3);
        System.out.println("Customer1 & customer3 are not the same");

    }


    @Test
    public void FallingTest() {
        // Customer customer1 = new Customer("John", "Doe", 29);
        customer1.setAge(25);
        assertEquals(30, customer1.getAge());


    }

    @Timeout(60)
    @Test
    public void Timeouts() {
        customer1 = new Customer("John", "Doe", 29);
        assertTimeout(Duration.ofSeconds(1), () -> {
            customer1.toString();
        });
    }

    @Disabled("Disabled")
    @Test
    public void Disablingtest() {
        customer1 = new Customer("John", "Doe", 29);
        assertEquals(2, 1+1);
    }

}

