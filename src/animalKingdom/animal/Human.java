package animalKingdom.animal;

public class Human extends Mammal {

    public String name; //instance variable or object variable

    public Human(String b) {        //definition of constructor(class name and constructor are same)
        name = b;

    }

    public void think() {
        System.out.println(name + " is thinking");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " can reproduce");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " always make noise");
    }
    @Override
    public void walk() {
        System.out.println(name + " is walking");
    }
}
