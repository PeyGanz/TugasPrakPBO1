/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi,luaspermukaan,volume;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public void HitungLuasPermukaan() {
        luaspermukaan=2*getLuas() + 2*getPanjang()*tinggi + 2*getLebar()*tinggi;
    }

    @Override
    public void HitungVolume() {
        volume=getLuas()*tinggi;
    }
    
    
    public double getLuaspermukaan() {
        return luaspermukaan;
    }

    public double getVolume() {
        return volume;
    }
}
