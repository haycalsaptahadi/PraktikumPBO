package com.haycal.praktikumpbo.pertemuan5.tugas;


public class Tugas1 {
    public static void main(String[] args) {
        
        //Pembuatan Array
        String[] buah = new String[3];
        
        //Cek panjang array
        System.out.println("Panjang Array : " + buah.length);
        
        //Memasukkan nilai ke Array
        buah[0] = "Mangga";
        buah[1] = "Anggur";
        buah[2] = "Pepaya";
        
        //Menampilkan semua nilai array
        for(int i=0; i<buah.length; i++){
            System.out.println(i+1 + " : " + buah[i]);
        }
    }
}
