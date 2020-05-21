package java14.app;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test
    public void testGetResult() {
        App app = new App();
        assertEquals(app.getResult(0), "ZERO");
    }
}
