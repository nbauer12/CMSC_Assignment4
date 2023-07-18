/*
 * Class: CMSC203 CRN 40539 
 * Instructor: Professor Ashique Tanveer
 * Description: Represents a management company that can do a variety of things including calculating rent, finding properties with the highest rent, etc.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nathaniel Bauer
*/

package assignment4package;

public class ManagementCompany {
    public static final int MAX_PROPERTY = 5;
    private String name;
    private String taxID;
    private double managementFee;
    private Property[] properties;
    private Plot plot;
    private int propertyCount = 0;

    public ManagementCompany() {
        this.name = "";
        this.taxID = "";
        this.managementFee = 0;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(0, 0, 10, 10);
    }

    public ManagementCompany(String name, String taxID, double managementFee) {
        this.name = name;
        this.taxID = taxID;
        this.managementFee = managementFee;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(0, 0, 10, 10);
    }

    public int addProperty(Property property) {
        if (propertyCount < MAX_PROPERTY) {
            properties[propertyCount] = new Property(property);
            propertyCount++;
            return propertyCount - 1;
        } else {
            return -1;
        }
    }

    public double getTotalRent() {
        double total = 0;
        for (int i = 0; i < propertyCount; i++) {
            total += properties[i].getRentAmount();
        }
        return total;
    }
    
    public int getPropertiesCount() {
        return propertyCount;
    }
    
    public String[] getOwnerNames() {
        String[] owners = new String[propertyCount];
        for (int i = 0; i < propertyCount; i++) {
            owners[i] = properties[i].getOwner();
        }
        return owners;
    }

    public String displayProperties() {
        String str = "";
        for (int i = 0; i < propertyCount; i++) {
            str += properties[i].toString() + "\n";
        }
        return str;
    }
    
    public String toString() {
        return plot.getX() + "," + plot.getY() + "," + plot.getWidth() + "," + plot.getDepth();
    }

    public Property getHighestRentProperty() {
        double maxRent = properties[0].getRentAmount();
        Property maxRentProp = properties[0];

        for (int i = 1; i < propertyCount; i++) {
            if (properties[i].getRentAmount() > maxRent) {
                maxRent = properties[i].getRentAmount();
                maxRentProp = properties[i];
            }
        }

        return maxRentProp;
    }

    public Plot getPlot() {
        return plot;
    }

    public String getName() {
        return name;
    }

    public static int getMaxProperty() {
        return MAX_PROPERTY;
    }
}
