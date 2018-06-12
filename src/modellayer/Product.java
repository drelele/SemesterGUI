	package modellayer;
import java.util.ArrayList;
/**
 * Lav en beskrivelse af klassen Product her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Product
{
    private static int index = 0;
    private static int count = 1;
    private String barcode;
    private String title;
    private String description;
    private double price;
    private int amount; 
    private boolean stock;
    private ArrayList<Item> items;


    public Product(String title, String description, double price)
    {
        this.barcode = Integer.toString(count);
        count++;
        this.title = title;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.items = new ArrayList<>();
    }

    /*public Product()
    {
    this.barcode = Integer.toString(count);
    count++;
    }*/

    public String getBarcode()
    { 
        return barcode; 
    }

    public void setBarcode(String barcode)
    {
        this.barcode = barcode; 
    }

    public String getTitle()
    { 
        return title; 
    }

    public void setTitle(String title)
    {
        this.title = title; 
    }

    public String getDescription()
    { 
        return description; 
    }

    public void setDescription(String description)
    {
        this.description = description; 
    }

    public double getPrice()
    { 
        return price; 
    }

    public void setPrice(double price)
    {
        this.price = price; 
    }

    public int getAmount()
    {
        if(items != null){
            amount = items.size();
        }
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public boolean getStock()
    {
        if(amount > 0){
            stock = true;
        }else{
            stock = false;
        }
        return stock; 
    }

    public ArrayList getAllItems()
    {    
        return items;
    }

    public int addItem(int amount)
    {
        if(amount > 0){
            for(int i = 0; i < amount; i++){
                items.add(new Item());
            }
        }

        this.amount = items.size();
        return amount;
    }

    public Item getItem()
    {
        boolean exit = false;
        Item item = null;

        while(!exit && index < items.size()){
            item = items.get(index);
            exit = true;
            index++;
        }
        return item;
    }

    public ArrayList<Item> getItems(int amount)
    {
        int count = 0;
        ArrayList<Item> selectedItems = new ArrayList();
        int size = items.size();
        if(size >= amount){
            while(count < size && count < amount){
                selectedItems.add(items.get(count));
                count++;
            }

            for(int i = 0; i < amount; i++){
                items.remove(0);
            }
        }else{
            //throw new Exception();
        }
        this.amount = items.size();
        return selectedItems;
    }

    public Product updateProduct(Product product, String title, String description, double price)
    {        
    	if(product != null) {
    		product.setTitle(title);
    		product.setDescription(description);
    		product.setPrice(price);
    	}
        return product;
    }

    public Item deleteItem(String serialCode)
    {
        int index = 0;
        boolean exit = false;
        Item tmpItem = null;
        while(!exit && index < items.size()){
            if(serialCode.equalsIgnoreCase(items.get(index).getSerialCode())){
                tmpItem = items.get(index);
                items.remove(items.get(index));
                exit = true;
            }
            index++;
        }
        return tmpItem;
    }

    public void add(Item item)
    {
        items.add(item);
        this.amount = items.size();
    }
}
