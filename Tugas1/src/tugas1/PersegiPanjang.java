/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang implements MenghitungBidang{
    private double panjang,lebar,luas,keliling;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void HitungLuas() {
        luas=panjang*lebar;
    }

    @Override
    public void HitungKeliling() {
        keliling=2*(panjang+lebar);
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
 
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}



