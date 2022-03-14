import java.io.FileNotFoundException;
import java.util.Scanner;

public class ordersController {
	//variables
	private setService OrdersService;
	Scanner sc = new Scanner(System.in);
	private viewer view;
	private OrdersDao dao3;
	private Orders Orders;
	
	
	public ordersController(viewer view3, setService OrdersService2) {
		this.view=view3;
		this.OrdersService=OrdersService2;	// TODO Auto-generated constructor stub
		}
	
	public void ordersController(viewer view2, setService OrdersService2){
		this.view=view2;
		this.OrdersService=OrdersService2;
	}

	public void ordersController(OrdersDao dao3) {
		this.dao3=dao3;
	}
	
	public void ordersController(Orders Orders) {
		this.Orders=Orders;
	}
	
	public void ordersController(viewer view2) {
		this.view=view2;
	}

}
