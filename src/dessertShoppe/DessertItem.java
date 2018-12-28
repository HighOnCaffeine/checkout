/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class DessertItem {
    
    private String name;
    protected double cost;
    
    public DessertItem(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCost() {
        return this.cost;
    }
    
}
