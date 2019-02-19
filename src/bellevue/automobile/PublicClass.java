package bellevue.automobile;

public class PublicClass {

    public static void main(
        String[] args) { // public means access level static means invoked usingclass name. void ? return type. main name of the method. args is a parameters.
        House houseObject = new House();

        houseObject.addPerson();
        houseObject.addPerson();
        houseObject.addPerson();

        houseObject.removePerson();
        houseObject.removePerson();

        if (houseObject.isHouseFull()) {
            System.out.println("Home is full!!!");
        } else{
            System.out.println("Home is not full!!!");
        }
    }

}
