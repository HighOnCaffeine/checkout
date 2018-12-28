/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class Cookie extends DessertItem {
    
     private int number;
     private double pricePerDozen;
     
     public Cookie (String name, int number, double pricePerDozen) {
         super(name);
         this.number = number;
         this.pricePerDozen = pricePerDozen;
         this.cost = this.number * (this.pricePerDozen / 12.0);
     }
     
     public int getNumber() {
         return this.number;
     }
     
     public double getPricePerDozen() {
         return this.pricePerDozen;
     }
     
     public double getCost() {
         this.cost = this.cost = this.number * (this.pricePerDozen / 12.0);
         return this.cost;
     }
     
}
