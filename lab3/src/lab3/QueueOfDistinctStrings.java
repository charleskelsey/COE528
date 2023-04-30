/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author charles kelsey
 */
import java.util.ArrayList;
public class QueueOfDistinctStrings {
    // Overview: QueueOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // FIFO (First-In-First-Out) order.
    //
    // The abstraction function is:
    // a) F(s) = String(0), String(1),..., String(s)
    // The String(s) much contain a value, this means that it cannot equal null, and
    // it must follow the rep invariant
    //
    //
    // The rep invariant is:
    // b) String(s) != null
    // String(s) != any value of String(0 to s-1), this means that the value of String(s)
    // cannot be the same as any String() before it
    //
    //
    //the rep 
    private ArrayList<String> items;
    // constructor
    public QueueOfDistinctStrings () {
        // EFFECTS: Creates a new QueueOfDistinctStrings object
        items = new ArrayList<String>();
    }
    
    // MODIFIES: this
    // EFFECTS: Appends the element at the end of the queue
    //          if the element is not in the queue, otherwise
    //          does nothing.
    public void enqueue(String element) throws Exception {
        if(element == null) throw new Exception();
        if(false == items.contains(element))
            items.add(element);
    }
    
    public String dequeue() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) throw new Exception();
        return items.remove(0);
    }
    
    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this
        //          object; otherwise returns false
        // c) Write the code for the repOK() here 
        for(String temp:items) {
            for(int i = 0; i < items.size(); i++) {
                if(items.contains(temp)) {
                    return false;
                }   
            }
        }
        return true;
    }       
    
    public String toString() {
        // EFFECTS: Returns a string that contains the strings in the
        //          queue, the front element and the end element.
        //          Implements the abstraction function.
        // d) Write the code for the toString() here    
        String display = "The number of elements in the stack are: " + items.size() + System.lineSeparator();
        for(int i = items.size(); i >= 0; i++) {
            display = display + " " + items.get(i) + System.lineSeparator();
        }
        return display;
     }
}
