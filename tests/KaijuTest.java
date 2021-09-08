import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaijuTest {

    @Test
    void kaijuAreaOfDestructionTst() {
        Kaiju monsterKaiju = new Kaiju(10,10, 10);
        //outcome
        double result = monsterKaiju.areaOfDestruction();
        double expected = Math.PI*Math.pow(10,2);
        assertEquals(expected, result);
    }
}