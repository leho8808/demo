package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld hello = new HelloWorld();
        String result = hello.sayHello();
        assertEquals("Hello, world!", result);
    }
}

