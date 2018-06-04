package modellayer;
import java.util.ArrayList;

/**
 * Write a description of interface IOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IOrder
{
    public double calcTotal(ArrayList<PartOrder> partOrders);
    
    public double getTotal();
    
    public void setTotal(ArrayList<PartOrder> partOrders);
}
