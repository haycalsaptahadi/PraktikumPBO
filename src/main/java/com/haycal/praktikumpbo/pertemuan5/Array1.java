package com.haycal.praktikumpbo.pertemuan5;


public class Array1 {
    public static void main(String[] args) {
        //Pembuatan Array
        String[] names = new String[5];
        
        //Cek panjang array
        System.out.println("Panjang Array : " + names.length);
        
        //Memasukkan nilai ke Array
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Storm";
        
        //Menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + " : " + names[i]);
        }
    }
}
