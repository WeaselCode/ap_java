/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weasel
 */
public class Truck implements Vehicle {
    String make;
    String model;
    int VIN;
    
    public Truck(String _make, String _model, int _VIN){
        make = _make;
        model = _model;
        VIN = _VIN;  
    }

    @Override
    public void action() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("VIN " + VIN);
    }

    @Override
    public String description() {
        return "Vehicle is a " + make + ": " + model + " with VIN: " + VIN; 
    }
    @Override
    public int compareTo(Vehicle o) {
        if (o instanceof Truck) {
            Truck truck = (Truck) o;
            if(make.compareToIgnoreCase(truck.make) > 0) return -1;
            if(make.compareToIgnoreCase(truck.make) < 0) return 1;
            if(model.compareToIgnoreCase(truck.model) > 0) return -1;
            if(model.compareToIgnoreCase(truck.model) < 0) return 1;
            if (VIN < truck.VIN) return  -1;
            if (VIN > truck.VIN) return   1;
            return 0;

        } else {
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
    }
    @Override 
    public boolean equals(Object to) {
        return compareTo((Vehicle) to) == 0;
    }
}
   
    
