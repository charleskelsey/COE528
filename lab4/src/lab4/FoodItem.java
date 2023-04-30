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
public class FoodItem extends FoodComponent {
    private String item;
    private double price;
    
    public FoodItem(String item, double price) {
        this.item = item;
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print(int level) {
        //System.out.println("FoodItem: " + item + ", " + getPrice());
        
        if (level == 0) {
            System.out.println("FoodItem: " + item + ", " + getPrice());
        } else if (level == 1) {
            System.out.println("    FoodItem: " + item + ", " + getPrice());
        } else if (level == 2) {
            System.out.println("        FoodItem: " + item + ", " + getPrice());
        } else {
            System.out.println("            FoodItem: " + item + ", " + getPrice());
        }
        
    }
}
