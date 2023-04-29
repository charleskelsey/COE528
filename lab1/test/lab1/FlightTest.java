/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author charles kelsey
 */
public class FlightTest {
    //These methods are not used
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //Test valid arguments of constructor of class flight
    public void testConstructor() {
        System.out.println("Constructor");
        boolean exceptionCaught = false;
        try {
           Flight f1 = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        } catch (Exception e){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }
    
    //Test invalid arguments of constructor of class flight
    public void testInvalidConstructor() {
        System.out.println("InvalidConstructor");
        try {
            Flight f2 = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        } catch(Exception e) {
            assertEquals(e, new IllegalArgumentException());
        }
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1030;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setFlightNumber(flightNumber);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Toronto";
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setOrigin(origin);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Kolkata";
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setDestination(destination);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "03/02/99 7:50 pm";
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setDepartureTime(departureTime);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 450;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setCapacity(capacity);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 450;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 1000.0D;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        instance.setOriginalPrice(originalPrice);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        int expResult = 1030;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        String expResult = "Kolkata";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        String expResult = "03/02/99 7:50 pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        int expResult = 450;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        int expResult = 450;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        double expResult = 1000.0D;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 450, 1000.0D);
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
