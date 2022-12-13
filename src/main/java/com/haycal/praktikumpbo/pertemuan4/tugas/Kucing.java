package com.haycal.praktikumpbo.pertemuan4.tugas;


public class Kucing extends Hewan {
    String habitat;
    
    public void kejar(String mangsa){
        System.out.println(nama + " mengejar " + mangsa + "!");
    }
    
    public void kejar(){
        System.out.println("Error! Mohon masukkan mangsa!");
    }
    
    public void extraInfo(){
        System.out.println("Habitat : " + habitat);
    }
}
