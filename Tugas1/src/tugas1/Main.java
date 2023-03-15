/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        String kembali;
        double p,l,t,r;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("PROGRAM MENGHITUNG VOLUME+LUAS PERMUKAAN TABUNG DAN BALOK");
            System.out.print("Pilih Menu : \n1. Balok\n2. Tabung\nPilih : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1 -> {
                    System.out.println("===BALOK===\n");
                    System.out.print("Input panjang balok : ");p=input.nextDouble();
                    System.out.print("Input lebar balok: ");l=input.nextDouble();
                    System.out.print("Input tinggi balok : ");t=input.nextDouble();
                    Balok balok=new Balok(t, p, l);
                    balok.HitungLuas();balok.HitungKeliling();balok.HitungLuasPermukaan();balok.HitungVolume();
                    System.out.println("Luas Persegi Panjang : " + balok.getLuas());
                    System.out.println("Keliling Persegi Panjang : " + balok.getKeliling());
                    System.out.println("Volume Balok : " + balok.getVolume());
                    System.out.println("Luas Permukaan Balok : " + balok.getLuaspermukaan());
                }
                case 2 -> {
                    System.out.println("===TABUNG===\n");
                    System.out.print("Input jari-jari tabung : ");r=input.nextDouble();
                    System.out.print("Input tinggi tabung : ");t=input.nextDouble();
                    Tabung tabung=new Tabung(r);
                    tabung.setTinggi(t);
                    tabung.HitungLuas();tabung.HitungKeliling();tabung.HitungLuasPermukaan();tabung.HitungVolume();
                    System.out.println("Luas Lingkaran : " + tabung.getLuas());
                    System.out.println("Keliling Lingkaran : " + tabung.getKeliling());
                    System.out.println("Volume Tabung : " + tabung.getVolume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.getLuaspermukaan());
                }
                default -> System.out.println("\nMenu Program tidak tersedia");
            }
            System.out.print("\nKembali ke menu awal(y/n)? : ");
            kembali=input.next();
        }while(kembali.toUpperCase().equals("Y"));
    }
    
}
