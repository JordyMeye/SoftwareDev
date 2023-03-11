package.za.ac.cput.test;

import org.junit.Test;
import static org.junit.Assert.*;
import za.ac.cput.domain.Transaction;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TransactionTest {
    @Test
    public void testTransaction() {
        Transaction t = new Transaction("1234", "Cash", "100.0", 10.03.2023);
        assertEquals("1234", t.getTransactionId());
        assertEquals("Cash", t.getTransactionType());
        assertEquals("100.0", t.getTransactionAmount());
        assertEquals(10.03.2023, t.getTransactionDate());
    }
}
