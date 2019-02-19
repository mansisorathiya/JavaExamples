package bellevue.automobile;
public class Car { // Class creation

    public static int numberOfWheels = 23;
    public static String color;                        // instance or a object variable.

    public String model;

    private String priveAccess; // instance variable.
    String packageLevelAccess;
    public String publicAccess;

    public void print(){ // object method or instance method.

    }
    public static void speed(int s)        // static method this a class method.
    {
        //System.out.println(model);
        int speed = s;
        if (speed > 100)                        // Control statement
        {
            System.out.println(" You are driving very fast" + color);
        } else {
            System.out.println("You are driving at normal speed");
        }
    }


    public Car(String b) {
        color = b;
    }

    public Car() {
    }

    public void color() { // This is a object/instance method.
        System.out.println("Model number of the Car is" + priveAccess);
        System.out.println("color of the car is  " + color);
    }

    public static void main(String args[]) {
        Car blueCar = new Car();                  // Object creation

        System.out.println(Car.numberOfWheels); // possible because it is a class or static variable.

        Car.speed(60); // this is possible because it is a class or static method.

        blueCar.color(); // possible because it is a instance method.

        System.out.println(blueCar.model); // possible because it is a instance variable.

        //ggg.color();


        //Instance invocations of the variables.
    }

}