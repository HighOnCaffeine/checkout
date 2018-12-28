/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class Cookie extends DessertItem {
    
     private int number;
     private double pricePerDozen;
     private double cost;
     
     public Cookie (String name, int number, double pricePerDozen) {
         super(name);
         this.number = number;
         this.pricePerDozen = pricePerDozen;
         
     }
     
     public int getNumber() {
         return this.number;
     }
     
     public double getPricePerDozen() {
         return this.pricePerDozen;
     }
     
     public double getCost() {
         this.cost  = this.number * (this.pricePerDozen / 12.0);
         return this.cost;
     }
     
}
