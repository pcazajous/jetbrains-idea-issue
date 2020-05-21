package java8.library;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class UtilsTest {
    @Test
    public void testReturnTrue() {
        Utils utils = new Utils();
        assertTrue(utils.returnTrue());
    }
}
