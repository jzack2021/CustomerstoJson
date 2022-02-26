import java.util.List;


import java.util.Scanner;

import java.io.FileNotFoundException;


public class ControllerOFCustomers{

	private setService atMyservice;
	private viewer view;
	private CustomersDao dao;
	private Customer Customer;
	static String Customer2;
	Scanner sc = new Scanner(System.in);
	
	static Long g;

public ControllerOFCustomers(viewer view2, setService atMyservice2) {
	this.view=view2;
	this.atMyservice=atMyservice2;	// TODO Auto-generated constructor stub
	}
public void ControllerOfCustomers(viewer view2, setService service2){
	this.view=view2;
	this.atMyservice=service2;
}

public void ControllerOfCustomers(CustomersDao dao) {
	this.dao=dao;
}
public void ControllerOfCustomers(Customer Customer) {
	this.Customer=Customer;
}
public void ControllerOfCustomers(viewer view2) {
	this.view=view2;
}

public void provideCItemAccess()throws FileNotFoundException
{
    int choice = viewer.NO_CHOICE;
 //   while (choice != viewer.EXIT) {
      view.displayMenu();
      choice = view.readIntWithPrompt("Enter choice: ");
      executeChoice(choice);
  //  }  	
}

/**
 *   Performs the branching logic to call appropriate functions to satisfy user choice
 *   @param choice represents the user selection of action they want accomplished. 
	 */
public void executeChoice (int choice) throws FileNotFoundException{
    System.out.println();
    if (choice == viewer.ADDONE)
    {
      	
   	   SetToJsonORService.setCust(sc);
   	   atMyservice.addACustomer();
    }
    if (choice == viewer.TWO)
    {
      	
   	   SetToJsonORService.setItem(sc);
   	   atMyservice.addAnItem();
    }
    if (choice == viewer.THREE)
    {
      	
   	   SetToJsonORService.setOrder(sc);
   	   atMyservice.addAnOrder();
    }
    if (choice == viewer.FOUR)
    {
      	SetToJsonORService.printCustomers();
      	SetToJsonORService.printC();
    }
    else if (choice == viewer.EXIT)
      System.out.println("Goodbye.");
  }
  




public void run() throws FileNotFoundException {
	provideCItemAccess();
	//System.out.print("Customer?");
	//SetToJsonORService.setCust(sc);
	
    
	//SetToJsonORService.SetId(sc);
	//atMyservice.addACustomer();
	
	//System.out.print("Item?");
	//SetToJsonORService.setItem(sc);
	//atMyservice.addAnItem();
   // SetToJsonORService.setOrder(sc);
	//SetToJsonORService.findCustomer();
	
	//atMyservice.addAnOrder();
	
}


}