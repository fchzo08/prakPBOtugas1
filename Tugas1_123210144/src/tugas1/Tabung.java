/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author fachr
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
        private double tinggi;
        final double pi = 3.14;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public double gettinggi(){
        return tinggi;
    }
    public void settinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
        @Override
    public double luaspermukaan(){
        return 2*pi*super.getJari()*(super.getJari()+tinggi);
    }
 
    @Override
     public double volume(){
        return pi*super.getJari()*super.getJari()*tinggi;
    }
}
