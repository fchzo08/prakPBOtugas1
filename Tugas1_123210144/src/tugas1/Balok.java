/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author fachr
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;
    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luaspermukaan() {
        return 2*((super.getPanjang()*super.getLebar())+(super.getPanjang()*tinggi)+(super.getLebar()*tinggi));
    }

    @Override
    public double volume() {
        return super.getPanjang()*super.getLebar()*tinggi;
    }
}
