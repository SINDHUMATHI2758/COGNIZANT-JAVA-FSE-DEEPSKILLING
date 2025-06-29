package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;


    @BeforeEach
    void setUp() {
        System.out.println("Setting up before test...");
        mathUtils = new MathUtils();
    }


    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    void testAdd() {

        int result = mathUtils.add(2, 3);

        assertEquals(5, result, "2 + 3 should be 5");
    }

    @Test
    void testMultiply() {

        int result = mathUtils.multiply(4, 5);

        assertEquals(20, result, "4 * 5 should be 20");
    }

    @Test
    void testDivide() {

        int result = mathUtils.divide(10, 2);

        assertEquals(5, result, "10 / 2 should be 5");
    }

    @Test
    void testDivideByZero() {

        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0),
                "Divide by zero should throw ArithmeticException");
    }
}
