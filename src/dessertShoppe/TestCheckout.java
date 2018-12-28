/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */

package dessertShoppe;

import java.util.Scanner;

public class TestCheckout {

    public static void main(String[] args) {
        
       /* Scanner scanner = new Scanner(System.in);
        int opt;
        opt = scanner.nextInt();
        
        switch(opt){
            
            case 1:
            {
                break;
            }
            
        }*/
        
       Checkout c = new Checkout();
       
       c.enterItem(new Sundae("Chocolate", 210, "Something", 50));
       c.enterItem(new Candy("Fudge", 2.3, 330));
       c.enterItem(new Cookie("Brownie", 12, 300));
       
       System.out.print(c.toString());
       
    }
    
}
