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
public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;   
    }
    
     public void displayProduct(){
        
        Android a = new Android("Samsung","Android","Grand",3000000);
        System.out.println("Manufaktur : " + a.manufacture);
        System.out.println("OS : " + a.operatingSystem);
        System.out.println("Model : " + a.model);
        System.out.println("Harga : " + a.harga);
        a.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : " + a.getKeyStore());
        
        System.out.println("");
        
        BlackBerry b = new BlackBerry("blackB","RIM","Cruve",2000000);
        System.out.println("Manufaktur : " + b.manufacture);
        System.out.println("Os : " + b.operatingSystem);
        System.out.println("Model : " + b.model);
        System.out.println("Harga : " + b.harga);
        b.setPinBB("BHS249");
        System.out.println("Android Key Store : " + b.getPinBB());
        
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        System.out.println("Manufaktur : " + wp.manufacture);
        System.out.println("Os : " + wp.operatingSystem);
        System.out.println("Model : " + wp.model);
        System.out.println("Harga : " + wp.harga);
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Android Key Store : " + wp.getWpKeyStore());   
    }
}
