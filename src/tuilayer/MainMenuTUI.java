package tuilayer;
import java.util.Scanner;

/**
 * MainMenuTUI indeholder metoder for det overordnede Text User Interface.
 * 
 * @author  Gruppe 2
 * @version 0.1
 */
public class MainMenuTUI
{
    private OrderTUI orderTUI;
    private PersonTUI personTUI;
    private ProductTUI productTUI;

    /**
     * Konstruktør for objekter af klassen MainMenuTUI
     */
    public MainMenuTUI()
    {
        this.orderTUI = new OrderTUI();
        this.personTUI = new PersonTUI();
        this.productTUI = new ProductTUI();
        tuiMenu();
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     */
    public static void main(String args[]) {
        MainMenuTUI MainMenuTUI = new MainMenuTUI();
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     */
    private int getInput()
    {
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            input = scanner.nextInt();
        }catch(Exception e) {
            System.out.println("Vælg et tal fra menuen.");
            scanner.nextLine();
        }

        return input;
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     */
    private void printMenu()
    {
        System.out.println("");
        System.out.println("*** Main Menu ***");
        System.out.println("(0) Afslut");
        System.out.println("(1) Salg");
        System.out.println("(2) Person");
        System.out.println("(3) Produkt");

        System.out.println("Valg: ");
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     */
    public void tuiMenu()
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
                orderTUI.orderMenu();
                break;
                case 2: 
                personTUI.chooseTypeOfPersonMenu();
                break;
                case 3: 
                productTUI.productMenu();
                break;
                default: 
                System.out.println("Vælg et tal fra menuen.");
                System.out.println("");
                break;
            }
        }
    }

}
