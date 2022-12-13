package com.haycal.praktikumpbo.pertemuan3.challenge;


public class Main {
    public static void main(String[] args) {
        //membuat object dari class Library
        Library perpus1 = new Library("Perpustakaan 1", 50, 2000);
        Library perpus2 = new Library("Perpustakaan 2", 20, 2001);
        Library perpus3 = new Library("Perpustakaan 3", 45, 2002);
        
        //memanggil method
        perpus1.showProfile();
        perpus2.showProfile();
        perpus3.showProfile();
        
    }
}    

