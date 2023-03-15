/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public class Lingkaran implements MenghitungBidang{
    private double r,luas,keliling;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public void HitungLuas() {
        luas=Math.PI*r*r;
    }

    @Override
    public void HitungKeliling() {
        keliling=2*Math.PI*r;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}
