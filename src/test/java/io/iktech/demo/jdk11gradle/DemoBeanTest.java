package io.iktech.demo.jdk11gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DemoBeanTest {
    @Test
    void testDemoBean() {
        DemoBean test = new DemoBean();
        test.setCode(-100);
        test.setMessage("Test");
        assertNotNull(test);
        assertEquals(-100, test.getCode());
        assertEquals("Test", test.getMessage());
    }
}
