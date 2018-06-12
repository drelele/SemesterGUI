package controllerlayer;
import java.util.ArrayList;

import modellayer.*;

/**
 * Lav en beskrivelse af klassen CustomerController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class PersonController
{
    private PersonContainer personContainer;

    /**
     * Konstruktør for objekter af klassen CustomerController
     */
    public PersonController()
    {
        this.personContainer = PersonContainer.getInstance();

         personContainer.addPerson(new Employee("John", "1", "1", "1", "1"));
         personContainer.addPerson(new Customer("Lukas", "2", "1", "1", "1"));
    }

    public Person getPerson(String phone)
    {
        return personContainer.getPerson(phone);
    }
    
    /**
     * Creating a employee with given attributes if the phone does not
     * exists. And adds it to the personContainer
     * 
     * @param String name
     * @param String phone
     * @param String address
     * @param String city
     * @param String postalCode
     * @return employee
     */

    public ArrayList<Person> getAllPersons()
    {
    	return personContainer.getAllPersons();
    }

    public Person createEmployee(String name, String phone, String address, String city, String postalCode)
    {
        Person employee = null;

        if (!phoneExists(phone)){
            employee = new Employee(name, phone, address, city, postalCode);
            personContainer.addPerson(employee);
        }

        return employee;
    }

    /**
     * Creating a customer with given attributes if the phone does not
     * exists. And adds it to the personContainer
     * 
     * @param String name
     * @param String phone
     * @param String address
     * @param String city
     * @param String postalCode
     * @return customer
     */
    public Person createCustomer(String name, String phone, String address, String city, String postalCode)
    {
        Person customer = null;

        if (!phoneExists(phone)){
            customer = new Customer(name, phone, address, city, postalCode);
            personContainer.addPerson(customer);
        }

        return customer;
    }

    /**
     *  Sets true or false if person not = null.
     * 
     * @param String phone
     * @return true / false
     */
    public boolean phoneExists(String phone)
    {
        return getPerson(phone) != null; 
    }

    /**
     * Updates person information if the person is not null
     * 
     * @param Person person
     * @param String name
     * @param String phone
     * @param String address
     * @param String city
     * @param String postalCode
     * @return person
     */

    public Person updatePerson(Person person, String name, String phone, String address, String city, String postalCode)
    { 
        if (person != null){
            person.updatePerson(name, phone, address, city, postalCode);
        }
        return person;
    }

    public Person deletePerson(Person person)
    {
        personContainer.deletePerson(person);
        return person;
    }
}
