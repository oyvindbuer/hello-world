import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHello() {

        HelloWorld string = new HelloWorld();

        assertEquals("Hello, World!", string.getS());

    }
}
