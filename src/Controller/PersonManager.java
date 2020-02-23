package Controller;

import AddressBook.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Person> PersonList;
    private DataController dataController;

    public PersonManager() {
        dataController = new DataController();
        PersonList = dataController.read();


    }

    public void add() {

        String name = inputName();
        String stress = inputStress();
        int house = inputHouse();
        int apartment = inputApartment();
        Person person = new Person( name, stress, house, apartment);
        PersonList.add(person);
        dataController.write(PersonList);
    }

    public void delete(String name) {
        Person person = null;
        int size = PersonList.size();
        for (int i = 0; i < size; i++) {
            if (PersonList.get(i).getName().equals(name)) {
                person = PersonList.get(i);
                break;
            }
        }
        if (person != null) {
            PersonList.remove(person);
            DataController.write(PersonList);
        } else {
            System.out.printf("name = %s not existed.\n", name);
        }
    }

    public void show() {
        var Name = " Name";
        var Stress = "Stress";
        var House = "House";
        var Apartment = "Apartment";
        System.out.format("%20s | ", Name);
        System.out.format("%20s | ", Stress);
        System.out.format("%10s | ", House);
        System.out.format("%10s%n", Apartment);
        for (Person person : PersonList) {
            System.out.format("%20s | ", person.getName());
            System.out.format("%20s | ", person.getStress());
            System.out.format("%10d | ", person.getHouse());
            System.out.format("%10d%n", person.getApartment());
        }
    }

    public void findSameStress() {
        String Stress = inputStress();
        List<String> listSameStress = new ArrayList<>();
        if (PersonList.size() > 1) {
            for (int i = 0; i < PersonList.size(); i++) {

                if (PersonList.get(i).getStress().equals(Stress)) {
                    listSameStress.add(PersonList.get(i).getName());
                }
            }
            System.out.println("___list of people living on the same stress___");
            for (String str : listSameStress)
                System.out.println(str);
        }
    }

    public void findSameHouse() {
        String stress = inputStress();
        int house = inputHouse();
        List<String> listSameHouse = new ArrayList<>();
        if (PersonList.size() > 1) {
            for (int i = 0; i < PersonList.size(); i++) {

                if (PersonList.get(i).getHouse() == house
                        && PersonList.get(i).getStress().equals(stress)) {
                    listSameHouse.add(PersonList.get(i).getName());
                }
            }
            System.out.println("___list of people living in a house___");
                for (String str : listSameHouse)
                    System.out.println(str);
        }
    }

    public void changeAddress() {
        System.out.println("Input name of person whose address you want to change ");
        String name = inputName();
        delete(name);
        String stress = inputStress();
        int house = inputHouse();
        int apartment = inputApartment();
        Person person = new Person( name, stress, house, apartment);
        PersonList.add(person);
        dataController.write(PersonList);
    }

    public String inputName() {
        System.out.print("Input Person name: ");
        return scanner.nextLine();
    }

    private String inputStress() {
        System.out.println("Input Stress");
        return scanner.nextLine();
    }

    public int inputHouse() {
        System.out.print("Input person house: ");
        while (true) {
            try {
                int house = Integer.parseInt((scanner.nextLine()));
                if (house < 0) {
                    throw new NumberFormatException();
                }
                return house;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input person house again: ");
            }
        }
    }

    public int inputApartment() {
        System.out.println("Input person apartment");
        while (true) {
            try {
                int house = Integer.parseInt((scanner.nextLine()));
                if (house < 0) {
                    throw new NumberFormatException();
                }
                return house;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input person apartment again: ");
            }
        }
    }

    public int inputId() {
        System.out.println("Input person Id");
        while (true) {
            try {
                int house = Integer.parseInt((scanner.nextLine()));
                if (house < 0) {
                    throw new NumberFormatException();
                }
                return house;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input person ID again: ");
            }
        }
    }
}
