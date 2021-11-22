/**
* Homework 6.
*
* @author Alex Murachev
*
* @version 22.11.2021
*/

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasilisa");
        System.out.println("Cat Vasilisa:");
        cat.run(199);
        cat.swim(1);
        
        System.out.println("-------------");
      
        Dog dog = new Dog("Baron");
        System.out.println("Dog Baron:");
        dog.run(350);
        dog.swim(8);        
    }
}

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
  
    abstract void run(int length);
    abstract void swim(int length);

    protected String name;
    
    Animal(String name) {
        this.name = name;
    }
        
    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Animal 
{
    private final int MAX_RUN_LENGTH = 200;
    Cat(String name) {
        super(name);
    }
    
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: " + length);
        else System.out.println("run: not");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: not");
    }
}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    Dog(String name) {
        super(name);
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: " + length);
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("swim: " + length);
        else System.out.println("swim: false");
    }
}

