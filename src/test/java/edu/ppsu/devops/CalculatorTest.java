
package edu.ppsu.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final App app = new App();

    @Test
    void testAddition() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, app.subtract(5, 3));
    }

    @Test
    void testGreeting() {
        assertEquals("Hello, Shailesh!", app.greet("Shailesh"));
    }
}