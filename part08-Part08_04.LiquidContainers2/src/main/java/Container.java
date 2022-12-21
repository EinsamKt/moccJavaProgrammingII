/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Container {
    private int containerAmount;
    
    public Container() {        
        
    }
    
    public int contains() {
        return this.containerAmount;
    }
    
    public void add (int amount) {
        if (amount > 0 & this.containerAmount + amount <=100){
            this.containerAmount = this.containerAmount + amount;
        } else if (amount > 0) {
            this.containerAmount =100;
        }
       
    }
    
    public void remove (int amount) {
        if (amount > 0 & this.containerAmount-amount >= 0){
            this.containerAmount = this.containerAmount - amount;
        } else if (amount > 0) {
            this.containerAmount = 0;
        }
    }
    
    public String toString() {
        return this.containerAmount + "/100";
    }
    
}
