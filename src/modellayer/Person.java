package modellayer;

/**
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Person
{
    private String name;
    private String phone;
    private String address;
    private String city;
    private String postalCode;
    private Customer customerNumb;
    private boolean active;

    public Person(String name, String phone, String address, String city, String postalCode)
    {
        setAll(name, phone, address, city, postalCode);
    }

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return city;
    }

    public String getPostalCode ()
    {
        return postalCode;
    }

    public boolean getActive()
    {
        return active;
    }

    public void setName(String name)
    {
        this.name = name;
    } 

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }      

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public void updatePerson(String name, String phone, String address, String city, String postalCode)
    {
        setAll(name, phone, address, city, postalCode);
    }

    private void setAll(String name, String phone, String address, String city, String postalCode)
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.active = true;
    }
}
