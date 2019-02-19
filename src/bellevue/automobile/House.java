package bellevue.automobile;

public class House {

    private int HOUSE_LIMIT = 2;
    private int currentNumberOfPersons = 0;

    public boolean isHouseFull() {
        if (currentNumberOfPersons >= HOUSE_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public void addPerson() {
        if (!isHouseFull()) {
            currentNumberOfPersons++; // where they should not be able to add person if house is full.
        }else{
            System.out.println("Sorry! house is full.");
        }
    }

    public void removePerson() {
        currentNumberOfPersons--;
    }
}
