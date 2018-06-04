package modellayer;
import java.util.Random;

/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    // instance variables - replace the example below with your own
    private int employeeNumber;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name, String phone, String address, String city, String postalCode)
    {
        super(name, phone, address, city, postalCode);
        employeeNumber = getRandEmpolyeeNumber();
    }

    /**
     * Creating a random employeeNumber. starts at 100 and gives it a number from 100 - 400.
     * @return int
     */
    
    private int getRandEmpolyeeNumber()
    {
        Random random = new Random();
        int next =  random.nextInt(300) + 100;
        return next;
    }
    
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }

}