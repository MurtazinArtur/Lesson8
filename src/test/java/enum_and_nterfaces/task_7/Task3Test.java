package enum_and_nterfaces.task_7;

import enum_and_interfaces.task_3.Tuna;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {
    @Test
    void testTask3() {
        Tuna tuna = new Tuna();
        assertTrue(tuna.getNumberOfScales() == 91);
    }
}
