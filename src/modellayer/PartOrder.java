package modellayer;
import java.util.ArrayList;

/**
 * PartOrder with one association to product and ArrayList<Item>.
 * 
 * @author Gruppe 2
 * @version 0.1
 */
public class PartOrder
{
    private Product product;
    private int amount;
    private ArrayList<Item> items;

    /**
     * Constructor.
     */
    public PartOrder(Product product, ArrayList<Item> items)
    {
        this.items = items;
        this.product = product;
        this.amount = items.size();
    }

    public Product getProduct(){return this.product;}

    public Integer getAmount(){return this.amount;}

    public ArrayList<Item> getItems(){return this.items;}

    public void addItem(Item item)
    {
        if(item != null){
            items.add(item);
        }
    }

    public void setAmount(Integer amount)
    {
        Integer oldAmount = this.amount;

        if(amount >= oldAmount){
            items.addAll(product.getItems(amount - oldAmount));
        } else {
            int size = items.size() - 1;
            for(int i = size; i >= amount; i--){
                product.add(items.get(i));
                items.remove(i);
            }
        }

        this.amount = items.size();
    }

}
