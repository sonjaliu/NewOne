import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testGetMsg() throws Exception {
        Assert.assertEquals("Hello World", new Hello().GetMsg());
    }
}