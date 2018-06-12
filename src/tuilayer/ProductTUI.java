package tuilayer;
import java.util.Scanner;
import java.util.ArrayList;
import controllerlayer.ProductController;
import modellayer.Product;
import modellayer.Item;
/**
 * Write a description of class ProductTUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductTUI
{
    private Scanner scanner;
    private Product product;
    private Item item;
    private ProductController productController;
    
    public ProductTUI()
    {
        productController = new ProductController();
    }
    
    private void printMenu()
    {
        System.out.println("*** Product ***");
        System.out.println("(1) Opret nyt produkt");
        System.out.println("(2) Find product");
        System.out.println("(3) Opret item");
        System.out.println("(4) Slet item");
        System.out.println("(5) Opdater product");
        System.out.println("(6) Slette product");
        System.out.println("(7) Tilbage");
        System.out.print("Valg: ");
    }
    
    
    private int getInput()
    {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        try {
            input = scanner.nextInt();
            lineBreak();
        }
        catch(Exception e) {
            System.out.println("Vælg et tal fra menuen.");
            scanner.nextLine();
        }

        return input;
    }

    public void productMenu()
    {        
        boolean quit = false;
        while(!quit) {
            printMenu();
            int input = getInput();
            switch(input) {
                case 1:
                createProduct();
                break;
                case 2:
                getProduct();
                break;
                case 3:
                addItem();
                break;
                case 4:
                deleteItem();
                break;
                case 5:
                updateProduct();
                break;
                case 6:
                deleteProduct();
                break;
                case 7:
                quit = true;
                break;
                default: 
                break;
            }
            
        }
        System.out.println("Vælg et tal fra menuen.");
    }
    
    private void createProduct()
    {
        String title = getTitle();
        String description = getDescription();
        double price = getPrice();
        
        product = productController.createProduct(title, description, price);
        displayProduct(product);
    }
    
    private void getProduct()
    {
        String barcode = getBarcode();
        product = productController.getProduct(barcode);
        displayProduct(product);
    }
    
    private void updateProduct()
    {
        Scanner scanner = new Scanner(System.in);
        String decision = null;
        double intVal = 0;
        String stringVal = null;
        
        String barcode = getBarcode();
        product = productController.getProduct(barcode);
        
        try{
            do{
                String display = "\n-------------------\n" + "(1) Titel: " + product.getTitle() + "\n" +
                "(2) Beskrivelse: " + product.getDescription() + "\n" +
                "(3) Pris: " + product.getPrice() + "\n-------------------";
                System.out.println(display);
       
                System.out.print("Indtast et nummer: ");
                int number = scanner.nextInt();
                
                switch(number){
                    case 1:
                    stringVal = getTitle();
                    break;
                    case 2:
                    stringVal = getDescription();
                    break;
                    case 3:
                    intVal = getPrice();
                    default:
                    break;
                }
     
                //productController.updateProduct(product, number, intVal, stringVal);
              
                System.out.print("Vil du ændre mere. Ja eller nej: ");
                decision = scanner.next();
            }while(decision.equalsIgnoreCase("ja"));
            displayProduct(product);
        }catch(NullPointerException ex){
            System.out.println("Ingen produkt fundet.");
            lineBreak();
        }
    }
     
    private void deleteProduct()
    {
        String barcode = getBarcode();
        product = productController.getProduct(barcode);

        if(product != null){
            productController.deleteProduct(product);
            System.out.println("Slettet item:");
        }
        displayProduct(product);
    }
    
    private void addItem()
    {
        String barcode = getBarcode();
        product = productController.getProduct(barcode);
        if(product != null){
            int amount = getAmountInput();
            if(amount > 0){
                productController.addItem(product,amount);
            }
            lineBreak();
        }else{
            System.out.println("Ingen produkt fundet.");
            lineBreak();
        }
    }
    
    private void deleteItem()
    {
        String barcode = getBarcode();
        product = productController.getProduct(barcode);
      
        try{
            ArrayList<Item> items = product.getAllItems(); 
            displayProduct(product);
            System.out.println("Produktets items: ");
            
            if(!items.isEmpty()){
                for(Item i : items){
                    displayItem(i);
                }
                
                String serialCode = getSerialCode();
                item = productController.deleteItem(product,serialCode);
                
                lineBreak();
                System.out.print("Slettet item: ");
                displayItem(item);
            }else{
                System.out.println("Ingen produkter.");
                lineBreak();
            }
        }catch(NullPointerException ex){
            System.out.println("Ingen product.");
            lineBreak();
        }
    }
    
    private String getTitle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast produktets titel: ");
        return scanner.next();
    }
    
    private int getAmountInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast antal item(s): ");
        return scanner.nextInt();
    }
    
    private String getDescription()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast produktets beskrivelse: ");
        return scanner.nextLine();
    }
    
    private double getPrice()
    {

        Scanner scanner = new Scanner(System.in);
        double price = 0;
        boolean exit = false;
        do{
            System.out.print("Indtast produktets pris: ");
            try{
                price = Double.parseDouble(scanner.next());
                exit = true;
            }catch(NumberFormatException ex){
                System.out.println("Kun tal.");
                lineBreak();
            }
        }while(!exit);

        return price;
    }
        
    private String getBarcode()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scan produktets stregkode: ");
        return scanner.next();
    }
    
    private String getSerialCode()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast serienummeret på det item du ønsker at slette: ");
        return scanner.next();
    }
    
    private void displayProduct(Product product)
    {
        try{
            String display ="\n-------------------\n" + 
            "Stregkode: " + product.getBarcode() + "\n" +
            "Titel: " + product.getTitle() + "\n" +
            "Beskrivelse: " + product.getDescription() + "\n" +
            "Pris: " + product.getPrice() + "\n" +
            "Antal: " + product.getAmount() + "\n" +
            "Stock: " + product.getStock() + "\n-------------------";
            System.out.println(display);
            lineBreak();
        }catch(NullPointerException ex){
            System.out.println("Ingen produkt fundet.");
            lineBreak();
        }
    }
    
    private void displayItem(Item item)
    {
        String display ="\n-------------------\n" + 
        "Serienummer: " + item.getSerialCode() + "\n-------------------";
        System.out.println(display);
    }
    
    private void lineBreak()
    {
        System.out.print("\n");
    }
}
