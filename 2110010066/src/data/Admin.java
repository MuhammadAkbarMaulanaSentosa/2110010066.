/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Acer
 */
public class Admin {
    private int IDadmin;
    private String Nama;
    private String Email;
    private int telp;
    private String Alamat;
    private String Username;
    private String Password;
    

public Admin(){}
 
  public Admin(int IDadmin, String Nama, String email, String Email, int telp, String alamat, String username, String password){
        this.IDadmin = IDadmin;
        this.Nama = Nama;
        this.Email = Email;
        this.telp = telp; 
        this.Alamat = Alamat;
        this.Username = Username;
        this.Password = Password;
}
  
public int getIDadmin() {
        return IDadmin;
    }

public void setIDadmin(int IDadmin) {
        this.IDadmin = IDadmin;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    public String getemail(){
        return this.Email;
    }
    
     public int gettelp() {
        return telp;
    }

    public void settelp(int telp) {
        this.telp = telp;
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
        System.out.println("ID Admin: " + IDadmin);
        System.out.println("Nama Admin: " + Nama);
        System.out.println("Nomor Telepon: " + telp);
        System.out.println("Email: " + Email);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Username : " + Username);
        System.out.println("Password : " + Password);
    }
    }
