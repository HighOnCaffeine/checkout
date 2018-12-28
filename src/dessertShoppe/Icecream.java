/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class Icecream extends DessertItem {
    
    private double cost;
    
    public Icecream(String name, double cost){
        super(name);
        this.cost = cost;
    }
    
    public double getCost() {
        return this.cost;
    }
}
