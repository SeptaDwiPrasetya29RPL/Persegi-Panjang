/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegipanjang;

/**
 *
 * @author LENOVO
 */
public class Main {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang();
        
        persegi.setPanjang(10);
        persegi.setLebar(30);
        
        System.out.println("Panjang : "+persegi.getPanjang());
        System.out.println("Lebar : "+persegi.getLebar());
        
        System.out.println("Luas persegi panjang : "+persegi.luas());
        System.out.println("Keliling persegi panjang : "+persegi.keliling());
        
        Balok balokk = new Balok();
        
        
        balokk.setTinggi(10);
        balokk.setPanjang(20);
        balokk.setLebar(5);
        
        System.out.println("Tinggi : "+balokk.getTinggi());
        
        System.out.println("Luas balok : "+balokk.luas());
        System.out.println("Volume balok : "+balokk.volume());
       
        
    }
    
    
    
    
}
