package controllerlayer;
import modellayer.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Lav en beskrivelse af klassen ProductController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class ProductController
{
    private ProductContainer productContainer;
    private Product product;
    /**
     * Konstruktør for objekter af klassen ProductController
     */
    public ProductController()
    {
        this.productContainer = productContainer.getInstance();
        
        // Product product = new Product("Product 1", "Desc1", 50);
        // product.addItem(5);
        // Product product2 = new Product("Product 2", "Desc2", 150);
        // product2.addItem(5);
        // productContainer.addProduct(product);
        // productContainer.addProduct(product2);
    }

    public Product createProduct(String title, String description, double price)
    {
        product = new Product(title, description, price);
        if(product != null){
            productContainer.addProduct(product);
        }
        return product;
    }

    public int addItem(Product product,int amount)
    {
        if(product != null){
            amount = product.addItem(amount);
        }
        return amount;
    }

    public Product getProduct(String barcode)
    {
        return productContainer.getProduct(barcode);
    }

    public Product updateProduct(Product product, int number, double intVal, String stringVal)
    {
        if(product != null){
            this.product.updateProduct(product, number, intVal, stringVal);
        }
        return product;
    }

    public Product deleteProduct(Product product)
    {
        productContainer.deleteProduct(product);
        return product;
    }

    public Item deleteItem(String serialNumber)
    {
        Item item = product.deleteItem(serialNumber);
        return item;
    }
}
