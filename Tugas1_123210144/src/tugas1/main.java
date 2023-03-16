/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import java.util.Scanner;
import tugas1.*;
/**
 *
 * @author fachr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k = new Scanner(System.in);
        int pilih;
        char ulang;
        double panjang, lebar, tinggi, jari;
         
        do{
        System.out.println("-------- Menu Proogram -----------");
        System.out.println("1. Pengukur balok");
        System.out.println("2. Pengukur Tabung");
        System.out.println("3. Exit");
        System.out.print("Pilih angka = ");
        pilih = k.nextInt();
        System.out.println("----------------------------------");
        switch(pilih){
            case 1 :
                System.out.println("            * Balok *             ");
                System.out.print("Panjang = ");
                panjang = k.nextDouble();
                System.out.print("Lebar   = ");
                lebar = k.nextDouble();
                System.out.print("Tinggi  = ");
                tinggi = k.nextDouble();
                // luas dan keliling persegi panjang serta volume dan luas permukaan balok.
                //Luas persegi panjang
                Balok hasil1 = new Balok(panjang, lebar, tinggi);
                //luas
                System.out.println("Luas Persegi     = "+hasil1.luas());
                //Keliling
                System.out.println("keliling Persegi = "+hasil1.keliling());
                //luasper
                System.out.println("Luas Balok       = "+hasil1.luaspermukaan());
                //volume
                System.out.println("volume Balok     = "+hasil1.volume());
                break;
            case 2:
//                kalian diminta untuk input jari-jari, dan tinggi tabung yang kemudian akan memunculkan luas dan
//                        keliling lingkaran serta volume dan luas permukaan tabung
                System.out.println("            * Tabung *             ");
                System.out.print("Jari-Jari = ");
                jari = k.nextDouble();
                System.out.print("Tinggi    = ");
                tinggi = k.nextDouble();
                Tabung hasil2 = new Tabung(jari,tinggi);
                //luas
                System.out.println("Luas Lingkaran     = "+hasil2.luas());
                //Keliling
                System.out.println("keliling Lingkaran = "+hasil2.keliling());
                //luasper
                System.out.println("Luas tabung        = "+hasil2.luaspermukaan());
                //volume
                System.out.println("volume tabung      = "+hasil2.volume());
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Menu tidak tersedia");
        }
        System.out.println("----------------------------------");
        System.out.print("Ingin memilih menu lain (y/t)? ");
        ulang = k.next().charAt(0);
        System.out.println();
    }while (ulang!= 't');
    }
}
