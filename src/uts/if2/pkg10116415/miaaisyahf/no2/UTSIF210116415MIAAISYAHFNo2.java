/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116415.miaaisyahf.no2;

import java.util.Scanner;

/**
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 * Deskripsi Program : Uts Program nomor 2 PROGRAM TABUNGAN
 */
public class UTSIF210116415MIAAISYAHFNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        tabungan tbg = new tabungan();
        int jumlah;
        int saldo;
   
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : Rp ");
        saldo = scn.nextInt();
        System.out.print("Jumlah uang yang diambil : Rp ");
        jumlah = scn1.nextInt();
        
        System.out.println("");
        System.out.println("Saldo Anda Sekarang : Rp " + tbg.ambilUang(saldo - jumlah));
    
    }
    
}
