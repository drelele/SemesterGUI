package controllerlayer;
import modellayer.*;
import java.util.HashMap;
import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Testklassen OrderControllerTest.
 *
 * @author (dit navn her)
 * @version (versionsnummer eller dato her)
 */
public class OrderControllerTest
{
    private OrderController orderController;
    private PersonController personController;
    private ProductController productController;
    
    /**
     * Standardkonstruktør for testklassen OrderControllerTest
     */
    public OrderControllerTest()
    {
        orderController = new OrderController();
        personController = new PersonController();
        productController = new ProductController();
    }

    /**
     * Opsæt test-fixtures.
     *
     * Kaldt før hver testmetode.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * River test-fixture ned.
     *
     * Kaldt efter hver testmetode.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void orderTest()
    {
        /* Set Phone for Employee and Customer */
        String phoneEmployee = "1";
        String phoneCustomer = "2";
        
        /* Create Employee and Customer */
        personController.createEmployee("Employee1", phoneEmployee, "1", "1", "1");
        personController.createCustomer("Customer1", phoneCustomer, "2", "2", "2");
        
        /* Create Product */
        productController.createProduct("Product1", "1", 100);
        
        /* Add items to Product */
        int itemsOnProduct = 5;
        Product product = productController.getProduct("1");
        product.addItem(itemsOnProduct);
        
        /* Check Product amount */
        assertEquals(itemsOnProduct, product.getAmount());
        
        /* Add Items to Order */
        Integer itemsOnOrder = 5;
        HashMap<String, Integer> barcodes = new HashMap<>();
        barcodes.put("1", itemsOnOrder);
        
        /* Create Order */
        orderController.createOrder(phoneEmployee, phoneCustomer, barcodes);
        Order order = orderController.getOrder(1);
        
        /* Get 1st PartOrder */
        PartOrder partOrder = order.getPartOrders().get(0);
        
        /* Check PartOrder amount and Product amount */
        Integer getOrderAmount = partOrder.getAmount();
        int getProductAmount = product.getAmount();
        assertEquals(itemsOnOrder, getOrderAmount);
        assertEquals((itemsOnProduct - itemsOnOrder), getProductAmount);
    }
    
    
}

