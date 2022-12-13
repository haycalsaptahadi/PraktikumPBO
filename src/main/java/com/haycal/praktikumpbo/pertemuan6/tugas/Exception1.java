package com.haycal.praktikumpbo.pertemuan6.tugas;


public class Exception1 {
    public static void main(String[] args) {
        try{
            int a = 1/0;
        }
        catch(Exception e){
            System.out.println("Ada kesalahan yang muncul");
        }
        finally{
            System.out.println("Terima kasih telah menjalankan program");
        }
    }
    
}
