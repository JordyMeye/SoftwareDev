package za.ac.cput.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

        assertNotEquals(customer3, customer1);

    }
}