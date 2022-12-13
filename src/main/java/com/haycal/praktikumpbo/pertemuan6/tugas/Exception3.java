package com.haycal.praktikumpbo.pertemuan6.tugas;

public class Exception3 {
    public static void main(String[] args) { 
        try{
            throw new Exception("kesalahan terjadi");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
