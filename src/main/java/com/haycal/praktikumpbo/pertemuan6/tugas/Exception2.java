package com.haycal.praktikumpbo.pertemuan6.tugas;


public class Exception2 {
    public static void main(String[] args) { 
        try{
            f();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void f() throws 
            NullPointerException,ArrayIndexOutOfBoundsException
    {
    //implementasi method
    throw new NullPointerException();
    //throw new ArrayIndexOutOfBoundsException();
    }

}
