package br.ce.wcaquino.taskbakend;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.ce.wcaquino.taskbackend.utils.DateUtils;

public class DateUtilsTest {

    @Test
    public void isBefore() {
        LocalDate before = LocalDate.of(2000, 1, 1);
        boolean result = DateUtils.isEqualOrFutureDate(before);
        assertFalse(result);
    }

    @Test
    public void isAfter() {
        LocalDate before = LocalDate.of(2100, 1, 1);
        boolean result = DateUtils.isEqualOrFutureDate(before);
        assertTrue(result);
    }

    @Test
    public void isEquals() {
        LocalDate before = LocalDate.now();
        boolean result = DateUtils.isEqualOrFutureDate(before);
        assertTrue(result);
    }

}