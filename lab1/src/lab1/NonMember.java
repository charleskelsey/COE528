/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author charles kelsey
 */
public class NonMember extends Passenger {
    public NonMember(String name, int age) {
        super(name, age);
    }
    
    //Override discount method for NonMembers
    @Override
    public double applyDiscount(double p) {
        if(super.getAge() > 65) {
            return (p*0.1);
        } else {
            return p;
        }       
    }
}
