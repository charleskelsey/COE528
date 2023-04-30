/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author charles kelsey
 */
import java.util.Vector;
import java.util.Enumeration;
public class FoodCategory extends FoodComponent {
    private String category;
    private Vector<FoodComponent> components;
    
    public FoodCategory(String category) {
        this.category = category;
        components = new Vector<FoodComponent>();
    }
    
    public void add(FoodComponent c) {
        components.addElement(c);
        print(0);
    }
    
    public void remove(FoodComponent c) {
        components.removeElement(c);
    }
    
    @Override
    public double getPrice() {
        //return the sum of all the price under
        return 0.0;
    }
    
    @Override
    public void print(int level) {
        //System.out.println("Composite: operation();");
        Enumeration<FoodComponent> list = components.elements();
        while (list.hasMoreElements()) {
            FoodComponent c =(FoodComponent)list.nextElement();
            c.print(level);
        }
        
        
        if (level == 0) {
            System.out.println("FoodCategory: " + "(" + category + ", " + getPrice() + ") contains:");
        } else if (level == 1) {
            System.out.println("    FoodCategory: " + "(" + category + ", " + getPrice() + ") contains:");
        } else if (level == 2) {
            System.out.println("        FoodCategory: " + "(" + category + ", " + getPrice() + ") contains:");
        } else {
            System.out.println("            FoodCategory: " + "(" + category + ", " + getPrice() + ") contains:");
        }
        
    }
}
