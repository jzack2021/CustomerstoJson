import java.util.List;


import java.util.Scanner;


public class ControllerOFCustomers {

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
public void run() {
	
	System.out.print("Customer?");
	SetToJsonORService.setCust(sc);
	System.out.print("Id?");
	//SetToJsonORService.SetId(sc);
	atMyservice.addACustomer();
}


}
