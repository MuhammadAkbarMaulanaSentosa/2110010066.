/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


/**
 *
 * @author Acer
 */
public class Mobil {
    private int IDmobil;
    private int IDjenis;
    private int NOmobil;
    private String Merk;
    private String Namamobil;
    private String Harga;
    private String status;

public Mobil(){}


    public Mobil(int IDmobil, int IDjenis, int NOmobil, String Merk, String Namamobil, String Harga, String status) {
        this.IDmobil = IDmobil;
        this.IDjenis = IDjenis;
        this.NOmobil = NOmobil;
        this.Merk = Merk; 
        this.Namamobil = Namamobil;
        this.Harga = Harga;
        this.status = status;
    }
  
  public int getIDmobil() {
        return IDmobil;
    }

public void setIDmobil(int IDmobil) {
        this.IDmobil = IDmobil;
    }

public int getIDjenis() {
        return IDjenis;
    }

public void setIDjenis(int IDjenis) {
        this.IDjenis = IDjenis;
    }

public int getNOmobil() {
        return NOmobil;
    }

public void setNOmobil(int NOmobil) {
        this.NOmobil = NOmobil;
    }
public String getMerk() {
        return Merk;
    }

public void setMerk(String Merk) {
        this.Merk = Merk;
    }
public String getNamamobil() {
        return Namamobil;
    }

public void setNamamobil(String Namamobil) {
        this.Namamobil = Namamobil;
    }
public String getHarga() {
        return Harga;
    }

public void setHarga(String Harga) {
        this.Harga = Harga;
    }
public String getstatus() {
        return status;
    }

public void setstatus(String status) {
        this.status = status;
    }
public void tampilkanInfo() {
        System.out.println("Masukkan ID mobil : " + IDmobil);
        System.out.println("Masukkan ID jenis : " + IDjenis);
        System.out.println("Nomor plat mobil : " + NOmobil);
        System.out.println("Merk : " + Merk);
        System.out.println("nama mobil : " + Namamobil);
        System.out.println("Harga sewa : " + Harga);
        System.out.println("Status mobil : " + status);
    
    }


}
