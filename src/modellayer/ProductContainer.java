package modellayer;
import java.util.ArrayList;

/**
 * Write a description of class ProductContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductContainer
{
    private static ProductContainer instance;
    private ArrayList<Product> products;
    
    private ProductContainer()
    {
        products = new ArrayList();
    }
    
    public static ProductContainer getInstance()
    {
        if(instance == null){
            instance = new ProductContainer();
        }
        return instance;
    }
        
    public void addProduct(Product product)
    {
        if(product != null){
            products.add(product);
        }
    }
    
    public Product getProduct(String barcode)
    {
        int index = 0;
        boolean exit = false;
        Product product = null;
        while(!exit && index < products.size()){
            if(barcode.equalsIgnoreCase(products.get(index).getBarcode())){
                product = products.get(index);
                exit = true;
            }
            index++;
        }
        return product; 
    }
       
    public void deleteProduct(Product product)
    {
        products.remove(product);
    }
    
    public ArrayList getProducts() 
    {
    	return products; 
    }
}
