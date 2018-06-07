package modellayer;
import java.util.ArrayList;

/**
 * Write a description of class CustomerContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonContainer 
{
    private ArrayList<Person> persons;
    private static PersonContainer instance;

    public PersonContainer()
    {
        persons = new ArrayList();
    }

    public static PersonContainer getInstance()
    {
        if(instance == null){
            instance = new PersonContainer();
        }
        return instance; 
    }

    /**
     * Finds a Person by looping through the array until it finds a match
     * 
     * @param String phone 
     * @return Person
     */
    public Person getPerson(String phone)
    {
        int index = 0;
        boolean exit = false;
        Person person = null;
        while(!exit && index < persons.size()){
            Person currentPerson = persons.get(index);
            if(phone != null && phone.equalsIgnoreCase(currentPerson.getPhone())){
                person = persons.get(index);
                exit = true;
            } 
            index++;

        }
        return person;
    }
    


    public void addPerson(Person person)
    {
        if(person!= null){
            persons.add(person);
        }
    }

    public Person deletePerson(Person person)
    {
        persons.remove(person);
        return person;
    }
}
