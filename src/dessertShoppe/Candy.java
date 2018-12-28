/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class Candy extends DessertItem {
    
    private double pricePerPound;
    private double weight;
    
    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }
    
    public double getPricePerPound() {
        return this.pricePerPound;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public double getCost() {
        this.cost = this.pricePerPound * this.weight;
        return this.cost;
    }
    
}
