import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateMethodsTest {

    @Test
    void printDateDetails() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer year = offsetDateTime.getYear();
        String month = String.valueOf(offsetDateTime.getMonth());
        Integer day = offsetDateTime.getDayOfMonth();
        String dayOfWeek = String.valueOf(offsetDateTime.getDayOfWeek());

        assertEquals(2023, year);
        assertEquals("MARCH", month);
        assertEquals(1, day);
        assertEquals("WEDNESDAY", dayOfWeek);
    }
}