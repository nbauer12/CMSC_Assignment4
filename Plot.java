/*
 * Class: CMSC203 CRN 40539 
 * Instructor: Professor Ashique Tanveer
 * Description: Represents a plot of land that has methods to check if it overlaps other plots, set plot properties, and get plot properties
 * Due: 07/17/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nathaniel Bauer
*/

package assignment4package;

public class Plot {

    private int x;
    private int y;
    private int width;
    private int depth;


    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }


    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }


    public Plot(Plot p) {
        this.x = p.x;
        this.y = p.y;
        this.width = p.width;
        this.depth = p.depth;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


    public boolean overlaps(Plot p) {
        return this.x < (p.x + p.width) && (this.x + this.width) > p.x && 
               this.y < (p.y + p.depth) && (this.y + this.depth) > p.y;
    }


    public boolean encompasses(Plot p) {
        return (p.x >= this.x) && ((p.x + p.width) <= (this.x + this.width)) && 
               (p.y >= this.y) && ((p.y + p.depth) <= (this.y + this.depth));
    }


    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
