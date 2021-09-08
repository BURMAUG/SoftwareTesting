import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalkingEyeTest {

    @Test
    void walkingEyeAreaOfDestructionTst() {
        WalkingEye walkingEye = new WalkingEye(10,10);
        //outcome
        double result = walkingEye.areaOfDestruction();
        //then
        double expected_outcome = 1000.0; //expected outcome
        assertEquals(expected_outcome, result);
    }
}