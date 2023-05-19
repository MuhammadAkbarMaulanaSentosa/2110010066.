/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
/**
 *
 * @author Acer
 */
public class Customer {
    private int IDpelanggan;
    private String nama;
    private String Email;
    private int no;
    private String Alamat;
    private String Username;
    private String Password;
    
 public Customer(){}


    

    

    public Customer(int IDpelanggan, String nama, String Email, int no, String Alamat) {
        this(IDpelanggan, nama, Email, no, Alamat, "Ujang12", "Password");
    }

    public Customer(int IDpelanggan, String nama, String Email, int no, String Alamat, String ujang12, String password) {
        this(IDpelanggan, nama, Email, no, Alamat, "Username");
    }

    public Customer(int IDpelanggan, String nama, String Email, int no, String Alamat, String username) {
        this.IDpelanggan = IDpelanggan;
        this.nama = nama;
        this.Email = Email;
        this.no = no; 
        this.Alamat = Alamat;
        this.Username = Username;
        this.Password = Password;
    }
  
public int getIDpelanggan() {
        return IDpelanggan;
    }

public void setIDpelanggan(int IDpelanggan) {
        this.IDpelanggan = IDpelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }
    
    public void setail(String Email) {
        this.Email = Email;
    }
    
    
    public String getEmail(){
        return this.Email;
    }
    
     public int getno() {
        return no;
    }

    public void setno(int no) {
        this.no = no;
    }
    
     public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
     public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
     public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public void tampilkanInfo() {
        System.out.println("ID Pelanggan: " + IDpelanggan);
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Nomor Telepon: " + no);
        System.out.println("Email: " + Email);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Username : " + Username);
        System.out.println("Password : " + Password);
    }
    
}