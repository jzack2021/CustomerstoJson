import java.util.List;
import java.util.Scanner;



public class viewer {
	
	/** {@value}  : no choice selected by user */
	public static final int NO_CHOICE = 0;
	/** {@value #ADDONE}  : Add one CItem to the collection of items */
    public static final int ADDONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVEL = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
  
    
	/** {@value #DISPLAYALL}  : Display CItem collection of items */
    public static final int EXIT = 8;
  
    // Object to read menu choices
    private Scanner in; 
 
    /**
     * This small version of the UI does not need the model or service objects but, in general, 
     *     references to these objects are needed in the UI. Default constructor
     *     creates a reference to Example1Service class to illustrate this.
     */
  public viewer()
  {
	  in = new Scanner(System.in);  
  }
  /**
   * This small version of the UI does not need the model or service objects but, in general, 
   *     references to these objects are needed in the UI.
   * @param example1Service reference to class which provides CItem Services
   */
   public viewer(Scanner input)
   {
	  this.in = input;
   }
   
  /**
   * Display top level menu.
   */
  public void displayMenu () {
    System.out.println();
    System.out.println("****Enter the number denoting the action " +
                       "to perform:");
    System.out.println("******ADD Customer to Customer.json   " + ADDONE);
    System.out.println("******ADD Item  to Items.json    " + TWO);
    System.out.println("*****Add Item+Customer Order Object to Orders    " + THREE);
    System.out.println("****List Customers    " + FOUR);
   // System.out.println("*****Remove Customer   " + FIVEL);
   // System.out.println("****Display Incentury   " + SIX);
   // System.out.println("*****Check It, Customers   " + SEVEN);
    System.out.println("****Exit........................" + EXIT);
    
  }

  /**
   * Read the menu choice from user.
   * @param prompt Text asking user to enter choice
   * @return 
   *  <ul>
   *    <li>{@value #ADDONE}  : Add one item to the collection of items
   *    <li>{@value #DISPLAYALL}  : Display collection of items
   *    <li>{@value #EXIT}  : Exit the program 
   * </ul>
   */
  public int readIntWithPrompt (String prompt) {
    System.out.print(prompt); 
    System.out.flush();
    int choice = in.nextInt();
    return choice;
  }
  
  

  }
  