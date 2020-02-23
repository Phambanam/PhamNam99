package AddressBook;

import Controller.DataController;
import Controller.PersonManager;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int choice = 0;
       var fileName = "AddressBook.txt.txt";
       Scanner scanner = new Scanner(System.in);
       var controller = new DataController();
       var personManager = new PersonManager();
       String name ;
       do{
           ShowMenu();
           choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice){
               case 0:
                   System.out.println("Thank you for using our service");
                   break;
               case 1:
                   personManager.add();
                   break;
               case 2:
                  name = personManager.inputName();
                   personManager.delete(name);
                   break;
               case 3:
                  personManager.changeAddress();
                   break;
               case 4:
                   personManager.findSameStress();
                   break;
               case 5:
                   personManager.findSameHouse();
                   break;
               case 6:
                   personManager.show();
                   break;
           }
       }while(choice != 0);
    }
    public static void ShowMenu(){
        System.out.println("______________MENU_____________");
        System.out.println("1.Add people name and address to the AddressBook");
        System.out.println("2.Delete people name and address");
        System.out.println("3.Change the address of  person");
        System.out.println("4.list of people living on the  street");
        System.out.println("5.list of people living in the house");
        System.out.println("6.Show all inf people");
        System.out.println("0.Exit");
        System.out.println("I choose the number : ");
    }
}
