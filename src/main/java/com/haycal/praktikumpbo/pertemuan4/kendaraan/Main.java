package com.haycal.praktikumpbo.pertemuan4.kendaraan;


public class Main {
    public static void main(String[] args) {
        // class object = new class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Motor mt = new Motor();
        
        //menentukan nilai attribute
        mb.nama = "Mitsubishi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan Misterius";
        kn.jmlRoda = 3;
        
        mt.nama = "Yamaha";
        mt.jmlRoda = 2;
        mt.maxGear = 4;
        
        //uji coba pemanggilan method
        mb.showInfo();
        mb.belok("Kanan");
        mb.belok();
        
        kn.showInfo();
        
        mt.showInfo();
        mt.kecepatan(70);
        mt.kecepatan();
        
    }
    
}
