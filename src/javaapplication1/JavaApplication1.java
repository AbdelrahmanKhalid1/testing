/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

abstract class Animal
{
    abstract public void sound();
}

class Dog extends Animal
{
    @Override
    public void sound() {
        System.out.println("Barking....");
    }
    
}

class Cat extends Animal
{
    @Override
    public void sound() {
        System.out.println("Meowing....");
    }
}

/**
 *
 * @author abdok
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal[] a = {new Cat(),new Cat(), new Dog(), new Dog(), new Cat()};
        
        for (int i = 0; i<a.length;i++)
            a[i].sound();
        
    }
    
}
