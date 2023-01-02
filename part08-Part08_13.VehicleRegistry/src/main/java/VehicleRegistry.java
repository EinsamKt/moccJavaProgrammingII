
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> licenseOwner;
    
    public VehicleRegistry() {
        this.licenseOwner = new HashMap<>();
        
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        for(LicensePlate e: licenseOwner.keySet()) {
            if (e.equals(licensePlate)) {
                return false;
            }
        }
        this.licenseOwner.put(licensePlate, owner);
        return true;
        
    }
    
    public String get(LicensePlate licensePlate) {
        
       return this.licenseOwner.getOrDefault(licensePlate, null);
        
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.licenseOwner.containsKey(licensePlate)) {
            this.licenseOwner.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate allKeys: this.licenseOwner.keySet()) {
            System.out.println(allKeys);
        }
    }
    
    public void printOwners() {
        ArrayList<String>Owners = new ArrayList<>();
        for (LicensePlate allKeys: this.licenseOwner.keySet()) {
           
            if (!Owners.contains(this.licenseOwner.get(allKeys))) {
                Owners.add(this.licenseOwner.get(allKeys));
            }
        }
        
        for (String owner: Owners) {
            System.out.println(owner);
        }
    }
    
}
