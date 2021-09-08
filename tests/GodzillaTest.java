import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GodzillaTest {

    /***
     *  This is the test case for Godzilla's destruction area.
     * */
    @Test
    void godzillaAreaOfDestructionTst() {
        // An instance of the Godzilla
        Godzilla stubGodzilla = new Godzilla(10,10,10, 12);
        //Result from the main class
        double result = stubGodzilla.areaOfDestruction();
        //expected result
        double expected = Math.ceil((10+12)/2);
        //assertion test
        assertEquals(expected, result);
    }
}