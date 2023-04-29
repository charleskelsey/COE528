/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.ArrayList;
/**
 *
 * @author charles kelsey
 */
public class Manager {
    ArrayList<Flight> flight = new ArrayList<Flight>();
    ArrayList<Ticket> issuedTickets = new ArrayList<Ticket>();
    int ticketNumber = 0;
    
    public void createFlights() {
        flight.add(new Flight(1030, "Toronto", "Kolkata", "March 14, 12pm", 10000, 1200));
        flight.add(new Flight(1040, "Vancouver", "Los Angeles", "August 4, 10am", 500, 300));
        flight.add(new Flight(1050, "Montreal", "Tokyo", "March 21, 2pm", 1000, 1500));
    }
    
    public void displayAvailableFlights(String origin, String destination) {
        for(Flight f :this.flight) {
            if(f.getOrigin().equals(origin) && f.getDestination().equals(destination) && f.getNumberOfSeatsLeft() > 0) {
                System.out.println(f.toString());
            }
        }
    }
    
    public Flight getFlight(int flightNumber) {
        for(Flight f : this.flight) {
            if(f.getFlightNumber() == flightNumber) {
                return f;
            }
        }
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p) {
        Flight f = getFlight(flightNumber);
        if(f!=null){
            issuedTickets.add(new Ticket(p, f, p.applyDiscount(f.getOriginalPrice())));
            System.out.println(issuedTickets.get(ticketNumber).toString());
            ticketNumber++;
        }
    }
    
    public static void main(String[] args) {
        Manager charles = new Manager();
        
        charles.createFlights();
        
        Passenger matthew = new NonMember("Matthew", 30);
        Passenger mark = new Member("Mark", 45, 8);
        Passenger luke = new NonMember("Luke", 80);
        
        System.out.println("Displaying all the available flights for the desired origin and destination:");
        charles.displayAvailableFlights("Toronto", "Kolkata");
        charles.displayAvailableFlights("Vancouver", "Los Angeles");
        charles.displayAvailableFlights("Montreal", "Tokyo");
        System.out.println("\n");
       
        System.out.println("Displaying the flights for the specified flight number:");
        System.out.println(charles.getFlight(1030).toString());
        System.out.println(charles.getFlight(1040).toString());
        System.out.println(charles.getFlight(1050).toString());
        System.out.println("\n");
       
        System.out.println("Displaying the issued tickets:");
        charles.bookSeat(1030, matthew);
        charles.bookSeat(1040, mark);
        charles.bookSeat(1050, luke);
    }
}
