package com.haycal.praktikumpbo.pertemuan4.tugas;


public class Hewan {
    //attribute (variable)
    String nama;
    int jmlKaki;
    
    // Method
    public void berlari(){
        System.out.println(nama + " berlari! ");
    }
    
    public void showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jml Kaki : " + jmlKaki);
        extraInfo();
    }
    
    public void extraInfo(){
        
    }
    
}
