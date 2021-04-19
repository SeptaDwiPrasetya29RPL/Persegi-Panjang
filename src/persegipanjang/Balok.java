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
public class Balok extends PersegiPanjang{
    private double tinggi;
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double volume (){
        double volume;
        volume = super.getPanjang()*super.getLebar()*tinggi;
        return volume;
    }
    public double luas (){
        double luas;
        luas = (2*super.getPanjang()*super.getLebar())+(2*super.getPanjang()*tinggi)+(2*super.getLebar()*tinggi);
        return luas;
    }
    public void setPanjang(double panjang){
        super.setPanjang(panjang);
    }
    public void setLebar ( double lebar){
        super.setLebar(lebar);
    }
}
