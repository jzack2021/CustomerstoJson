

package Controllers;

import java.util.List;
import Service.setService;
import View.viewer;
import DAO.CustomersDao;




import Domain.Customer;

import java.util.Scanner;

import Domain.Customer;

import java.io.FileNotFoundException;


public class ControllerofCustomers{

	private setService atMyservice;
	private viewer view;
	private CustomersDao dao;
	private Customer Customer;
	static String Customer2;
	Scanner sc = new Scanner(System.in);
	
	static Long g;

public ControllerofCustomers(viewer view2, setService atMyservice2) {
	this.view=view2;
	this.atMyservice=atMyservice2;	// TODO Auto-generated constructor stub
	}
public void ControllerofCustomers(viewer view2, setService service2){
	this.view=view2;
	this.atMyservice=service2;
}

public void ControllerofCustomers(CustomersDao dao) {
	this.dao=dao;
}
public void ControllerofCustomers(Customer Customer) {
	this.Customer=Customer;
}

public void ControllerofCustomers(viewer view2) {
	this.view=view2;
}
}



