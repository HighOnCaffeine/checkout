/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */
package dessertShoppe;

public class Cookie extends DessertItem {
    
     private final int number;
     private final double pricePerDozen;
     
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
     
}
