/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class Candy extends DessertItem {
    
    private final double priceperPound;
    private double weight;
    
    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.priceperPound = pricePerPound;
    }
    
    public double getPricePerPound() {
        return this.priceperPound;
    }
    
}
