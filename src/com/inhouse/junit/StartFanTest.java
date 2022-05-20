/**
 *
 */
package com.inhouse.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.inhouse.Fan;

/**
 * UNIT test to check few test cases
 *
 */
class StartFanTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {

    }

    /**
     * @throws java.lang.Exception
     */
    @AfterEach
    void tearDown() throws Exception {

    }

    /**
     * Test speed increment from 0 to 1
     *
     */
    @Test
    void increaseSpeedto1test() {
        Fan cf = new Fan();
        cf.increaseSpeed();
        assertEquals(1, cf.getCurrentSpeed());
    }

    /**
     * Test speed increment from 0 to 1 and the 1 -> 2
     *
     */
    @Test
    void increaseSpeedto2test() {
        Fan cf = new Fan();
        cf.increaseSpeed();
        cf.increaseSpeed();
        assertEquals(2, cf.getCurrentSpeed());
    }

    /**
     * Test speed increment from 0 -> 1 and the 1 -> 2 and 2 -> 3
     *
     */
    @Test
    void increaseSpeedto3test() {
        Fan cf = new Fan();
        cf.increaseSpeed();
        cf.increaseSpeed();
        cf.increaseSpeed();
        assertEquals(3, cf.getCurrentSpeed());
    }

    /**
     * Test cornet case when max speed reached 3-> 0
     *
     */
    @Test
    void increaseSpeedto4test() {
        Fan cf = new Fan();
        cf.increaseSpeed();
        cf.increaseSpeed();
        cf.increaseSpeed();
        cf.increaseSpeed();
        assertEquals(0, cf.getCurrentSpeed());
    }


    /**
     * Test case when reversed and maintains speed
     *
     */
    @Test
    void reverseDirectionTest() {
        Fan cf = new Fan();
        cf.increaseSpeed();
        cf.increaseSpeed();
        cf.reverseDirection();
        assertEquals(2, cf.getCurrentSpeed());
        assertEquals(true, cf.isDirectionReverse());
    }


    /**
     * Test by reversing twice and maintains speed
     *
     */
    @Test
    void reverseDirection2Test() {
        Fan cf = new Fan();
        cf.increaseSpeed();
        cf.increaseSpeed();
        cf.reverseDirection();
        assertEquals(2, cf.getCurrentSpeed());
        assertEquals(true, cf.isDirectionReverse());
        cf.increaseSpeed();
        cf.reverseDirection();
        assertEquals(3, cf.getCurrentSpeed());
        assertEquals(false, cf.isDirectionReverse());
    }
}