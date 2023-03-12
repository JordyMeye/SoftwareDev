
//Author Ayanda Phumzile Khoza

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    private Sales sweets = new Sales("PS" ,"4" , "50", "Yes");
    private Sales chocolate = sweets;

    @Test
    public void testObjectEquality()
    {
        assertEqual(sweets,chocolate);
    }

    private void assertEqual(Sales sweets, Sales chocolate)
    {
    }

    @Test
    public void testObjectIdentity()
    {
        assertSame(sweets, chocolate);

    }

    @Test
    public void failingTest()
        {

        assertNotEquals(sweets.getNumberOfItems(), chocolate.getNumberOfItems());
        }

       @Test
       @Timeout(5)
        public void timeoutTest()
        {

        }

        @Test
        @Disabled
        public void disabledTest ()
        {

        }



        }







