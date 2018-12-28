/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */

package dessertShoppe;

import java.util.ArrayList;

public class Checkout {

    private final String STORE_NAME;
    private final int RECEIPT_LENGTH = 80;
    private final int COST_LENGTH = 10;
    
    private int nItems;
    private double cost;
    
    ArrayList<DessertItem> al;
    
    public Checkout() {
        this.STORE_NAME = "SUPER MART SUPERMART";
        al = new ArrayList<>();
        nItems = 0;
        cost = 0;
    }
    
    public void enterItem(DessertItem item) {
        al.add(item);
        nItems++;
    }

    public DessertItem searchItem(int index) {
        if(index <= nItems){
            return al.get(index);
        } else
            System.out.println("Invalid Index");
        return null;
    }
    
    public void removeItem(DessertItem item) {
        boolean isRemoved = al.remove(item);
        System.out.println(isRemoved ? "Item Removed" : "Item Not Found");
        if (isRemoved)
            nItems--;
    }
    
    public double totalCost() {
        this.cost = 0;
        for(int i = 0; i < nItems; i++){
            this.cost += al.get(i).getCost();
        }
        return this.cost;
    }
    
    @Override
    public String toString() {
     
        String out = "";                                                            // RECEIPT STRING
        
        out += STORE_NAME;
        out += "\n-----------------";
        
        for (int i = 0; i < this.nItems; i++) {
            String name = "", c = "", s = "";
            
            s += "\n";
            s += i < 10 ? "  " : (i < 100 ? " " : null);
            s += i + ". ";
            
            DessertItem dessert = al.get(i);
            
            if(dessert instanceof Cookie) {                                         // IF INSTANCE OF Cookie
                Cookie item = (Cookie) dessert;
                String n = item.getName() + " Cookies";
                
                final int MAX_LEN = RECEIPT_LENGTH - 15;
                if(n.length() >= MAX_LEN){
                    n = n.substring(0, MAX_LEN);
                }
                
                name += item.getNumber() + "x ";
                name += n.toUpperCase();
                name += " @Rs." + String.format("%.2f", item.getPricePerDozen()) + "/DZN";

                while(name.length() + s.length() <= RECEIPT_LENGTH)
                    name += " ";
                
                String cost = String.format("%.2f", item.getCost());
                while(cost.length() + c.length() > COST_LENGTH)
                    c += " ";
                out += s + name + c + cost;
                
            } 
            else if (dessert instanceof Candy) {                                  // IF INSTANCE OF Candy
                Candy item = (Candy) dessert;
                String n = item.getName() + " Candy";
                String w = String.format("%.2f", item.getWeight());
                
                final int MAX_LEN = RECEIPT_LENGTH - 15;
                if(n.length() >= MAX_LEN){
                    n = n.substring(0, MAX_LEN);
                }
                
                name += w + "LBS ";
                name += n.toUpperCase();
                name += " @Rs." + item.getPricePerPound() + "/LBS";
                
                while(name.length() + s.length() <= RECEIPT_LENGTH)
                    name += " ";
                
                String cost = String.format("%.2f", item.getCost());
                while(cost.length() + c.length() > COST_LENGTH)
                    c += " ";
                out += s + name + c + cost;
            } 
            else if (dessert instanceof Sundae) {                                 // IF INSTANCE OF Sundae
                Sundae item = (Sundae) dessert;
                String n = item.getName() ;
                String t = item.getTopping();
                
                final int MAX_LEN = RECEIPT_LENGTH - 15;
                if(n.length() + t.length() >= MAX_LEN){
                    n = n.substring(0, MAX_LEN/2);
                }
                if(t.length() >= MAX_LEN){
                    t = t.substring(0, MAX_LEN/2);
                }

                    name += n.toUpperCase();
                    name += " SUNDAE WITH " + t.toUpperCase();
                
                while(name.length() + s.length() <= RECEIPT_LENGTH)
                    name += " ";
                
                String cost = String.format("%.2f", item.getCost());
                while(cost.length() + c.length() > COST_LENGTH)
                    c += " ";
                out += s + name + c + cost;
            }
            else {                                                                   // IF INSTANCE OF Icecream
                Icecream item = (Icecream) dessert;
                String n = item.getName()  + " Icecream";
                
                final int MAX_LEN = RECEIPT_LENGTH - 4;
                if(n.length() >= MAX_LEN){
                    n = n.substring(0, MAX_LEN);
                }
                
                name += n.toUpperCase();
                
                while(name.length() + s.length() <= RECEIPT_LENGTH)
                    name += " ";
                
                String cost = String.format("%.2f", item.getCost());
                while(cost.length() + c.length() > COST_LENGTH)
                    c += " ";
                out += s + name + c + cost;
            }  
        }
        out += "\n-----------------";
        out += "\n";
        
        String c = "Total Cost:";
        while(c.length() < this.RECEIPT_LENGTH) 
            c += " ";
        
        out += c + String.format("%.2f", totalCost());
        
        return out;
    }
    
}
