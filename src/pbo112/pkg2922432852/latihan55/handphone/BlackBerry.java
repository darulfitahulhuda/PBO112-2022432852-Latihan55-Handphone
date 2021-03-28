/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2922432852.latihan55.handphone;

/**
 *
 * @author Mini Pc
 */
public class BlackBerry extends Handphone {
       private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga){
        super(man,os,model,harga);
        
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}
