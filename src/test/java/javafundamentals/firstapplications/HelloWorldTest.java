package javafundamentals.firstapplications;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testWorld() {
        //given
//        HelloWorld helloWorld = new HelloWorld(); //static method => obj.not needed
        //when
        String result = HelloWorld.world();
        //then
        assert result == "7. Hello, World!";

        assertEquals("7. Hello, World!",result);
        assertNotNull(result);

    }
}
