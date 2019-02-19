package animalKingdom.animal;

public class Elephant extends Mammal {

    @Override
    public void reproduce() {
        System.out.println("Elephant is reproducing");

    }

    @Override
    public void walk() {
        System.out.println("Elephant is walking");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is making sound");

    }

}
