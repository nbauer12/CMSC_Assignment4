/*
 * Class: CMSC203 CRN 40539 
 * Instructor: Professor Ashique Tanveer
 * Description: Tests Property.java
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

class PropertyTestStudent {
    private Property propertyOne;

    @BeforeEach
    void setUp() {
        propertyOne = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
    }

    @Test
    void testNoArgConstructor() {
        Property p = new Property();
        assertEquals("", p.getPropertyName());
        assertEquals("", p.getCity());
        assertEquals(0.0, p.getRentAmount());
        assertEquals("", p.getOwner());
    }

    @Test
    void testParameterizedConstructor() {
        Property p = new Property("Test Name", "Test City", 2000.00, "Test Owner");
        assertEquals("Test Name", p.getPropertyName());
        assertEquals("Test City", p.getCity());
        assertEquals(2000.00, p.getRentAmount());
        assertEquals("Test Owner", p.getOwner());
    }

    @Test
    void testCopyConstructor() {
        Property copy = new Property(propertyOne);
        assertEquals(propertyOne.getPropertyName(), copy.getPropertyName());
        assertEquals(propertyOne.getCity(), copy.getCity());
        assertEquals(propertyOne.getRentAmount(), copy.getRentAmount());
        assertEquals(propertyOne.getOwner(), copy.getOwner());
    }

    @Test
    void testSetters() {
        Property p = new Property();
        p.setPropertyName("Test Name");
        p.setCity("Test City");
        p.setRentAmount(2000.00);
        p.setOwnerName("Test Owner");
        assertEquals("Test Name", p.getPropertyName());
        assertEquals("Test City", p.getCity());
        assertEquals(2000.00, p.getRentAmount());
        assertEquals("Test Owner", p.getOwner());
    }

    @Test
    void testSetPlot() {
        Property p = new Property();
        p.setPlot(1, 2, 3, 4);
        assertEquals(1, p.getPlot().getX());
        assertEquals(2, p.getPlot().getY());
        assertEquals(3, p.getPlot().getWidth());
        assertEquals(4, p.getPlot().getDepth());
    }

    @Test
    void testToString() {
        assertEquals("Property ABC,Rockville,Wells Fargo Bank,2450.0", propertyOne.toString());
    }
}
