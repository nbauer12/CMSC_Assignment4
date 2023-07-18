/*
 * Class: CMSC203 CRN 40539 
 * Instructor: Professor Ashique Tanveer
 * Description: Tests the ManagementCompany.java
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

class ManagementCompanyTestStudent {
    private ManagementCompany mc;

    @BeforeEach
    void setUp() {
        mc = new ManagementCompany("MgmCo", "12345", 12.0);
    }

    @Test
    void testNoArgConstructor() {
        ManagementCompany mc = new ManagementCompany();
        assertEquals("", mc.getName());
        assertEquals(5, mc.getMaxProperty());
    }

    @Test
    void testParameterizedConstructor() {
        ManagementCompany mc = new ManagementCompany("Test MgmCo", "Test 12345", 10.0);
        assertEquals("Test MgmCo", mc.getName());
        assertEquals(5, mc.getMaxProperty());
    }

    @Test
    void testAddProperty() {
        Property p = new Property("Test Name", "Test City", 2000.00, "Test Owner");
        int addedIndex = mc.addProperty(p);
        assertEquals(0, addedIndex);
        assertEquals(1, mc.getPropertiesCount());
    }

    @Test
    void testGetTotalRent() {
        Property p1 = new Property("Test Name 1", "Test City", 2000.00, "Test Owner 1");
        Property p2 = new Property("Test Name 2", "Test City", 3000.00, "Test Owner 2");
        mc.addProperty(p1);
        mc.addProperty(p2);
        assertEquals(5000.00, mc.getTotalRent());
    }

    @Test
    void testGetOwnerNames() {
        Property p1 = new Property("Test Name 1", "Test City", 2000.00, "Test Owner 1");
        Property p2 = new Property("Test Name 2", "Test City", 3000.00, "Test Owner 2");
        mc.addProperty(p1);
        mc.addProperty(p2);
        assertArrayEquals(new String[]{"Test Owner 1", "Test Owner 2"}, mc.getOwnerNames());
    }

    @Test
    void testDisplayProperties() {
        Property p1 = new Property("Test Name 1", "Test City", 2000.00, "Test Owner 1");
        Property p2 = new Property("Test Name 2", "Test City", 3000.00, "Test Owner 2");
        mc.addProperty(p1);
        mc.addProperty(p2);
        String expected = p1.toString() + "\n" + p2.toString() + "\n";
        assertEquals(expected, mc.displayProperties());
    }

    @Test
    void testGetHighestRentProperty() {
        Property p1 = new Property("Test Name 1", "Test City", 2000.00, "Test Owner 1");
        Property p2 = new Property("Test Name 2", "Test City", 3000.00, "Test Owner 2");
        mc.addProperty(p1);
        mc.addProperty(p2);
        assertEquals(p2.getRentAmount(), mc.getHighestRentProperty().getRentAmount());
    }

    @Test
    void testToString() {
        assertEquals("0,0,10,10", mc.toString());
    }
}
