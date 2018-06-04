package modellayer;
import java.util.Random;

/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer extends Person
{
    private int customerNumber;
    
    public Customer(String name, String phone, String address, String city, String postalCode)
    {
        super(name, phone, address, city, postalCode);
        customerNumber = getRandCustomerNumber();
    }
    
    /**
     * Creating a random customerNumber. starts at 500 and gives it a number from 500 - 5500.
     * @return int
     */
    private int getRandCustomerNumber()
    {
        Random random = new Random();
        int next =  random.nextInt(5000) + 500;
        return next;
    }

    public int getCustomerNumber()
    {
        return customerNumber;
    }
}
