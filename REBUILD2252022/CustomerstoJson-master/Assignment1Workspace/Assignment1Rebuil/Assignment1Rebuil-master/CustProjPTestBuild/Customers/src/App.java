import java.io.FileNotFoundException;

//filenotfoundexce[tion

public class App {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub


		setService atMyservice = new SetToJsonORService();
		setService ItemsService = new SetToJsonORService();
		setService OrdersService = new SetToJsonORService();
	//	setService atMyservice2 = new SetToJsonORService();
		viewer view = new viewer();
		ControllerofItems Itemcontroller = new ControllerofItems(view, ItemsService);
		ordersController orderController = new ordersController (view, OrdersService);
		ControllerOFCustomers controller = new ControllerOFCustomers(view, atMyservice);
		
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