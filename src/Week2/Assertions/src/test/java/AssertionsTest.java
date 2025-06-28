import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Check if 2 + 3 equals 5
        assertEquals(5, 2 + 3);

        // Check if 5 is greater than 3 (true)
        assertTrue(5 > 3);

        // Check if 5 is NOT less than 3 (false)
        assertFalse(5 < 3);

        // Check if an object is null
        Object obj1 = null;
        assertNull(obj1);

        // Check if an object is NOT null
        Object obj2 = new Object();
        assertNotNull(obj2);
    }
}
