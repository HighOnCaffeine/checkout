/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */

package dessertShoppe;


public class Sundae extends Icecream {
    
    private String toppingName;
    private double toppingCost;
    private double cost;
    
    Sundae(String name, double cost, String toppingName, double toppingCost) {
        super(name, cost);
        this.toppingName = toppingName;
	this.toppingCost = toppingCost;
    }

    @Override
    public double getCost() {
            cost = this.toppingCost + super.getCost();
            return cost;
    }

    public String getTopping() {
            return toppingName;
    }
    
}
