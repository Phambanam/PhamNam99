package AddressBook;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String stress;
    private int house;
    private int apartment;

    public Person(String name, String stress, int house, int apartment) {
        this.name = name;
        this.stress = stress;
        this.house = house;
        this.apartment = apartment;
    }
    public String getName() {
        return name;
    }

    public String getStress() {
        return stress;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}
