package bellevue.automobile.polymorphism;

public class PublicClass {

    public static void main(String[] args) {
        BaseCar ferrari = new FerariCar("mansi ferrari");
        BaseCar i10 = new I10Car();

        System.out.println("name of the car is " +ferrari.carName());
        System.out.println("name of the car is "+ i10.carName());
    }


    public void printCarName(BaseCar b){

    }
}
