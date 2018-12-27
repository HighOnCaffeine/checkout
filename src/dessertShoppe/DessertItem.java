/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class DessertItem {
    
    private final String name;
    
    private double cost;
    
    public DessertItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCost() {
        return this.cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    //-------------------------------------
    
    //          MAIN FUNCTION
    
    public static void main(String[] args) {
        
        
        
    }
    
}
