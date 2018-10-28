/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan46.tandanyakamu;

import java.util.Scanner;
/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk menampilkan umur
 */
public class PB0210117061Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sca = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun tanggal lahir : ");
        Age age = new Age(sca.nextInt());
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir anda : " +age.getYearNow());
        System.out.println("Hari ini Tahun : " +age.getYearBirth());
        System.out.println("Umur kamu sampai hari ini adalah " +age.hitungUmur()
                            +" Tahun");
        age.tandanyaKamu(age.hitungUmur());
    }

}
