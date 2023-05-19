/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
/**
 *
 * @author Acer
 */
public class Jenismobil {
    private int IDjenis;
    private String Nama;
    
 public Jenismobil(){}
 
  public Jenismobil(int IDjenis, String Nama){
       this.IDjenis = IDjenis;
       this.Nama = Nama;
  }
    
    public int getIDjenis() {
        return IDjenis;
    }

public void setIDjenis(int IDjenis) {
        this.IDjenis = IDjenis;
    }

public String getNama() {
        return Nama;
    }

public void setNama(String Nama) {
        this.Nama = Nama;
    }

     public void tampilkanInfo() {
        System.out.println("ID jenis mobil : " + IDjenis);
        System.out.println("Nama mobil : " + Nama);

     }
}
