/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author fachr
 */
public class Lingkaran implements MenghitungBidang{
        private double jari;
        final double pi = 3.14;
    public Lingkaran(double jari){
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
        @Override
    public double luas(){
        return pi*jari*jari;
    }
        @Override
    public double keliling(){
    return 2*jari*pi;
    }
}
