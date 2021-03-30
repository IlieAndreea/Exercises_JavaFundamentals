package javafundamentals.datatypesandvariables;

import org.junit.Test;

import static org.junit.Assert.*;

public class VariablesTest {

    @Test
    public void TestSumOfTwoVariables() {

        int result = JFpdf1Variables1.sumOfTwoVariables(16,3);
        assertEquals(19, result);                             //Meth.1
        assertEquals("The sum is 19", 19, result);    //Meth.2

        assert result == 19;                                          //Meth.3

        assertNotNull(result);
    }

}
