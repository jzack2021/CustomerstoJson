import java.util.List;


import java.util.Scanner;
import java.io.FileNotFoundException;

public class ControllerOFCustomers {

	private setService atMyservice;
	private setService atMyservice2;
	private viewer view;
	private CustomersDao dao;
	private Customer Customer;
	static String Customer2;
	Scanner sc = new Scanner(System.in);
	
	static Long g;

public ControllerOFCustomers(viewer view2, setService atMyservice2) {
	this.view=view2;
	this.atMyservice=atMyservice2;
//	this.atMyservice2=atMyservice3;
	// TODO Auto-generated constructor stub
	}
public void ControllerOFCustomers(viewer view2, setService service2){
	this.view=view2;
	this.atMyservice=service2;
}
public void ControllerOFCustomers(CustomersDao dao) {
	this.dao=dao;
}
public void ControllerOFCustomers(Customer Customer) {
	this.Customer=Customer;
}
public void ControllerOFCustomers(viewer view2) {
	this.view=view2;
}
public void run()  {
	System.out.println("entr");
	SetToJsonORService.setCust(sc);
	atMyservice.addACustomer();
}
}
