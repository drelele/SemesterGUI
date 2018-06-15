package modellayer;
import java.util.ArrayList;

/**
 * Lav en beskrivelse af klassen OrderContainer her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class OrderContainer
{
    private static OrderContainer instance;
    private ArrayList<Order> orders;

    private OrderContainer()
    {
        orders = new ArrayList();
    }

    public static OrderContainer getInstance()
    {
        if(instance == null){
            instance = new OrderContainer();
        }
        return instance;
    }

    public void addOrder(Order order)
    {
        orders.add(order);
    }

    public Order getOrder(int orderNumber)
    {
        int index = 0;
        boolean exit = false;
        Order order = null;

        while(!exit && index < orders.size()){
            if(orderNumber == orders.get(index).getOrderNumber()){
                order = orders.get(index);
                exit = true;
            }

            index++;
        }

        return order;
    }
    
    public void deleteOrder(Order order){
        orders.remove(order);
    }
    
    public ArrayList<Order> getOrders() {
    	return orders;
    }

}
