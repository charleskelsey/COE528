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
public class Ticket {
    private Passenger passenger; 
    private Flight flight; 
    private double price;
    private static int ticketNum;

    public Ticket(Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
    }
    
    //setters and getters
    public void setPassenger(Passenger p) {
        this.passenger = p;
    }
    
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Passenger getPassenger() {
        return passenger;
    }
    
    public Flight getFlight() {
        return flight;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    //a toString method that follows this format:
    //Julia Chow, Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000$, ticket price: $600.00
    @Override
    public String toString()
    {
        return (passenger.getName() + ", Flight " + flight.getFlightNumber() + ", " + 
                flight.getOrigin() + " to "+ flight.getDestination() + ", " 
                + flight.getDepartureTime() + ", original price: " + 
                flight.getOriginalPrice() + "$, ticket price: " + 
                this.price);
    }
}
