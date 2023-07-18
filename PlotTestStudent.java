/*
 * Class: CMSC203 CRN 40539 
 * Instructor: Professor Ashique Tanveer
 * Description: Tests Plot.java
 * Due: 07/17/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nathaniel Bauer
*/

package assignment4package;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
    private Plot plotOne;
    private Plot plotTwo;

    @BeforeEach
    void setUp() {
        plotOne = new Plot(1, 1, 2, 2);
        plotTwo = new Plot(0, 0, 4, 4);
    }

    @Test
    void testNoArgConstructor() {
        Plot p = new Plot();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
        assertEquals(1, p.getWidth());
        assertEquals(1, p.getDepth());
    }

    @Test
    void testParameterizedConstructor() {
        Plot p = new Plot(2, 3, 4, 5);
        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
        assertEquals(4, p.getWidth());
        assertEquals(5, p.getDepth());
    }

    @Test
    void testCopyConstructor() {
        Plot copy = new Plot(plotOne);
        assertEquals(plotOne.getX(), copy.getX());
        assertEquals(plotOne.getY(), copy.getY());
        assertEquals(plotOne.getWidth(), copy.getWidth());
        assertEquals(plotOne.getDepth(), copy.getDepth());
    }

    @Test
    void testSetters() {
        Plot p = new Plot();
        p.setX(2);
        p.setY(3);
        p.setWidth(4);
        p.setDepth(5);
        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
        assertEquals(4, p.getWidth());
        assertEquals(5, p.getDepth());
    }

    @Test
    void testOverlaps() {
        assertTrue(plotOne.overlaps(plotTwo));
        assertTrue(plotTwo.overlaps(plotOne));
    }

    @Test
    void testEncompasses() {
        assertTrue(plotTwo.encompasses(plotOne));
        assertFalse(plotOne.encompasses(plotTwo));
    }

    @Test
    void testToString() {
        assertEquals("1,1,2,2", plotOne.toString());
        assertEquals("0,0,4,4", plotTwo.toString());
    }
}

