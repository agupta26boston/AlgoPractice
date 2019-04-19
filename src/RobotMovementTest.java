import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotMovementTest {

    RobotMovement robotMovement= new RobotMovement();

    @Test
    void starts_at_origin()
    {
        assertEquals("0:0", robotMovement.position());
    }

    @Test
    void move_forward_twice()
    {
        robotMovement.instructions("FF");
        assertEquals("0:2", robotMovement.position());
    }

    @Test
    void move_and_turn_right()
    {
        robotMovement.instructions("FFRF");
        assertEquals("1:2", robotMovement.position());
    }

    @Test
    void three_rights_is_one_left()
    {
        robotMovement.instructions("FFRRRFF");
        assertEquals("-2:2", robotMovement.position());
    }
}