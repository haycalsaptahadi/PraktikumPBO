package com.haycal.praktikumpbo.pertemuan3.animal;


public class Main {
    public static void main(String[] args) {
        //membuat object dari class animal
        Animal cat = new Animal("Miyu", 3, "Black");
        Animal dog = new Animal("Dog", 2, "Brown");
        Animal rabbit = new Animal("Rabbit", 1, "white");
        
        //memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("Blacky");
        System.out.println("Dog's name (after) : " + dog.getName());
     
    }
}
