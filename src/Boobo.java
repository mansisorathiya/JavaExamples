import bellevue.automobile.Car;

public class Boobo {

    public static void main(String args[]) {
        /*double invoice[][] = new double[3][2];  // Initializing array
        Scanner obj = new Scanner(System.in);    // creating a scanner object to take input from user
        for (int i = 0; i < 3; i++) {                       // nested for loops
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the value");
                invoice[i][j] = obj.nextDouble();         // store values to array
                for (int ii = 0; ii < 3; ii++) {
                    for (int jj = 0; jj < 2; jj++) {
                        System.out.println(invoice[ii][jj]);
                    }
                }
            }
        }*/

        Car mansiCar = new Car();
        // if numberOfWheels is a static variable.
        //One way to access is Car.numberOfWheels
        /// mansiCar.numberOfWheels
        System.out.println("Model of the mansi car is " + mansiCar.model);
    }
}
