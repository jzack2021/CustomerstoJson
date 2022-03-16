

import java.io.FileNotFoundException;
import Service.setService;
import Service.JSONINFOPARCING;
import Service.SetToJsonORService;

import View.viewer;
import SetDAO.GenericCustSetDAO;
import SetDAO.GenericItemsSetDAO;
import SetDAO.GenericOrdersSetDAO;
import Domain.Customer;
import Domain.Items;
import Domain.Orders;
import DAO.CustomersDao;
import DAO.ItemsDao;
import DAO.JsonDao;
import DAO.OrdersDao;
import Controllers.ControllerofCustomers;
import Controllers.ControllerofItems;
import Controllers.ControllerofOrders;
import Controllers.GenericController;


import View.viewer;
import SetDAO.GenericCustSetDAO;
import Domain.Customer;
import DAO.JsonDao;

public class Main{


	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		

		setService atMyservice = new SetToJsonORService();
		setService ItemsService = new SetToJsonORService();
		setService OrdersService = new SetToJsonORService();
	//	setService atMyservice2 = new SetToJsonORService();
		
		viewer view = new viewer();
		
		
		
		ControllerofItems Itemcontroller = new ControllerofItems(view, ItemsService);
		
		ControllerofOrders orderController = new ControllerofOrders (view, OrdersService);
		
		ControllerofCustomers controller = new ControllerofCustomers(view, atMyservice);
		
		//*****
		
		GenericController Base = new GenericController(view,
				//customers service
				atMyservice, 
				//items controller
				ItemsService, 
				//order controller
				OrdersService);
	
		
		//*****
		
		
		Base.provideCItemAccess();
		JSONINFOPARCING parser = new JSONINFOPARCING();
		
		
	
		
		
		//ResponseButton Button = new ResponseButton();
		//controller.run();
		
		
	
	}

}