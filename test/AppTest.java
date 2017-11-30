/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weasel
 */
public class AppTest {
    
    public AppTest() {
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

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main untested");
       
    }

    /**
     * Test of run method, of class App.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("run untested");
    }
    
    @Test
    public void testVehicles() {
        Set<Vehicle> vehicles = new TreeSet < Vehicle> ();
        
        vehicles.add(new Truck("Ford", "Ranger", 12345));
        vehicles.add(new Truck("Dodge", "Ram", 23456));
        vehicles.add(new Truck("Chevrolet", "Silverado", 34567));
        vehicles.add(new Truck("Toyota", "Tacoma", 45678));
        vehicles.add(new Truck("Nissan", "Titan", 56789));
        
        
        for (Vehicle vehicle : vehicles) {
            System.out.println("vehicle: " + vehicle.description());
        }
    }
    
    static class CmpDirective implements Comparator < Vehicle > {
        @Override
        public int compare(Vehicle a, Vehicle b) {
            return a.compareTo(b);
        }
    }
    
    @Test
    public void testSortVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList < Vehicle > ();
        
        vehicles.add(new Truck("Ford", "Ranger", 12345));
        vehicles.add(new Truck("Dodge", "Ram", 23456));
        vehicles.add(new Truck("Chevrolet", "Silverado", 34567));
        vehicles.add(new Truck("Toyota", "Tacoma", 45678));
        vehicles.add(new Truck("Nissan", "Titan", 56789));
        
        vehicles.remove(new Truck("Toyota", "Tacoma", 45678));
        vehicles.remove(new Truck("Nissan", "Titan", 56789));
        
        vehicles.sort(new CmpDirective());

        vehicles.sort(new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle a, Vehicle b) {
                return -a.compareTo(b);
            }  
        });
        
        vehicles.sort((a,b)->a.compareTo(b));
        assertEquals(new Truck("Ford", "Ranger", 12345), vehicles.get(0));
        assertEquals(new Truck("Dodge", "Ram", 23456), vehicles.get(1));
        assertEquals(new Truck("Chevrolet", "Silverado", 34567), vehicles.get(2));
        
        
    }
    
}

