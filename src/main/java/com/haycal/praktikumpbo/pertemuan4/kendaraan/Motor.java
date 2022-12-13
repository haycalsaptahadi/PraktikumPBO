package com.haycal.praktikumpbo.pertemuan4.kendaraan;


public class Motor extends Kendaraan {
    int maxGear;
    
    public void kecepatan(int speed){
        System.out.println("Motor " + nama + " melaju dengan kecepatan " + speed + "km/jam");
    }
    
    public void kecepatan(){
        System.out.println("Error! Mohon masukkan kecepatan!");
    }
    
    public void extraInfo(){
        System.out.println("Max gear : " + maxGear);
    }
    
}
