/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MembuatInterface;
/**
 *
 * @author PC
 */
public class Mobil implements KendaraanService{
    // Deklarasi variabel yang bernama tipe mobil
    String typemobil;
    // membuat constructor class mobil
    
    // berikan nilai default pada pemanggilan variabel tipe mobil
    public void bahanBakar(){
    System.out.println("Interface Method Implemented");
    System.out.println("KENDARAAN MEMBUTUHKAN BAHAN BAKAR");
    }
    public static void main(String[] args){
//lakukan inisialisasi
Mobil mobil = new Mobil();
// Panggil fungsi menggunakan
mobil.bahanBakar();
    }

    
}
