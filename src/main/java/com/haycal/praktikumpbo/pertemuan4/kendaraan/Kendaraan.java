package com.haycal.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    //attribute (variable)
    String nama;
    int jmlRoda;
    
    // Method
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + " telah dinyalakan!");
    }
    
    public void showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jml Roda : " + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo(){
        
    }
}
