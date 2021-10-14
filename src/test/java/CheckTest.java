import com.company.textanalysis.model.Check;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckTest {
    Check check = new Check();

    @Test
    void determineTest() {
        assertEquals(true, check.determine("Din"));
        assertEquals(true, check.determine("Gradle BUM"));
        assertEquals(true, check.determine("Maven Good Jobs"));
        assertEquals(false, check.determine(" "));
        assertEquals(false, check.determine("Dimon 1223"));
        assertEquals(false, check.determine("21312453 843 fdg"));
    }
}