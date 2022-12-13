package com.haycal.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        int number, nilai;
        float rata, jml_nilai;
        //Deklarasi Scanner utk user input
        Scanner input = new Scanner(System.in);
        
        //Membuat agar penjang array ditentukan oleh user
        System.out.println("--Program Input Nilai--");
        System.out.print("Masukan jumlah Mata Kuliah : ");
        int jml = input.nextInt();
        System.out.println();
        
        // Membuat array baru dengan panjang sesuai inputan user
        number = 1;
        jml_nilai=0;
        //Memasukan nilai ke array
        while(number <= jml){
            System.out.print("Nilai ke " + number + " : ");
            nilai = input.nextInt();
            jml_nilai += nilai;
            number ++;
        }
        //Menampilkan jumlah nilai dan rata-rata nilai
        System.out.println("Total Nilai : " + jml_nilai);
        rata = jml_nilai / jml;
        System.out.println("Rata-rata Nilai : " + rata  );
    }
}