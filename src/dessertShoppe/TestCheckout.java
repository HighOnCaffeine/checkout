/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */

package dessertShoppe;

import java.util.Scanner;

public class TestCheckout {

    /*public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opt;
        opt = scanner.nextInt();
        
        switch(opt){
            
            case 1:
            {
                break;
            }
            
        }
        
       Checkout c = new Checkout();
       
       c.enterItem(new Sundae("Chocolate", 210, "Something", 50));
       c.enterItem(new Candy("Fudge", 2.3, 30));
       c.enterItem(new Cookie("Brownie", 12, 300));
       
       System.out.println(c.toString());
       
    }*/

    public static void main(String[] args) {

        Checkout c = new Checkout();
        Scanner scanner = new Scanner(System.in);
        double cost=0;
        int choice=0;
        do{
        System.out.print("Press 1 to enter item\nPress 2 to remove item\nPress 3 to get bill\nPress 4 to exit\nChoice : ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: 
            {
                int opt;
                System.out.print("1. Ice Cream\n2. Candy\n3. Cookies\n4. Sundae\n>>");
                opt = scanner.nextInt();

                switch (opt) {

                    case 1: 
                    {
                        System.out.print("1. Chocolate Ice Cream (Rs. 50/pc)\n2. Mango Ice Cream(Rs. 30/pc)\n3. Vanilla Ice Cream(Rs. 20/pc)\n>> ");
                        int ic = 0;
                        ic = scanner.nextInt();
                        switch(ic) {
                            case 1:
                                c.enterItem(new Icecream("Chocolate", 50));
                                break;
                            case 2:
                                c.enterItem(new Icecream("Mango", 30));
                                break;
                            case 3:
                                c.enterItem(new Icecream("Vanilla", 20));
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    }
                    
                    case 2: 
                    {
                        System.out.print("1. Fudge Candy (Rs. 350/lb)\n2. Caramel Candy(Rs. 600/lb)\n3. Mars Candy(Rs. 800/lb)\n>> ");
                        int candy = 0; double lbs = 0;
                        candy = scanner.nextInt();
                        System.out.print("Amount of candy in lbs.: ");
                        lbs = scanner.nextDouble();
                        switch(candy) {
                            case 1:
                                c.enterItem(new Candy("Fudge", lbs, 350));
                                break;
                            case 2:
                                c.enterItem(new Candy("Caramel", lbs, 600));
                                break;
                            case 3:
                                c.enterItem(new Candy("Mars", lbs, 800));
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        
                        break;
                    }
                    case 3: 
                    {
                        System.out.print("1. Chocolate Cookies (Rs. 120/dz)\n2. Chocolate Chip Cookies (Rs. 360/dz)\n3. Classic Cookies (Rs. 240/dz)\n>> ");
                        int cookie = 0, n = 0;
                        cookie = scanner.nextInt();
                        System.out.print("Amount of cookies: ");
                        n = scanner.nextInt();
                        switch(cookie) {
                            case 1:
                                c.enterItem(new Candy("Chocolate", n, 120));
                                break;
                            case 2:
                                c.enterItem(new Candy("Chocolate Chip", n, 360));
                                break;
                            case 3:
                                c.enterItem(new Candy("Classic", n, 240));
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        
                        break;
                    }
                    case 4: 
                    {
                        System.out.print("1. Chocolate Ice Cream (Rs. 50/pc)\n2. Mango Ice Cream (Rs. 30/pc)\n3. Vanilla Ice Cream (Rs. 20/pc)\n>> ");
                        int ic = 0; float c1 = 0, c2=01;
                        String i = null, t = null;
                        ic = scanner.nextInt();
                        switch(ic) {
                            case 1:
                                i = "Chocolate";
                                c1 = 50;
                                break;
                            case 2:
                                i = "Mango";
                                c1 = 30;
                                break;
                            case 3:
                                i = "Vanilla";
                                c1 = 20;
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        if(ic < 1 || ic > 3)
                            break;
                        System.out.print("1. Chocolate Topping (Rs. 50/pc)\n2. Strawberry Topping (Rs. 50/pc)\n3. BlueBerry Topping (Rs. 50/pc)\n>> ");
                        ic = scanner.nextInt();
                        switch(ic) {
                            case 1:
                                t = "Chocolate";
                                c2 = 50;
                                break;
                            case 2:
                                t = "Strawberry";
                                c2 = 50;
                                break;
                            case 3:
                                t = "Blueberry";
                                c2 = 50;
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }

                        c.enterItem(new Sundae(i, c1, t, c2));
                        break;
                    }
                }
                break;
            }
            case 2 :
            {
                int opt;
                
                System.out.println(c.toString() + "\n");
                System.out.print("Enter Serial No for the item you want to remove from list: ");
                
                opt = scanner.nextInt();

                DessertItem item = c.searchItem(opt);
                c.removeItem(item);
                
                break;
            }
            case 3 :
            {
                cost=c.totalCost();
                System.out.println(c.toString());
                break;
            }
            
            case 4:
                break;
            
            default:
                System.out.println("Invalid input!");
        }
        }while(choice!=4);

        

    }
    
}
