package tuilayer;
import java.util.Scanner;
import controllerlayer.PersonController;
import modellayer.*; 

/**
 * Write a description of class PersonTUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTUI
{
    // instance variables - replace the example below with your own
    private PersonController personController;
    /**
     * Constructor for objects of class PersonTUI
     */
    public PersonTUI()
    {
        // initialise instance variables
        personController = new PersonController();
    }

    private int getInput()
    {
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            input = scanner.nextInt();
        }catch(Exception e) {
            System.out.println("Vælg et tal fra menuen.");
            scanner.nextLine();
        }

        return input;
    }

    private String getPhone()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast telefonnummer.");
        return scanner.nextLine();
    }

    private String getName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast navn.");
        return scanner.nextLine();
    }

    private String getAddress()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast addresse.");
        return scanner.nextLine();
    }

    private String getCity()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast By.");
        return scanner.nextLine();
    }

    private String getPostalCode()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast Post nummer.");
        return scanner.nextLine();
    }

    public Person getPerson(String phone)
    {
        return personController.getPerson(phone);
    }

    private Person createCustomer(String name, String phone, String address, String city, String postalCode)
    {
        return personController.createCustomer(name, phone, address, city, postalCode);
    }

    /**
     * A menu for updating person, while quit is not false run it.
     * Gets attributes values from person.getName(), getPhone(), getAddress(),getCity()
     * getPostalCode() and store it in local variables. 
     * 
     * Case 0 sets quit to true and throws you back 
     * Case 1 update name
     * Case 2 update address
     * Case 3 update city
     * Case 4 update postalCode
     * Case 5 delete Person
     * 
     * @param Person person
     * @return void
     */
    private void updatePerson(Person person)
    {

        boolean quit = false;
        while(!quit) {
            printUpdateMenu(person);

            int input = getInput();
            String name = person.getName();
            String phone = person.getPhone();
            String address = person.getAddress();
            String city = person.getCity();
            String postalCode = person.getPostalCode();
            switch(input) {
                case 0:
                quit = true;
                break;
                case 1:
                System.out.println("Nuværende navn " + person.getName());
                name = getName();
                personController.updatePerson(person, name, phone, address, city, postalCode);
                break;
                case 2:
                System.out.println("Nuværende navn " + person.getAddress());
                address = getAddress();
                personController.updatePerson(person, name, phone, address, city, postalCode);
                break;
                case 3:
                System.out.println("Nuværende navn " + person.getCity());
                city = getCity();
                personController.updatePerson(person, name, phone, address, city, postalCode);
                break;
                case 4:
                System.out.println("Nuværende navn " + person.getPostalCode());
                postalCode = getPostalCode();
                personController.updatePerson(person, name, phone, address, city, postalCode);
                break;
                case 5:
                deletePerson(person);
                quit = true;
                System.out.println("## Personen blev slettet ##");
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                break;
            }
        }

    }

    private void deletePerson(Person person)
    {
        String phone = person.getPhone();
        person = personController.getPerson(phone);

        if(person != null){
            personController.deletePerson(person);
        }
    }

    private void printMenu(String typeOfPerson)
    {
        System.out.println("*** " + typeOfPerson + " ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Opret");
        System.out.println("Valg: ");
    }

    private void printTypeOfMenu()
    {
        System.out.println("*** Person ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Kunde");
        System.out.println("(2) Medarbejder");
        System.out.println("(3) Find");
        System.out.println("Valg: ");
    }

    private void printUpdateMenu(Person person)
    {
        try{
            System.out.println("*** Ret " + person.getName() + " ***");
            System.out.println("(0) Tilbage");
            System.out.println("(1) Navn");
            System.out.println("(2) Addresse");
            System.out.println("(3) By");
            System.out.println("(4) Post nr");
            System.out.println("(5) Slet");
            System.out.println("Valg: ");
        }catch (NullPointerException e){
            System.out.println("*** Der findes ingen med dette telefonnummer ***");
            System.out.println("(0) Tilbage");
        }
    }

    /**
     * Choosing a type of person menu (Customer, Employee)
     * 
     * Case 0 sets quit to true and throws you back 
     * Case 1 runs customerMenu
     * Case 2 runs employeeMenu
     * Csae 3 finds person and makes a try catch if return type is null
     *
     */
    public void chooseTypeOfPersonMenu()
    {
        boolean quit = false;

        while(!quit)
        {
            printTypeOfMenu();
            int input = getInput();
            String phone = null;

            switch(input) {
                case 0: 
                quit = true;
                break;
                case 1:
                customerMenu();
                break;
                case 2: 
                employeeMenu();
                break;
                case 3:
                phone = getPhone();
                Person person = getPerson(phone);
                 System.out.println("### Kunde information ###");
                System.out.println("### Navn: " + person.getName());
                System.out.println("### Addresse: " + person.getAddress());
                System.out.println("### By: " + person.getCity());
                System.out.println("### Post nr: " + person.getPostalCode());
                System.out.println();
                try{
                    updatePerson(person);
                }catch (NullPointerException e){
                    quit = true;
                }
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                break;
            }
        }
    }

    /**
     * Menu for creating a employee
     * 
     * Case 0 sets quit to true and throws you back
     * Case 1 Creates a employee with the typed value for attributes and check
     * if the phone number exists.
     * 
     */
    private void employeeMenu()
    {
        String name = null;
        String phone = null;
        String address = null;
        String city = null;
        String postalCode = null;
        String typeOfPerson = "Medarbejder";
        boolean quit = false;
        while(!quit) {
            printMenu(typeOfPerson);
            int input = getInput();

            switch(input) {
                case 0:
                quit = true;
                break;
                case 1:
                name = getName();
                phone = getPhone();
                address = getAddress();
                city = getCity();
                postalCode = getPostalCode();
                if (personController.phoneExists(phone) == false){
                    personController.createEmployee(name, phone, address, city, postalCode);
                    System.out.println("Medarbejderen blev oprettet.");
                }else{
                    System.out.println("Telefon nummeret er allerrede i brug");
                }
                quit = true;
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                break;
            }
        }
    }

    /**
     * Menu for creating a customer
     * 
     * Case 0 sets quit to true and throws you back
     * Case 1 Creates a customer with the typed value for attributes and check
     * if the phone number exists.
     *
     */
    
    private void customerMenu()
    {
        String name = null;
        String phone = null;
        String address = null;
        String city = null;
        String postalCode = null;
        String typeOfPerson = "Kunde";
        boolean quit = false;
        while(!quit) {
            printMenu(typeOfPerson);
            int input = getInput();

            switch(input) {
                case 0:
                quit = true;
                break;
                case 1:
                name = getName();
                phone = getPhone();
                address = getAddress();
                city = getCity();
                postalCode = getPostalCode();
                if (personController.phoneExists(phone) == false){
                    personController.createCustomer(name, phone, address, city, postalCode);
                    System.out.println("Kunden blev oprettet.");
                }else{
                    System.out.println("Telefon nummeret er allerrede i brug");
                }
                quit = true;
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                break;
            }
        }
    }
}
