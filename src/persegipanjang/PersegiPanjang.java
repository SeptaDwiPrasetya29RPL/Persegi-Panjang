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
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
   public void setPanjang(double panjang){
       this.panjang = panjang;  
   }
   public void setLebar(double lebar){
       this.lebar = lebar;
   }
   public double getPanjang(){
       return panjang;
   }
   public double getLebar(){
       return lebar;
   }
   public double luas(){
       double luas;
       luas = panjang*lebar;
       return luas;
   }
   public double keliling(){
       double keliling;
       keliling = panjang+panjang+lebar+lebar;
       return keliling;
   }
   
}
    

