/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
/**
 *
 * @author Acer
 */
public class Pembayaran {
    private int IDkonfirmasi;
    private int IDtransaksi;
    private String bukti;    
    
public Pembayaran(){}
    
    public Pembayaran(int IDkonfirmasi, int IDtransaksi, String bukti){
        this.IDkonfirmasi = IDkonfirmasi;
        this.IDtransaksi = IDtransaksi;
        this.bukti = bukti;
        
}
    public int getIDkonfirmasi() {
        return IDkonfirmasi;
    }

public void setIDkonfirmasi(int IDkonfirmasi) {
        this.IDkonfirmasi = IDkonfirmasi;
    }

public int getIDtransaksi() {
        return IDtransaksi;
    }

public void setIDtransaksi(int IDtransaksi) {
        this.IDtransaksi = IDtransaksi;
    }
public String getbukti() {
        return bukti;
    }

public void setbukti(String bukti) {
        this.bukti = bukti;
}
public void tampilkanInfo() {
        System.out.println("ID Konfirmasi : " + IDkonfirmasi);
        System.out.println("ID Transaksi : " + IDtransaksi);
        System.out.println("Bukti transaksi : " + bukti);
}

    public void tampilkanInfopembayaran() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

