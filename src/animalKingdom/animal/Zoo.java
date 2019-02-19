package animalKingdom.animal;

public class Zoo {

    public static void main(String[] args) {
        Human mansi = new Human("Mansi");   //created new Human object whose name is mansi
        mansi.think();
        //mansi.walk();
        mansi.reproduce();
        Frog greenfrog = new Frog();
        greenfrog.jump();
        Human nikunj = new Human("nikunj");   //created new Human object whose name is mansi
        nikunj.reproduce();
        nikunj.walk();
        mansi.walk();
        nikunj.think();

    }
}
