package modellayer;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Order with association to one person and ArrayList<PartOrder>. Each PartOrder with one association to product
 * and ArrayList<Item>.
 * 
 * @author Gruppe 2
 * @version 0.1
 */
public class Order
{
    private static int count = 1;
    private int orderNumber;
    private String createDate;
    private String deliveryDate;
    private double total;

    private Person employee;
    private Person customer;
    private ArrayList<PartOrder> partOrders; 

    /**
     * Constructor;
     */
    public Order(Person employee, Person customer, ArrayList<PartOrder> partOrders)
    {
        orderNumber = count;
        count++;
        this.employee = employee;
        this.customer = customer;
        this.partOrders = partOrders;
        createDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        deliveryDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }

    public int getOrderNumber(){return orderNumber;}
    
    public Person getEmployee(){return this.employee;}
    
    public Person getCustomer(){return this.customer;}

    public ArrayList<PartOrder> getPartOrders(){return this.partOrders;}

    public String getCreateDate(){return createDate;}

    public String getDeliveryDate(){return deliveryDate;}

    public double getTotal(){return total;}

    public void setEmployee(Person employee){this.employee = employee;}
    
    public void setCustomer(Person customer){this.customer = customer;}

    public void setPartOrders(ArrayList<PartOrder> partOrders){this.partOrders = partOrders;}

    public void setDeliveryDate(String date){this.deliveryDate = new SimpleDateFormat(date).format(new Date());}

    public void setTotal(ArrayList<PartOrder> partOrders)
    {
        this.total = calcTotal(partOrders);
    }

    private double calcTotal(ArrayList<PartOrder> partOrders)
    {
        double total = 0;

        for(PartOrder partOrder : partOrders){
            double price = partOrder.getProduct().getPrice();
            int amount = partOrder.getAmount();
            total += price * amount;
        }

        return total;
    }

}
