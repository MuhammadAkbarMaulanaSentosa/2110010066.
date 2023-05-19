/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
/**
 *
 * @author Acer
 */
public class Laporan {
    private int Transaksi;
    private String customer;
    private String mobil;
    
 public Laporan(){}
 
  public Laporan(int Transaksi, String customer, String mobil){
        this.Transaksi = Transaksi;
        this.customer = customer;
        this.mobil = mobil;
  }
  
 public int getTransaksi() {
        return Transaksi;
    }

public void setTransaksi(int Transaksi) {
        this.Transaksi = Transaksi;
    }
    
    public String getcustomer() {
        return customer;
    }

public void setcustomer(String customer) {
        this.customer = customer;
    }
public String getmobil() {
        return mobil;
    }

public void setmobil(String mobil) {
        this.mobil = mobil;
    }
public void tampilkanInfo() {
        System.out.println("Transaksi : " + Transaksi);
        System.out.println("Nama customer : " + customer);
        System.out.println("Nama mobil : " + mobil);
}
    
}
