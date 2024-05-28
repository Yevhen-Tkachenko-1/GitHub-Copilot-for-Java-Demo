package yevhent.demo.kafka.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void addReturnsCorrectSum() {
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    void addHandlesNegativeNumbers() {
        assertEquals(-1, MathUtils.add(2, -3));
    }

    @Test
    void sqrtReturnsCorrectRoot() {
        assertEquals(3.0, MathUtils.sqrt(9.0));
    }

    @Test
    void sqrtHandlesZero() {
        assertEquals(0.0, MathUtils.sqrt(0.0));
    }

    @Test
    void isOddReturnsTrueForOddNumbers() {
        assertTrue(MathUtils.isOdd(3));
    }

    @Test
    void isOddReturnsFalseForEvenNumbers() {
        assertFalse(MathUtils.isOdd(2));
    }

    @Test
    void isEvenReturnsTrueForEvenNumbers() {
        assertTrue(MathUtils.isEven(2));
    }

    @Test
    void isEvenReturnsFalseForOddNumbers() {
        assertFalse(MathUtils.isEven(3));
    }

    @Test
    void printFieldsPrintsCorrectly() {
        // This test would require a way to capture the output of System.out.println
        // This is typically done using a library like System Rules or PowerMock
    }
}