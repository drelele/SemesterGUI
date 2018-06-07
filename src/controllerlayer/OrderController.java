package controllerlayer;
import modellayer.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Controller for Order.
 * 
 * @author Gruppe 2
 * @version 0.1
 */
public class OrderController
{
    private OrderContainer orderContainer;
    private PersonController personController;
    private ProductController productController;

    /**
     * Constructor.
     */
    public OrderController()
    {
        this.orderContainer = OrderContainer.getInstance();
        this.personController = new PersonController();
        this.productController = new ProductController();

        HashMap<String, Integer> barcodes = new HashMap<>();
        barcodes.put("1", 5);
        createOrder("1", "2", barcodes);
    }

    /**
     * Creates Order with association to one person and ArrayList<PartOrder>. Each PartOrder with one association to product
     * and ArrayList<Item>.
     * 
     *  @param String phone
     *  @param HashMap<String, Integer> barcodes
     *  @return Order
     */
    public Order createOrder(String phoneEmployee, String phoneCustomer, HashMap<String, Integer> barcodes)
    {
        /* Get Person */
        Person employee = personController.getPerson(phoneEmployee);
        Person customer = personController.getPerson(phoneCustomer);

        ArrayList<PartOrder> partOrders = new ArrayList<>();

        /* Create Order*/
        Order order = new Order(employee, customer, partOrders);

        /* For each entry in barcodes create PartOrder and add to partOrders */
        addPartOrders(order, barcodes);

        /* Add to OrderContainer */
        orderContainer.addOrder(order);

        return order;
    }

    /**
     * Get Order from orderContainer.
     * 
     * @param int orderNumber
     * @return Order
     */
    public Order getOrder(int orderNumber)
    {
        return orderContainer.getOrder(orderNumber);
    }

    /**
     * Updates Order. Set Person and/or add PartOrder.
     * 
     * @param Order order
     * @param String phone
     * @param HashMap<String, Integer> barcodes
     */
    public void updateOrder(Order order, String phoneEmployee, String phoneCustomer, HashMap<String, Integer> barcodes)
    {
        /* Set Person */
        order.setEmployee(personController.getPerson(phoneEmployee));
        order.setCustomer(personController.getPerson(phoneCustomer));

        /* For each entry in barcodes create PartOrder and add to partOrders */
        addPartOrders(order, barcodes);
    }

    /**
     * Creates ArrayList<PartOrder>. Each PartOrder with one association to product
     * and ArrayList<Item>.
     * 
     *  @param Order order
     *  @param HashMap<String, Integer> barcodes
     */
    public void addPartOrders(Order order, HashMap<String, Integer> barcodes)
    {
        ArrayList<PartOrder> partOrders = order.getPartOrders();

        /* For each entry in barcodes create PartOrder and add  to partOrders */
        for(String barcode : barcodes.keySet()) {
            Product product = productController.getProduct(barcode);
            int amount = barcodes.get(barcode);
            partOrders.add(new PartOrder(product, product.getItems(amount)));
        }

        /* Set total price of the Order */
        order.setTotal(partOrders);
    }

    public String updatePartOrder(Order order,int index, Integer amount)
    {
        ArrayList<PartOrder> partOrders = order.getPartOrders();
        PartOrder partOrder = partOrders.get(index);
        String title = partOrder.getProduct().getTitle();
        String result = "";

        if(amount != 0){
            partOrder.setAmount(amount);
            result = title + " mængde ændret til " + amount + "x";
        } else {
            partOrders.remove(index);
            result = title + " slettet fra salget.";  
        }

        return result;
    }

    /**
     * Empty and delete Order from orderContainer.
     * 
     * @param Order order
     */
    public void deleteOrder(Order order)
    {
        ArrayList<PartOrder> partOrders = order.getPartOrders();

        for(PartOrder partOrder : partOrders){
            partOrder.setAmount(0);
        }
        orderContainer.deleteOrder(order);
    }

	public Person getPerson(String phone) {
		return personController.getPerson(phone);
	}
	
	public Product getProduct(String barcode) {
		return productController.getProduct(barcode);
	}
}
