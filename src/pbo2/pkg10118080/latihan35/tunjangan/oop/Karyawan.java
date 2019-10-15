/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan35.tunjangan.oop;

/**
 *
 * @author Trizky
 */
public class Karyawan {
    private double GajiPokok;
    private String Status;

    public double getGajiPokok() {
        return GajiPokok;
    }

    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public boolean cekStatus(){
        return "MENIKAH".equals(getStatus());
    }
    public double HitungTunjangan(){
        if (this.cekStatus()) {
           return  (0.35*getGajiPokok());
        }
        return 0;
    }
    public double hitungTotal(){
        return (HitungTunjangan()+getGajiPokok());
    }
    public void HasilHitung(){
        System.out.println("======================== Hasil Perhitungan Gaji ========================");
        System.out.println("Gaji Pokok\t: Rp "+getGajiPokok());
        System.out.println("Tunjangan\t: Rp "+HitungTunjangan());
        System.out.println("Total Gaji\t: Rp "+hitungTotal());
    }
}
