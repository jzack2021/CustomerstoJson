import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*; 
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class GenericController {
private JSONINFOPARCING parser;
	private setService atMyservice;
	private viewer view;
	private CustomersDao dao;
	private Customer Customer;
	static String Customer2;
	Scanner sc = new Scanner(System.in);
	TextField inText, inInt; 
	
	String nameS, ageS;
	static Long g;
	private setService ItemsService;
private setService OrdersService;
	private ItemsDao dao2;
	private Items Items;
	
	
	public GenericController(viewer view2, setService atMyservice2) {
		this.view=view2;
		this.atMyservice=atMyservice2;	// TODO Auto-generated constructor stub
		}
	public GenericController(viewer view2, setService atMyservice2, setService ItemsService2, setService OrdersService2) {
		this.view=view2;
		this.atMyservice=atMyservice2;	
		this.ItemsService=ItemsService2;// TODO Auto-generated constructor stub
	this.OrdersService=OrdersService2;	
	}

public void provideCItemAccess()throws FileNotFoundException
{
    int choice = viewer.NO_CHOICE;
    while (choice != viewer.ELEVEN
    	) {
      view.displayMenu();
      choice = view.readIntWithPrompt("Enter choice: ");
      executeChoice(choice);
    }  	
}



/**
 *   Performs the branching logic to call appropriate functions to satisfy user choice
 *   @param choice represents the user selection of action they want accomplished. 
	 */
public void executeChoice (int choice) throws FileNotFoundException{
    System.out.println();
    if (choice == viewer.ADDONE)
    {
      	//add a customer
   	   SetToJsonORService.setCustFirstName(sc);
   	   SetToJsonORService.setCustLastName(sc);
   	   SetToJsonORService.setCustZip(sc);
   	   atMyservice.addACustomer();
    }
    if (choice == viewer.TWO)
    {
      	//add an item
   	   SetToJsonORService.setItem(sc);
   	  ItemsService.addAnItem();
    }
    if (choice == viewer.THREE)
    {
    	//create an order
    	 SetToJsonORService.setCustFirstName(sc);
     	   SetToJsonORService.setCustLastName(sc);
     	   SetToJsonORService.setCustZip(sc);
     	  SetToJsonORService.setItem(sc);
   	   SetToJsonORService.setOrder(sc);
   	   OrdersService.addAnOrder();
    }
    if (choice == viewer.FOUR)
    {//view customers
    	JSONINFOPARCING.printCustomers();
      	//SetToJsonORService.printC();
    }
    
   // goign to be working on this vv gotta get my parcing right on JSON-P to eexcute the remove from the JSON file
    
   if (choice == viewer.FIVEL)
   {
	  JSONINFOPARCING.printCustomers();
	   System.out.println("^^LIST OF CUSTOMERS^^");
	   
	  JSONINFOPARCING jsoninfoparcing = new JSONINFOPARCING();
	jsoninfoparcing.parsetoRemoveCustomer();
	
	JSONINFOPARCING.printCustomers();
	System.out.println("^^&NEW CUSTOMER LIST^^");
	//  
	//  atMyservice.removeACustomer();
      	//SetToJsonORService setToJsonORService = new SetToJsonORService();
		//setToJsonORService.parceToCustomer();
      	//atMyservice.removeACustomer();
      	//SetToJsonORService.printC();
   }
   if (choice == viewer.SIX){
	   
	  JSONINFOPARCING.printItems(); 
	
   }
   if (choice == viewer.SEVEN){
	   JSONINFOPARCING jsoninfoparcing = new JSONINFOPARCING();
	   jsoninfoparcing.parsetoEditCustomer();
	
   }
	  
     if (choice == viewer.EIGHT) {
    	 JSONINFOPARCING.printOrders();
    }
     if (choice == viewer.NINE) {
    	 System.out.print("List of orders with customer names");
    	 JSONINFOPARCING.printOrders();
    	 JSONINFOPARCING.ListOrdersByCustomer();
    }
     if (choice == viewer.TEN) {
    	 JSONINFOPARCING jsoninfoparcing2 = new JSONINFOPARCING();
  	   jsoninfoparcing2.EditCustomerOrder();
}
}
}

