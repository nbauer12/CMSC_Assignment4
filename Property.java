/*
 * Class: CMSC203 CRN 40539 
 * Instructor: Professor Ashique Tanveer
 * Description: Represents a real estate property with methods and attributes dealing with the property and owner name, city, etc.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nathaniel Bauer
*/

package assignment4package;

public class Property {
    private String propertyName;
    private String city;
    private double rentAmount;
    private String ownerName;
    private Plot plot;

    public Property() {
        this.propertyName = "";
        this.city = "";
        this.rentAmount = 0.0;
        this.ownerName = "";
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String ownerName) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String ownerName, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property(Property p) {
        this.propertyName = p.propertyName;
        this.city = p.city;
        this.rentAmount = p.rentAmount;
        this.ownerName = p.ownerName;
        this.plot = new Plot(p.plot);
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getOwner() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Plot getPlot() {
        return plot;
    }

    public boolean setPlot(int x, int y, int width, int depth) {
        this.plot = new Plot(x, y, width, depth);
        return true;
    }

    public String toString() {
        return propertyName + "," + city + "," + ownerName + "," + rentAmount;
    }

}
