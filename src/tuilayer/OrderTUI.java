package tuilayer;
import modellayer.*;
import controllerlayer.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Text User Interface for Order.
 * 
 * @author Gruppe 2
 * @version 0.1
 */
public class OrderTUI
{
    private OrderController orderController; 

    /**
     * Constructor;
     */
    public OrderTUI()
    {
        this.orderController = new OrderController();
    }

    /**
     * Get input for menu selection.
     */
    private int getInput()
    {
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            input = scanner.nextInt();
        }
        catch(Exception e) {
            System.out.println("Vælg et tal fra menuen.");
            scanner.nextLine();
        }

        return input;
    }

    /**
     * Get input for index. Used in updateProduct.
     */
    private int getIndex()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Indtast index: ");
        return scanner.nextInt();
    }

    /**
     * Get input for order number. Used in getOrder.
     */
    private int getOrderNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Indtast ordrenummer: ");
        return scanner.nextInt();
    }

    /**
     * Get input for phone. Used in createOrder and updateOrder.
     */
    private String getPhone()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Indtast telefonnummer: ");
        return scanner.nextLine();
    }

    /**
     * Get input for barcode. Used in addProduct and updateProduct.
     */
    private String getBarcode()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Indtast stregkode: ");
        return scanner.nextLine();
    }

    /**
     * Get input for amount. Used in addProduct and updateProduct.
     */
    private Integer getAmount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Indtast mængde: ");
        return scanner.nextInt();
    }

    /**
     * Print menu for Order Main Menu.
     */
    private void printMenu()
    {
        System.out.println("");
        System.out.println("*** Salg ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Opret");
        System.out.println("(2) Find");
        System.out.println("(3) Slet");
        System.out.print("Valg: ");
    }

    /**
     * Selection menu for Order Main Menu.
     */
    public void orderMenu()
    {
        boolean quit = false;
        while(!quit) {
            printMenu();
            int input = getInput();
            switch(input) {
                case 0:  
                quit = true;
                break;
                case 1: 
                createOrderMenu();
                break;
                case 2: 
                try{
                    Order order = getOrder();
                    printOrder(order);
                    updateOrderMenu(order);
                }
                catch(Exception e){
                    System.out.println("Salg findes ikke.");
                }
                break;
                case 3:
                Order orderDel = getOrder();
                orderController.deleteOrder(orderDel);
                System.out.println("Salg slettet.");
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                System.out.println("");
                break;
            }
        }
    }

    /**
     * Print menu for Create Order.
     */
    private void printCreateOrderMenu()
    {
        System.out.println("");
        System.out.println("*** Opret Salg ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Tilføj Medarbejder");
        System.out.println("(2) Tilføj Kunde");
        System.out.println("(3) Tilføj Produkt");
        System.out.println("(4) Bekræft");
        System.out.print("Valg: ");
    }

    /**
     * Selection menu for Create Order.
     */
    private void createOrderMenu()
    {
        String phoneEmployee = null;
        String phoneCustomer = null;
        HashMap<String, Integer> barcodes = new HashMap<>();
        boolean quit = false;

        while(!quit) {
            printCreateOrderMenu();
            int input = getInput();
            switch(input) {
                case 0: 
                quit = true;
                break;
                case 1: 
                phoneEmployee = addPerson();
                break;
                case 2: 
                phoneCustomer = addPerson();
                break;
                case 3: 
                addProduct(barcodes);
                break;
                case 4: 
                quit = createOrder(phoneEmployee, phoneCustomer, barcodes);
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                System.out.println("");
                break;
            }
        }

    }

    /**
     * Set phone. Used in createOrder and updateOrder.
     * 
     * @return String phone
     */
    private String addPerson()
    {
        String phone = getPhone();
        System.out.println("Person tilføjet.");
        System.out.println("");
        return phone;
    }

    /**
     * Set barcode and amount for HashMap<String, Integer> barcodes. Used in createOrder and updateOrder.
     * 
     * @return HashMap<String, Integer>
     */
    private HashMap<String, Integer> addProduct(HashMap<String, Integer> barcodes)
    {
        barcodes.put(getBarcode(), getAmount());
        System.out.println("Produkt tilføjet.");
        System.out.println("");
        return barcodes;
    }

    /**
     * Create Order passes String phone and HashMap<String, Integer> barcodes to orderController.
     * 
     * @param String phone
     * @param HashMap<String, Integer> barcodes
     */
    private Boolean createOrder(String phoneEmployee, String phoneCustomer, HashMap<String, Integer> barcodes)
    {
        Boolean quit = false;

        try{
            Order order = orderController.createOrder(phoneEmployee, phoneCustomer, barcodes);
            System.out.println("Salg oprettet.");
            System.out.println("");
            printOrder(order);
            quit = true;
        } catch(Exception e){
            System.out.println("Salg kunne ikke oprettes.");
            System.out.println("");
        }

        return quit;
    }

    /**
     * Print menu for Update Order.
     */
    private void printUpdateOrderMenu()
    {
        System.out.println("");
        System.out.println("*** Opdater Salg ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Opdater Medarbejder");
        System.out.println("(2) Opdater Kunde");
        System.out.println("(3) Opdater Produkt");
        System.out.println("(4) Tilføj Produkt");
        System.out.println("(5) Bekræft");
        System.out.print("Valg: ");
    }

    /**
     * Selection menu for Update Order.
     */
    private void updateOrderMenu(Order order)
    {
        boolean quit = false;
        String phoneEmployee = order.getEmployee().getPhone();
        String phoneCustomer = order.getCustomer().getPhone();
        HashMap<String, Integer> barcodes = new HashMap<>();

        while(!quit) {
            printUpdateOrderMenu();
            int input = getInput();
            switch(input) {
                case 0: 
                quit = true;
                break;
                case 1: 
                phoneEmployee = addPerson();  
                break;
                case 2: 
                phoneCustomer = addPerson();  
                break;
                case 3:
                updatePartOrder(order);
                break;
                case 4:
                addProduct(barcodes);
                break;
                case 5: 
                quit = updateOrder(order, phoneEmployee, phoneCustomer, barcodes);
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                System.out.println("");
                break;
            }
        }

    }

    /**
     * Update Product(PartOrder) on Order. Get input for index and amount. Passes to orderController.
     */
    private void updatePartOrder(Order order)
    {
        int index = getIndex() - 1;
        Integer amount = getAmount();

        try{
            orderController.updatePartOrder(order,index, amount);
        }catch(IndexOutOfBoundsException i){
            System.out.println("Vælg et tal fra produktlisten.");
        }catch (Exception e) {
            System.out.println("Ikke nok varer på lager.");
        }
    }

    /**
     * Update Order. Passes Order order, String phone and HashMap<String, Integer> barcodes to orderController.
     */
    private boolean updateOrder(Order order, String phoneEmployee, String phoneCustomer, HashMap<String, Integer> barcodes)
    {
        boolean quit = false;

        try{
            orderController.updateOrder(order, phoneEmployee, phoneCustomer, barcodes);
            System.out.println("Salg opdateret.");
            System.out.println("");
            printOrder(order);
            quit = true;
        } catch(Exception e){
            System.out.println("Salg kunne ikke opdateres.");
            System.out.println("");
        }

        return quit;
    }

    /**
     * Print Order
     * 
     * @param Order order
     */
    private void printOrder(Order order)
    {
        System.out.println("*** Ordrenummer: #" + order.getOrderNumber() + " ***");
        System.out.println("Medarbejder: " + order.getEmployee().getName());
        System.out.println("Kunde: " + order.getCustomer().getName());
        System.out.println("Telefon: " + order.getCustomer().getPhone());
        System.out.println("Oprettelsesdato: " + order.getCreateDate());
        System.out.println("Leveringsdato: " + order.getDeliveryDate());
        System.out.println("Total: " + order.getTotal()+ " kr.");

        ArrayList<PartOrder> partOrders = order.getPartOrders();

        for(PartOrder partOrder: partOrders) {
            System.out.print("(" + (partOrders.indexOf(partOrder) + 1) + ") " + "Produkt: " + partOrder.getProduct().getTitle());
            System.out.println(" / Mængde: " + partOrder.getAmount() + "x");
        }

        System.out.println("");
    }

    /**
     * Get Order. Get input for OrderNumber. Passes to orderController.
     */
    private Order getOrder()
    {
        return orderController.getOrder(getOrderNumber());
    }

}