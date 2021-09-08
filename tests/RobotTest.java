import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void areaOfDestruction() {
        //given
        Monster stubRobotMonster = new Robot(10,10, 10);
        //outcome
        double result = stubRobotMonster.areaOfDestruction();
        //then
        double expected_outcome  = 100.0;
        assertEquals(expected_outcome, result);
    }


}