package com.haycal.praktikumpbo.pertemuan4.tugas;

public class Main {
    public static void main(String[] args) {
        // class object = new class()
        Kucing kc = new Kucing();
        Hewan hw = new Hewan();
        
        //menentukan nilai attribute
        kc.nama = "Kucing 1";
        kc.jmlKaki = 4;
        kc.habitat = "Darat";
        
        hw.nama = "Ayam";
        hw.jmlKaki = 2;
        
        //uji coba pemanggilan method
        kc.showInfo();
        kc.kejar("Tikus");
        kc.kejar();
        
        hw.showInfo();
}
}