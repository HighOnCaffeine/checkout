/*
 *  Name:		Muhammad Saad Farooq
 *  Course: 		Object Oriented Programming
 *  Assignment# 01
 */

package dessertShoppe;

import java.util.ArrayList;

public class Checkout {

    private int nItems;
    ArrayList<DessertItem> al;
    
    public Checkout() {
        al = new ArrayList<>();
        nItems = 0;
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
    
}
