package org.parth.javaspringweb.springlabs;


import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Testable
public class DoubleAssertionIT {


    @Test
    public void testDoubleAssertion() {
        double d = 1.092502560702E-4;
        double e = 1.082502560702E-4;
        assertEquals(d,e,0.0001);
    }
}
