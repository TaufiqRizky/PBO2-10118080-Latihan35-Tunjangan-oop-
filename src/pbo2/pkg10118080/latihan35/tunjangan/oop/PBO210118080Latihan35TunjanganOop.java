/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan35.tunjangan.oop;

import java.util.Scanner;

/**
 *
 * @author Trizky
 */
public class PBO210118080Latihan35TunjanganOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan = new Karyawan();
        System.out.println("========================== Program Tunjangan ==========================");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: Rp. ");
        Scanner gp = new Scanner(System.in);
        karyawan.setGajiPokok(gp.nextDouble());
       
        System.out.print("Status Anda ? (Menikah/Belum)\t\t:  ");
        Scanner Sstat = new Scanner(System.in);
        //String Status = Sstat.next();
        karyawan.setStatus(Sstat.next().toUpperCase());
        System.out.println("");
        karyawan.HasilHitung();
        System.out.println("");
        System.out.println("Developed By : Taufiq Rizky");
    }
    
}
