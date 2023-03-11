package.za.ac.cput.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void testTransaction() {
        Transaction t = new Transaction("1234", "Cash", "100", 10.03.2023);
        assertEquals("1234", t.getTransactionId());
        assertEquals("Alice", t.getTransactionType());
        assertEquals("Bob", t.getTransactionAmount());
        assertEquals(100.0, t.getTransactionDate());
    }
}
