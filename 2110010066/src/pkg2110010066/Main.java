/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010066;
import data.Admin;
import data.Customer;
import data.Jenismobil;
import data.Mobil;
import data.Pembayaran;
import data.Laporan;
/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek dari class Admin
        Admin admin = new Admin(1, "Sambre", "SambrePETARUNX@GMAIL.", "sambrePetarunx@gmail.com", 12433450,"Sudimampir","Fuad14","Fuad12345");

        // Membuat objek dari class Customer
        Customer customer = new Customer(2,"ujang pekalongan","mamaulana@gmail",0,"simpang gusti","Ujang12","Ujang12345");
        
        // Membuat objek dari class Jenismobil
         Jenismobil jenismobil = new Jenismobil(1,"Toyota Supra");

        // Membuat objek dari class Mobil
        Mobil mobil = new Mobil(01,02,21,"Toyota","Skyline R34","2.000.000","sold");

        // Membuat objek dari class Pembayaran
        Pembayaran pembayaran = new Pembayaran(1,2,"Pembayaran telah dilakukan lewat qris Bank BRI");

        // Membuat objek dari class Laporan
        Laporan laporan = new Laporan(2,"Ujang","Toyota supra");
        

        // Menampilkan informasi objek
        admin.tampilkanInfo();
        customer.tampilkanInfo();
        jenismobil.tampilkanInfo();
        mobil.tampilkanInfo();
        pembayaran.tampilkanInfo();
        laporan.tampilkanInfo();
    }
    
}
