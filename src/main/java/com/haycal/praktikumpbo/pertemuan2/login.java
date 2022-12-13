package com.haycal.praktikumpbo.pertemuan2;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Username : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Password : ");
        String password = input.nextLine();
        
        if(!nama.equals("haycal")){
            System.out.println("Masukan username dengan benar");
        }else if(!password.equals("1234")){
            System.out.println("Masukan Password dengan benar");
        }else{
            System.out.println("Anda Berhasil Login");
        }
    }
}
