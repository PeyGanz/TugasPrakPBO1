/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi,luaspermukaan,volume;

    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }

    public Tabung(double r) {
        super(r);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void HitungLuasPermukaan() {
        luaspermukaan=getLuas()*2 + getKeliling()*tinggi;
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
